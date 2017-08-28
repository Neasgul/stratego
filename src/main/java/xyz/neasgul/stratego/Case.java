package xyz.neasgul.stratego;

import javafx.scene.control.Button;

public class Case extends Button {

    private int x;
    private int y;
    private boolean isWater;

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

    public int getX() { return x; }

    public int getY() { return y; }

    public boolean isWater() { return isWater; }
}
