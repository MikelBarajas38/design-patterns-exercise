package oop.inheritance.tpv.ingenico;

import oop.inheritance.tpv.Communication;
import oop.inheritance.tpv.Transaction;
import oop.inheritance.tpv.TransactionResponse;
import oop.library.ingenico.services.IngenicoGPS;

public class IngenicoGPSAdapter implements Communication {

    IngenicoGPS communication = new IngenicoGPS();

    @Override
    public boolean open() {
        return communication.open();
    }

    @Override
    public boolean send(Transaction message) {
        IngenicoTransactionAdapter nativeMessage = (IngenicoTransactionAdapter) message;
        return communication.send(nativeMessage.getNativeTransaction());
    }

    @Override
    public TransactionResponse receive() {
        return new IngenicoTransactionResponseAdapter(communication.receive());
    }

    @Override
    public void close() {
        communication.close();
    }

}
