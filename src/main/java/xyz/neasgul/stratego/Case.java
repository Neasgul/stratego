package xyz.neasgul.stratego;

import javafx.scene.control.Button;
import xyz.neasgul.stratego.pieces.Piece;

public class Case extends Button {

    private int x;
    private int y;
    private boolean isWater;

    private Piece piece;

    public Case(int x, int y, boolean water) {
        this.x = x;
        this.y = y;
        this.isWater = water;

        this.getStyleClass().add("case");

        if (!isWater)
            this.getStyleClass().add("terrain-grass");
        else
            this.getStyleClass().add("terrain-water");
    }

    public boolean isOccupied(){
        return this.piece != null;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        if (isOccupied()){

        }else {
            if(piece!=null) {
                this.piece = piece;
                drawPiece(piece);
            }else{
                this.piece = null;
                drawPiece(null);
            }
        }
    }

    public Piece releasePiece(){
        Piece tmp = getPiece();
        setPiece(null);
        return tmp;
    }

    private void drawPiece(Piece piece) {

    }
    public int getX() { return x; }

    public int getY() { return y; }

    public boolean isWater() { return isWater; }
}
