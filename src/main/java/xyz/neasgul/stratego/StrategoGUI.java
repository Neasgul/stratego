package xyz.neasgul.stratego;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class StrategoGUI extends Application {
    private Terrain board;
    private DeadPiecesList leftList;
    private DeadPiecesList rightList;

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
        Scene mainScene = new Scene(root,995,552);
        board = new Terrain();

        mainScene.getStylesheets().add(getClass().getResource("/stylesheet.css").toString());
        primaryStage.setTitle("Stratego");
        primaryStage.setScene(mainScene);

        root.setCenter(board);

        // add menuBar
        MenuBar menuBar = generateMenuBar();
        root.setTop(menuBar);


        // add dead pieces lists
        leftList = new DeadPiecesList();
        rightList = new DeadPiecesList();
        root.setLeft(leftList);
        root.setRight(rightList);
        primaryStage.show();
        primaryStage.setResizable(false);
        leftList.populateList();
    }



    private MenuBar generateMenuBar()
    {
        // TODO: 20/02/2018 finish menu
        MenuBar menuBar = new MenuBar();

        Menu gameMenu = new Menu("Game");
        menuBar.getMenus().add(gameMenu);

        MenuItem menuItemQuit = new MenuItem("Quit");
        //menuItemQuit.setOnAction(e -> onQuit());
        //menuItemQuit.setGraphic( new ImageView( new Image("assets/icons/quit.png", 16, 16, true, true) ) );
        menuItemQuit.setAccelerator( new KeyCodeCombination(KeyCode.Q, KeyCombination.CONTROL_DOWN) );
        gameMenu.getItems().add(menuItemQuit);

        Menu menuHelp = new Menu("Help");
        menuBar.getMenus().add(menuHelp);

        MenuItem menuItemAbout = new MenuItem("About");
        menuItemAbout.setAccelerator( new KeyCodeCombination(KeyCode.F1) );
        //menuItemAbout.setOnAction(e -> onDisplayAbout());
        menuHelp.getItems().add(menuItemAbout);

        return menuBar;
    }
}
