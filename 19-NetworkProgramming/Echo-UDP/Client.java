import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte[] inData = new byte[1024];
        byte[] outData = new byte[1024];
        try(DatagramSocket socket = new DatagramSocket()){
            InetAddress address = InetAddress.getLocalHost();
            while (true){
                System.out.print("input> ");
                String message = scanner.nextLine();
                outData = message.getBytes();
                DatagramPacket packet = new DatagramPacket(outData,outData.length,address,5000);
                socket.send(packet);
                if(message.equalsIgnoreCase("exit")){
                    packet = new DatagramPacket(inData, inData.length);
                    socket.receive(packet);
                    String response = new String(inData,0,packet.getLength());
                    System.out.println(response);
                    break;
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
