import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {
    public static void main(String[] args) {
        byte[] inData = new byte[1024];
        byte[] outData = new byte[1024];
        try(DatagramSocket socket = new DatagramSocket(5000)){
            System.out.println("listening to port:5000");

            while (true){
                DatagramPacket packet = new DatagramPacket(inData,inData.length);
                socket.receive(packet);

                InetAddress address = packet.getAddress();
                int port = packet.getPort();

                String message = new String(inData,0,packet.getLength());
                System.out.println("client@"+port+": "+message);

                if(message.equalsIgnoreCase("exit")){
                    String response = "connection closed.";
                    outData = response.getBytes();
                    packet = new DatagramPacket(outData,outData.length,address,port);
                    socket.send(packet);
                }
            }

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
