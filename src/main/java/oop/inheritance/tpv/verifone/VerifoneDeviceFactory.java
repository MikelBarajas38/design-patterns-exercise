package oop.inheritance.tpv.verifone;

import oop.inheritance.data.CommunicationType;
import oop.inheritance.tpv.*;
import oop.inheritance.tpv.ingenico.IngenicoDisplayAdapter;

public class VerifoneDeviceFactory extends TpvDeviceFactory {

    private final Display display = new VerifoneDisplayAdapter();
    private final Keyboard keyboard = new VerifoneKeyboardAdapter();
    private final CardSwipper cardSwipper = new VerifoneCardSwipperAdapter();
    private final ChipReader chipReader = new VerifoneChipReaderAdapter();
    private final Printer printer = new VerifonePrinterAdapter();
    private final Communication communication;

    public VerifoneDeviceFactory(CommunicationType communicationType) {
        switch (communicationType) {
            case MODEM -> communication = new VerifoneModemAdapter();
            case GPS -> communication = new VerifoneGPSAdapter();
            case ETHERNET -> communication = new VerifoneEthernetAdapter();
            default -> communication = null;
        }
    }

    @Override
    public Display getDisplay() {
        return display;
    }

    @Override
    public Keyboard getKeyboard() {
        return keyboard;
    }

    @Override
    public CardSwipper getCardSwipper() {
        return cardSwipper;
    }

    @Override
    public ChipReader getChipReader() {
        return chipReader;
    }

    @Override
    public Transaction getTransaction() {
        return new VerifoneTransactionAdapter();
    }

    @Override
    public Communication getCommunication() {
        return communication;
    }

    @Override
    public Printer getPrinter() {
        return printer;
    }

}
