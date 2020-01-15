package Strings.DefangingIPAddress;

public class DefangingIPAddress {

    public static void main(String [] args) {

        String address = "255.100.50.0";
        System.out.println("Defanged: " + defangIPaddr(address));

    }

    public static String defangIPaddr(String address) {
        String ip = address.replace(".", "[.]");
        return ip;
    }

}
