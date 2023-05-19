package oop.inheritance.tpv.ingenico;

import oop.inheritance.data.CommunicationType;
import oop.inheritance.tpv.*;

public class IngenicoDeviceFactory extends TpvDeviceFactory {

    private final Display display = new IngenicoDisplayAdapter();
    private final Keyboard keyboard = new IngenicoKeyboardAdapter();
    private final CardSwipper cardSwipper = new IngenicoCardSwipperAdapter();
    private final ChipReader chipReader = new IngenicoChipReaderAdapter();
    private final Printer printer = new IngenicoPrinterAdapter();
    private final Communication communication;

    public IngenicoDeviceFactory (CommunicationType communicationType) {
        switch (communicationType) {
            case MODEM -> communication = new IngenicoModemAdapter();
            case GPS -> communication = new IngenicoGPSAdapter();
            case ETHERNET -> communication = new IngenicoEthernetAdapter();
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
        return new IngenicoTransactionAdapter();
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
