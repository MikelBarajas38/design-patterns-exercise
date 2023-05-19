package oop.inheritance.tpv.verifone;

import oop.inheritance.tpv.Display;
import oop.library.ingenico.services.IngenicoDisplay;
import oop.library.v240m.VerifoneV240mDisplay;

public class VerifoneDisplayAdapter implements Display {

    VerifoneV240mDisplay display = new VerifoneV240mDisplay();

    @Override
    public void print(int x, int y, String message) {
        display.print(x, y, message);
    }

    @Override
    public void clear() {
        display.clear();
    }
}
