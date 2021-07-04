package ChatServer.src.com.muc;

import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class ClientThread extends Thread {

    private final Socket clientSocket;
    private final Server server;
    private String login = null;
    private OutputStream outputStream;

    public ClientThread(Server server, Socket clientSocket) {
        this.server = server;
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
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
        this.outputStream = clientSocket.getOutputStream(); //to get data from client.

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line; //container to get user input.
        while ((line = reader.readLine()) != null) {
            String[] tokens = StringUtils.split(line);

            if (tokens != null && tokens.length > 0) { //to make sure those token doesn't cause any no pointer exception.
                String cmd = tokens[0]; // first token is going to be our command.
                if ("logoff".equals(cmd) || "quit".equalsIgnoreCase(cmd)) {
                    //to check whether the line is the same as "quit" regardless of capital or minor.
                    handleLogoff();
                    break;
                } else if ("login".equalsIgnoreCase(cmd)) {
                    handleLogin(outputStream, tokens);
                } else {
                    String msg = "unknown " + cmd + "\n";
                    //if we don't recognize that command, give error back to client.
                    outputStream.write(msg.getBytes());
                }
            }
        }
        clientSocket.close();
    }

    private void handleLogoff() throws IOException {
        List<ClientThread> workerList = server.getWorkerList();

        //send other lone users current user's status
        String onlineMsg = "Offline "  + login + "\n";
        for (ClientThread worker : workerList) {
            if (!login.equals(worker.getLogin())) {
                worker.send(onlineMsg);
            }
        }
        clientSocket.close();
    }

    public String getLogin(){
        return login;
    }

    private void handleLogin(OutputStream outputStream, String[] tokens) throws IOException {
        System.out.println("Dd");
        if (tokens.length == 3) {
            String login = tokens[1];
            String password = tokens[2];
            if ((login.equals("guest") && password.equals("guest")) || (login.equals("jim") && password.equals("jim"))) {
                String msg = "Ok login\n";
                outputStream.write(msg.getBytes());
                this.login = login;
                System.out.println("User logged in successfully: " + login);

                List<ClientThread> workerList = server.getWorkerList();

                //send current user al other onlin logins
                for (ClientThread worker : workerList){

                    if(worker.getLogin() != null) {
                        if (!login.equals(worker.getLogin())) {
                            String msg2 = "Online " + worker.getLogin() + "\n";
                            this.send(msg2);
                    }

                    }
                }

                //send other lone users current user's status
                String onlineMsg = "Online " + login + "\n";
                for (ClientThread worker : workerList) {
                    if (!login.equals(worker.getLogin())) {
                        worker.send(onlineMsg);
                    }
                }
            }else {
                String msg = "Error login\n";
                outputStream.write(msg.getBytes());
        }
        }
        }


    private void send(String msg) throws IOException {
        if (login != null) {
            outputStream.write(msg.getBytes());
        }

    }
}