package oop.inheritance.tpv.verifone;
import oop.inheritance.tpv.Card;

public class VerifoneCardAdapter implements Card{

    oop.library.verifone.model.Card nativeCard;

    VerifoneCardAdapter(oop.library.verifone.model.Card nativeCard) {
        this.nativeCard = nativeCard;
    }

    @Override
    public String getAccount() {
        return nativeCard.getAccount();
    }

    public oop.library.verifone.model.Card getNativeCard() {
        return nativeCard;
    }
}
