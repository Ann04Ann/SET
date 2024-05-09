package com.example.set;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import java.util.Arrays;
import java.util.List;


public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private Button btn00, btn01, btn02, btn10,btn11, btn12, btn20, btn21, btn22, btn30, btn31, btn32;
    private Button[] all_btn;

    @FXML
    private ImageView iv00, iv01, iv02, iv10, iv11, iv12, iv20, iv21, iv22, iv30, iv31, iv32;
    private ImageView[] all_iv;



    @FXML
    private Button mainBth;


    @FXML
    private Label mainLabl;

    @FXML
    private Label mainLabl2;

    public HelloController() throws FileNotFoundException {
    }

    Initialization_card I = new Initialization_card();
    List<Card> all_card_list = I.card();
    Card[] all_card;


    Card[][] gameField = new Card[4][3];


    int isGame = 0;
    int numer = 0;
    int controller_player = 0;
    Card[] game_card = new Card[3];
    Button[] btns = new Button[3];
    ImageView[] ivs = new ImageView[3];



    /* public void showTimer(int maxTime){
        int minutes;
        int seconds = (SECOND_IN_MINUTS-1)-clockCount%SECOND_IN_MINUTS;

    }*/



    @FXML
    void btnClick(ActionEvent event) {
        isGame++;
        Button btn = (Button) event.getSource();
        btn.setText(btn.getText() + ":)");



        int rowIndex = GridPane.getRowIndex(btn) == null ? 0 : GridPane.getRowIndex(btn);
        int columnIndex = GridPane.getColumnIndex(btn) == null ? 0 : GridPane.getColumnIndex(btn);

        game_card[isGame - 1] = gameField[rowIndex][columnIndex];
        btns[isGame - 1] = btn;
        ivs[isGame-1] = all_iv[((rowIndex)*3 + columnIndex)%12];
        System.out.println(rowIndex);
        System.out.println(columnIndex);

        if (isGame == 3) {

            if (game_card[0].property(game_card[1], game_card[2])) {

                controller_player++;
                mainLabl2.setText(String.valueOf(controller_player));

                for (int i = 0; i < 3; i++) {

                    ivs[i].setImage(all_card[numer%81].image);
                    btns[i].setGraphic(ivs[i]);
                    btns[i].setText("");

                    int rowIndex1 = GridPane.getRowIndex(btns[i]) == null ? 0 : GridPane.getRowIndex(btns[i]);
                    int columnIndex1 = GridPane.getColumnIndex(btns[i]) == null ? 0 : GridPane.getColumnIndex(btns[i]);
                    gameField[rowIndex1][columnIndex1] = all_card[numer%81];
                    numer++;
                }

            }
            else{
                btns[0].setText("");
                btns[1].setText("");
                btns[2].setText("");
            }

            isGame = 0;
        }
        //if (controller_player==5){heppy();}

    }


    @FXML
    void btnClick1(ActionEvent event) throws FileNotFoundException {

        Collections.shuffle(all_card_list);
        all_card = (Card[]) all_card_list.stream().toArray(Card[]::new);
//all_card_list.get(0)
        for (int i = 0; i < 12; i++) {


            // all_btn[i].setText(all_card[rnd].name);
           // all_btn[i].setStyle(all_card[rnd].color);

            all_iv[i].setImage(all_card[i].image);
            all_btn[i].setGraphic(all_iv[i]);
            all_btn[i].setText("");


            gameField[i / 3][i % 3] = all_card[i];

        }
        isGame = 0;
        controller_player = 0;
        numer  =12;
        mainLabl2.setText(String.valueOf(controller_player));




    }

    @FXML
    void initialize() {
        all_btn = new Button[]{btn00, btn01, btn02, btn10, btn11, btn12, btn20, btn21, btn22, btn30, btn31, btn32};
        all_iv = new ImageView[]{iv00, iv01, iv02, iv10, iv11, iv12, iv20, iv21, iv22, iv30, iv31, iv32};

    }
}
