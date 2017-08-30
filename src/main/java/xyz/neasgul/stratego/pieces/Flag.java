package xyz.neasgul.stratego.pieces;

import xyz.neasgul.stratego.Localizer;

public class Flag extends Piece{

    public Flag(boolean color) {
        super(color);
    }

    @Override
    protected String getName() {
        return new Localizer().getLocalizedText("flag");
    }
}
