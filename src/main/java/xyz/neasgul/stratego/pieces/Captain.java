package xyz.neasgul.stratego.pieces;

import xyz.neasgul.stratego.Localizer;

public class Captain extends Piece {
    public Captain(boolean color) {
        super(color);
    }

    @Override
    protected String getName() {
        return new Localizer().getLocalizedText("captain");
    }
}
