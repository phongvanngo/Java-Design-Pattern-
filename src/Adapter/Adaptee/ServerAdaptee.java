package Adapter.Adaptee;

public class ServerAdaptee {
    public void receive(Payload mess) {
        System.out.println("server receive: " + mess.message);
    }
}
