import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(5000)){
            System.out.println("listening to port:5000");
            Socket clientSocket = serverSocket.accept();
            System.out.println(clientSocket+" connected.");
            BufferedReader iStream = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter oStream = new PrintWriter(clientSocket.getOutputStream(),true);

            while (true){
                String message = iStream.readLine();
                System.out.println("client: "+message);
                if(message.equalsIgnoreCase("exit")){
                    oStream.println("connection closed.");
                    System.out.println("connection closed.");
                    break;
                }
            }

        } catch (Exception e){
            System.out.println("error: "+e.getMessage());
        }
    }
}
