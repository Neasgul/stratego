package xyz.neasgul.stratego.pieces;

import javafx.scene.image.Image;

public abstract class Piece {
    protected Image image;
    protected Color color;
    public Piece(Color color) {
        this.color = color;
        this.image = new Image(getClass().getResource("/img/Bomb.png").toExternalForm());

    }

    public Image getImage()
    {
        return this.image;
    }

    public Color getColor() {
        return color;
    }

    //protected abstract MoveList[] getPieceMoves();
    protected abstract String getName();

    public enum Color {
        RED,
        BLUE
    }
}
