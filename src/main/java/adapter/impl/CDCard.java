package adapter.impl;

import adapter.ICard;

public class CDCard implements ICard {
    @Override
    public String read() {
        return "I`m CD-card and you're not!";
    }
}
