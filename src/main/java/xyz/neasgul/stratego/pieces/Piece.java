package xyz.neasgul.stratego.pieces;

import javafx.scene.image.Image;

public abstract class Piece {
    protected Image image;
    protected boolean color;

    public Piece(boolean color) {
        this.color = color;


    }
    
    public Image getImage()
    {
        return this.image;
    }

    //protected abstract MoveList[] getPieceMoves();
    protected abstract String getName();
}
