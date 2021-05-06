import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try(Socket socket = new Socket("localhost",5000)){
            BufferedReader iStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter oStream = new PrintWriter(socket.getOutputStream(),true);
            Scanner scanner = new Scanner(System.in);

            while(true){
                System.out.print("input> ");
                String message = scanner.nextLine();

                oStream.println(message);
                if(message.equalsIgnoreCase("exit")){
                    String response = iStream.readLine();
                    System.out.println(response);
                    break;
                }
            }

        }catch (Exception e){
            System.out.println("error: "+e.getMessage());
        }
    }
}
