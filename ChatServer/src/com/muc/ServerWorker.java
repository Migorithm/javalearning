package ChatServer.src.com.muc;

import java.io.*;
import java.net.Socket;
import java.util.Date;

public class ServerWorker extends Thread{

    private final Socket clientSocket;


    public ServerWorker(Socket clientSocket) {
        this.clientSocket = clientSocket;

    }

    @Override
    public void run(){
        try {
            handleClientSocket();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void handleClientSocket() throws IOException, InterruptedException {
        InputStream inputStream = clientSocket.getInputStream();//to get access to input stream to read data
        OutputStream outputStream = clientSocket.getOutputStream(); //to get data from client.

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while((line=reader.readLine())!= null){
            if ("quit".equalsIgnoreCase(line)) {
                break;
            }
            String msg = "You typed :" + line + "\n";
            outputStream.write(msg.getBytes());
        }

        clientSocket.close();

        }
}
