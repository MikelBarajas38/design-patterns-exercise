package oop.inheritance.tpv;

import java.time.LocalDateTime;

public interface Transaction {

    Card getCard();
    void setCard(Card card);
    void setAmountInCents(int amountInCents);
    void setLocalDateTime(LocalDateTime localDateTime);
    int getAmountInCents();

}
