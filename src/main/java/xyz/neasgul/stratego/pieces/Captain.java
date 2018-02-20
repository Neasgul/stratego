package xyz.neasgul.stratego.pieces;

import xyz.neasgul.stratego.Localizer;

public class Captain extends Piece {
    public Captain(Color color) {
        super(color);
    }

    @Override
    protected String getName() {
        return new Localizer().getLocalizedText("captain");
    }

    @Override
    public String toString() {
        return "Captain{" +
                "color=" + color +
                '}';
    }
}
