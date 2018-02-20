package xyz.neasgul.stratego.pieces;

import xyz.neasgul.stratego.Localizer;

public class Bomb extends Piece {
    public Bomb(Color color) {
        super(color);
    }

    @Override
    protected String getName() {
        return new Localizer().getLocalizedText("bomb");
    }

    @Override
    public String toString() {
        return "Bomb{" +
                "color=" + color +
                '}';
    }
}
