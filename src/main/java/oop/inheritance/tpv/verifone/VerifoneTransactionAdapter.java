package oop.inheritance.tpv.verifone;

import oop.inheritance.tpv.Card;
import oop.inheritance.tpv.Transaction;

import java.time.LocalDateTime;

public class VerifoneTransactionAdapter implements Transaction {
    @Override
    public Card getCard() {
        return null;
    }

    @Override
    public void setCard(Card card) {

    }

    @Override
    public void setAmountInCents(int amountInCents) {

    }

    @Override
    public void setLocalDateTime(LocalDateTime localDateTime) {

    }

    @Override
    public int getAmountInCents() {
        return 0;
    }
}
