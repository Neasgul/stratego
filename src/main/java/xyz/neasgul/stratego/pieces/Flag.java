package xyz.neasgul.stratego.pieces;

import xyz.neasgul.stratego.Localizer;

public class Flag extends Piece{

    public Flag(Color color) {
        super(color);
    }

    @Override
    protected String getName() {
        return new Localizer().getLocalizedText("flag");
    }

    @Override
    public String toString() {
        return "Flag{" +
                "color=" + color +
                '}';
    }
}
