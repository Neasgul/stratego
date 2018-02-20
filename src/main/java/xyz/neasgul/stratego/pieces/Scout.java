package xyz.neasgul.stratego.pieces;

import xyz.neasgul.stratego.Localizer;

public class Scout extends Piece {
    public Scout(Color color) {
        super(color);
    }

    @Override
    protected String getName() {
        return new Localizer().getLocalizedText("scout");
    }

    @Override
    public String toString() {
        return "Scout{" +
                "color=" + color +
                '}';
    }
}
