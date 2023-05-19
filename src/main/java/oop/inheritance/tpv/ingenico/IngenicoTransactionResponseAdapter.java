package oop.inheritance.tpv.ingenico;

import oop.inheritance.tpv.TransactionResponse;

public class IngenicoTransactionResponseAdapter implements TransactionResponse {

    oop.library.ingenico.model.TransactionResponse transactionResponse;

    IngenicoTransactionResponseAdapter(oop.library.ingenico.model.TransactionResponse transactionResponse) {
        this.transactionResponse = transactionResponse;
    }

    @Override
    public boolean isApproved() {
        return transactionResponse.isApproved();
    }

    @Override
    public String getHostReference() {
        return transactionResponse.getHostReference();
    }

}
