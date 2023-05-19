package oop.inheritance.tpv.ingenico;

import oop.inheritance.tpv.Card;
import oop.inheritance.tpv.CardSwipper;
import oop.library.ingenico.services.IngenicoCardSwipper;

public class IngenicoCardSwipperAdapter  implements CardSwipper {

    IngenicoCardSwipper cardSwipper = new IngenicoCardSwipper();

    @Override
    public Card readCard() {
        return new IngenicoCardAdapter(cardSwipper.readCard());
    }
}
