package oop.inheritance.tpv.verifone;

import oop.inheritance.tpv.Card;
import oop.inheritance.tpv.ChipReader;
import oop.inheritance.tpv.ingenico.IngenicoCardAdapter;
import oop.library.v240m.VerifoneV240mChipReader;

public class VerifoneChipReaderAdapter implements ChipReader {

    VerifoneV240mChipReader chipReader = new VerifoneV240mChipReader();

    @Override
    public Card readCard() {
        return new VerifoneCardAdapter(chipReader.readCard());
    }

}
