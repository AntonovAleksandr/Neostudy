package adapter;

import adapter.impl.CDCard;

public class CardReader implements UsbPortable {
    private CDCard cd;

    public CardReader(CDCard cd) {
        this.cd = cd;
    }

    @Override
    public String read() {
        return cd.read();
    }

}
