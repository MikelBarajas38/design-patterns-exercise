package oop.inheritance.tpv.ingenico;

import oop.inheritance.tpv.Card;
import oop.inheritance.tpv.ChipReader;
import oop.library.ingenico.services.IngenicoChipReader;

public class IngenicoChipReaderAdapter implements ChipReader {

    IngenicoChipReader chipReader = new IngenicoChipReader();

    @Override
    public Card readCard() {
        return new IngenicoCardAdapter(chipReader.readCard());
    }
}
