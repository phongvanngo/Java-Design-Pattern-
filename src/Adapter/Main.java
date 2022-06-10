package Adapter;

import Adapter.Adapter.TranslateAdapter;
import Adapter.Target.ClientTarget;

public class Main {
    public static void main() {
        ClientTarget client = new TranslateAdapter();
        client.send("hello every body");
    }
}
