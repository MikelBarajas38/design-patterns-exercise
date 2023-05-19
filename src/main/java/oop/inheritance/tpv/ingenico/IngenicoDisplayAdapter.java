package oop.inheritance.tpv.ingenico;

import oop.inheritance.tpv.Display;
import oop.library.ingenico.services.IngenicoDisplay;

public class IngenicoDisplayAdapter implements Display {

    IngenicoDisplay display = new IngenicoDisplay();

    @Override
    public void print(int x, int y, String message) {
        display.showMessage(x, y, message);
    }

    @Override
    public void clear() {
        display.clear();
    }
}
