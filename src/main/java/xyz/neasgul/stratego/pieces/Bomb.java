package xyz.neasgul.stratego.pieces;

import xyz.neasgul.stratego.Localizer;

public class Bomb extends Piece {
    public Bomb(boolean color) {
        super(color);
    }

    @Override
    protected String getName() {
        return new Localizer().getLocalizedText("bomb");
    }
}
