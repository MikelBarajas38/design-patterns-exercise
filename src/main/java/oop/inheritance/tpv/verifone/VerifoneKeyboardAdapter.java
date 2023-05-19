package oop.inheritance.tpv.verifone;

import oop.inheritance.tpv.Keyboard;
import oop.library.v240m.VerifoneV240mKeyboard;

public class VerifoneKeyboardAdapter implements Keyboard {

    VerifoneV240mKeyboard keyboard = new VerifoneV240mKeyboard();

    @Override
    public String getChar() {
        return keyboard.get();
    }

    @Override
    public String getLine() {
        return keyboard.get();
    }

}
