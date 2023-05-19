package oop.inheritance.tpv;

import oop.inheritance.data.CommunicationType;
import oop.inheritance.data.SupportedTerminal;
import oop.inheritance.tpv.ingenico.IngenicoDeviceFactory;
import oop.inheritance.tpv.verifone.VerifoneDeviceFactory;

public abstract class TpvDeviceFactory {

    public abstract Display getDisplay();

    public abstract Keyboard getKeyboard();

    public abstract CardSwipper getCardSwipper();

    public abstract ChipReader getChipReader();

    public abstract Transaction getTransaction();

    public abstract Communication getCommunication();

    public abstract Printer getPrinter();

    //TODO: add cardProvider

    public static TpvDeviceFactory getFactory(SupportedTerminal supportedTerminal, CommunicationType communicationType) {
        return switch(supportedTerminal) {
            case VERIFONE -> new VerifoneDeviceFactory(communicationType);
            case INGENICO -> new IngenicoDeviceFactory(communicationType);
        };
    }

}
