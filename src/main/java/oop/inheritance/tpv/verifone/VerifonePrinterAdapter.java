package oop.inheritance.tpv.verifone;

import oop.inheritance.tpv.Printer;
import oop.library.v240m.VerifoneV240mPrinter;

public class VerifonePrinterAdapter implements Printer {

    VerifoneV240mPrinter printer = new VerifoneV240mPrinter();

    @Override
    public void print(int x, String message) {
        printer.print(x, message);
    }

    @Override
    public void lineFeed() {
        printer.lineFeed();
    }
}
