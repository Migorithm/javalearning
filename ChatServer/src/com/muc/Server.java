package ChatServer.src.com.muc;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server extends Thread {
    private final int serverport;
    private ArrayList<ClientThread> workerList = new ArrayList<>();

    public Server(int serverPort) {
        this.serverport = serverPort;

    }
    public List<ClientThread> getWorkerList(){  //getter for workerlist  =  lists of threads
        return workerList;
    }


    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(serverport); //Create a server socket. parameter for serverSocket is a port.
            while(true) {     //as you are to continuosly accpept client- > while(true)
                System.out.println("About to accept client connection...");
                Socket clientSocket = serverSocket.accept();

                // this is one that actually creates connection between server and the client. no connection -> blocked
                System.out.println("Accepted connection from "+clientSocket);
                //-> this will return client port and server port

                ClientThread worker = new ClientThread(this,clientSocket);
                workerList.add(worker);

                worker.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void removeWorker(ClientThread clientThread) {
        workerList.remove(clientThread);
    }
}
