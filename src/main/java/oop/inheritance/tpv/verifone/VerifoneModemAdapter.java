package oop.inheritance.tpv.verifone;

import oop.inheritance.tpv.Communication;
import oop.inheritance.tpv.Transaction;
import oop.inheritance.tpv.TransactionResponse;
import oop.library.v240m.VerifoneV240mModem;

public class VerifoneModemAdapter implements Communication {

    VerifoneV240mModem communication = new VerifoneV240mModem();

    @Override
    public boolean open() {
        return communication.open();
    }

    @Override
    public boolean send(Transaction message) {
        byte[] byteMessage = message.toString().getBytes();
        return communication.send(byteMessage);
    }

    @Override
    public TransactionResponse receive() {
        communication.receive();
        return new VerifoneTransactionResponseAdapter();
    }

    @Override
    public void close() {
        communication.close();
    }

}
