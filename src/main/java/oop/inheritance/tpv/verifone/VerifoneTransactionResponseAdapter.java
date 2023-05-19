package oop.inheritance.tpv.verifone;

import oop.inheritance.tpv.TransactionResponse;

public class VerifoneTransactionResponseAdapter implements TransactionResponse {
    @Override
    public boolean isApproved() {
        return false;
    }

    @Override
    public String getHostReference() {
        return null;
    }
}
