package oop.inheritance.tpv.ingenico;

import oop.inheritance.tpv.Card;
import oop.inheritance.tpv.Transaction;

import java.time.LocalDateTime;

public class IngenicoTransactionAdapter implements Transaction {

    oop.library.ingenico.model.Transaction transaction = new oop.library.ingenico.model.Transaction();

    @Override
    public Card getCard() {
        return new IngenicoCardAdapter(transaction.getCard());
    }

    @Override
    public void setCard(Card card) {
        IngenicoCardAdapter ingenicoCardAdapter = (IngenicoCardAdapter) card;
        transaction.setCard(ingenicoCardAdapter.getNativeCard());
    }

    @Override
    public void setAmountInCents(int amountInCents) {
        transaction.setAmountInCents(amountInCents);
    }

    @Override
    public void setLocalDateTime(LocalDateTime localDateTime) {
        transaction.setLocalDateTime(localDateTime);
    }

    @Override
    public int getAmountInCents() {
        return transaction.getAmountInCents();
    }

    public oop.library.ingenico.model.Transaction getNativeTransaction() {
        return transaction;
    }

}
