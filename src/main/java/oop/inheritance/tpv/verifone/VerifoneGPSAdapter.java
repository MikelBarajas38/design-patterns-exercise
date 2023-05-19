package oop.inheritance.tpv.verifone;

import oop.inheritance.tpv.CardSwipper;
import oop.inheritance.tpv.Communication;
import oop.inheritance.tpv.Transaction;
import oop.inheritance.tpv.TransactionResponse;
import oop.library.v240m.VerifoneV240mGPS;

public class VerifoneGPSAdapter implements Communication {
    VerifoneV240mGPS communication = new VerifoneV240mGPS();

    @Override
    public boolean open() {
        return communication.open();
    }

    @Override
    public boolean send(Transaction message) {
        //communication.send();
        return true;
    }

    @Override
    public TransactionResponse receive() {
        //communication.receive();
        return new VerifoneTransactionResponseAdapter();
    }

    @Override
    public void close() {
        communication.close();
    }
}
