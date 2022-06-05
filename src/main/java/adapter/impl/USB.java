package adapter.impl;
import adapter.UsbPortable;

public class USB implements UsbPortable {
    @Override
    public String read() {
        return "I`m USB and you?!";

    }
}
