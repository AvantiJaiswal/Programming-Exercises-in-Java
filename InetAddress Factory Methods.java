import java.net.*;

class InetAddressTest
{
    public static void main(String args[]) throws UnknownHostException{
        InetAddress Address = InetAddress.getLocalHost();              //returns object that represents the local host.
        System.out.println(Address);
        Address = InetAddress.getByName("google.com");                 //returns IP address for the host name passed.
        System.out.println(Address);
        InetAddress SW[] = InetAddress.getAllByName("github.com");
        for (int i=0; i<SW.length; i++)
            System.out.println(SW[i]);  
    }
}
