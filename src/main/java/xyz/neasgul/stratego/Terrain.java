package xyz.neasgul.stratego;

import javafx.scene.layout.GridPane;

public class Terrain extends GridPane {
    public Case[][] cases = new Case[10][10];



    public Terrain() {
        super();

        // initialize 10x10 array of cases
        for (int x = 0; x < cases[0].length; x++)
        {
            for (int y = 0; y < cases[1].length; y++)
            {
                boolean water = false;
                if(((x>=2 && x<=7) && (x!=4 && x!=5)) && (y==4 || y== 5)){
                    water = true;
                    System.out.println("water : x= "+x +", y= "+y);
                }
                cases[x][y] = new Case(x, y, water);

                this.add(cases[x][y], x, y);

                // Gets values into event handler
                final int xVal = x;
                final int yVal = y;
                //runs things that happen when a Case is clicked
                cases[x][y].setOnAction(event -> onCaseClick(xVal,yVal));
            }
        }
    }


    private void onCaseClick(int x, int y) {
        System.out.println("You clicked on case : "+x+", "+y);
    }
}
