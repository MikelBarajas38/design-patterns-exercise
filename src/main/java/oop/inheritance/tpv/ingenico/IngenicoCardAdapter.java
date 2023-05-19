package oop.inheritance.tpv.ingenico;

import oop.inheritance.tpv.Card;

public class IngenicoCardAdapter implements Card {
    
    oop.library.ingenico.model.Card nativeCard;

    IngenicoCardAdapter(oop.library.ingenico.model.Card nativeCard) {
        this.nativeCard = nativeCard;
    }

    @Override
    public String getAccount() {
        return nativeCard.getAccount();
    }

    public oop.library.ingenico.model.Card getNativeCard() {
        return nativeCard;
    }
}
