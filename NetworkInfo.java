import java.net.NetworkInterface;
import java.net.InetAddress;
import java.util.Enumeration;
public class NetworkInfo{
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface intf = interfaces.nextElement();
                System.out.println(intf.getName()+":");
                Enumeration<InetAddress> addresses = intf.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    InetAddress address = addresses.nextElement();
                    System.out.println(address.getHostAddress());
                }
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
}


