package xyz.neasgul.stratego.pieces;

import xyz.neasgul.stratego.Localizer;

public class Scout extends Piece {
    public Scout(boolean color) {
        super(color);
    }

    @Override
    protected String getName() {
        return new Localizer().getLocalizedText("scout");
    }
}
