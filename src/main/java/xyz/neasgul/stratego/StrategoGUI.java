package xyz.neasgul.stratego;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class StrategoGUI extends Application {
    private Terrain board;

    public static void main(String[] args) {
        try {
            launch(args);
            System.exit(0);
        }
        catch (Exception error) {
            error.printStackTrace();
            System.exit(1);
        }
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        Scene mainScene = new Scene(root,500,500);
        board = new Terrain();

        mainScene.getStylesheets().add(getClass().getResource("/stylesheet.css").toString());
        primaryStage.setTitle("Stratego");
        primaryStage.setScene(mainScene);

        root.setCenter(board);



        primaryStage.show();
    }
}
