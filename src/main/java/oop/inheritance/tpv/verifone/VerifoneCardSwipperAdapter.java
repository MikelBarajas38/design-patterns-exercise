package oop.inheritance.tpv.verifone;

import oop.inheritance.tpv.Card;
import oop.inheritance.tpv.CardSwipper;
import oop.library.v240m.VerifoneV240mCardSwipper;

public class VerifoneCardSwipperAdapter implements CardSwipper {

    VerifoneV240mCardSwipper cardSwipper = new VerifoneV240mCardSwipper();

    @Override
    public Card readCard() {
        return new VerifoneCardAdapter(cardSwipper.readCard());
    }
}
