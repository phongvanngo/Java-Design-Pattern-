package Adapter.Adapter;

import Adapter.Adaptee.Payload;
import Adapter.Adaptee.ServerAdaptee;
import Adapter.Target.ClientTarget;

public class TranslateAdapter implements ClientTarget {
    private ServerAdaptee server = new ServerAdaptee();

    @Override
    public void send(String mess) {
        Payload payload = new Payload(mess);
        server.receive(payload);
    }
}
