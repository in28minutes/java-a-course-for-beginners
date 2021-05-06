import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(5000)){
            System.out.println("listening to port:5000");
            Socket clientSocket = serverSocket.accept();
            System.out.println(clientSocket+" connected.");
            DataInputStream dataInputStream = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());

            byte[] buffer = new byte[64*1024];      // socket limit
            int bytes = dataInputStream.read(buffer,0,buffer.length);
            FileOutputStream fileOutputStream = new FileOutputStream("NewFile.pdf");
            fileOutputStream.write(buffer,0,bytes);

            System.out.println("Bytes Received: "+ bytes);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
