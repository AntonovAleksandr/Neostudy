package adapter;

public class Computer {

    public String connect(UsbPortable usb){
        return "USB port E information:" + usb.read();
    };
}
