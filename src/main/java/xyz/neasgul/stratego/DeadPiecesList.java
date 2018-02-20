package xyz.neasgul.stratego;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import xyz.neasgul.stratego.pieces.Bomb;
import xyz.neasgul.stratego.pieces.Captain;
import xyz.neasgul.stratego.pieces.Flag;
import xyz.neasgul.stratego.pieces.Piece;

public class DeadPiecesList extends ListView<Piece>{
    public DeadPiecesList() {
        super();
    }


    public void populateList() {
        ObservableList<Piece> list = FXCollections.observableArrayList();
        list.add(new Flag(Piece.Color.RED));
        list.add(new Bomb(Piece.Color.BLUE));
        list.add(new Bomb(Piece.Color.BLUE));
        list.add(new Bomb(Piece.Color.BLUE));
        list.add(new Captain(Piece.Color.BLUE));

        setItems(list);
        this.setCellFactory(param -> new ListCell<Piece>() {
            @Override
            public void updateItem(Piece piece, boolean empty) {
                super.updateItem(piece, empty);
                ImageView imageView;
                if (empty) {
                    setText(null);
                    setGraphic(null);
                } else {
                    imageView = new ImageView(piece.getImage());
                    ColorAdjust adjust = new ColorAdjust();
                    adjust.setSaturation(1);
                    imageView.setFitHeight(80);
                    imageView.setPreserveRatio(true);

                    switch (piece.getColor()) {
                        case RED:
                            adjust.setHue(Color.RED.getHue());
                            break;
                        case BLUE:
                            adjust.setHue(Color.ROYALBLUE.getHue());
                            break;
                        default:
                    }
                    imageView.setEffect(adjust);
                    setText(piece.getColor().toString());
                    setGraphic(imageView);
                }
            }
        });
    }
}
