import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        try(Socket socket = new Socket("localhost",5000)) {
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            FileInputStream fileInputStream = new FileInputStream("path/to/File.pdf");
            byte[] buffer = new byte[64*1024];      // socket limit
            int bytes = fileInputStream.read(buffer,0,buffer.length);
            dataOutputStream.write(buffer,0,bytes);

            System.out.println("Bytes Sent: " + bytes);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
