package fc.java.part4;

import fc.java.poly.Radio;
import fc.java.poly.RemoteControl;
import fc.java.poly.TV;

public class InterfaceTest {
    public static void main(String[] args) {
        RemoteControl r = new Radio();
        r.ChannelDown();
        r.ChannelUp();
        r.VolUp();
        r.VolDown();
        r = new TV();
        r.ChannelDown();
        r.ChannelUp();
        r.VolUp();
        r.VolDown();
    }
}
