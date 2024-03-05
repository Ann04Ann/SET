package com.example.set;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

//import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private Button btn00, btn01,btn02,btn03,btn10, btn11, btn12, btn13, btn20,  btn21, btn22, btn23;
    private Button[] all_btn =new Button[] {btn00, btn01,btn02,btn03,btn10, btn11, btn12, btn13, btn20,  btn21, btn22, btn23};

    @FXML
    private Button mainBth;

    @FXML
    private Label mainLabl;

    @FXML
    private Label mainLabl2;



    card card1 = new card("aaa", "r", "3","p", "a");
    card card2 = new card("aa", "r", "2","p", "a");
    card card3 = new card("a", "r", "1","p", "a");
    card card4 = new card("bbb", "r", "3","p", "b");
    card card5 = new card("bb", "r", "2","p", "b");
    card card6 = new card("b", "r", "1","p", "b");
    card card7 = new card("ccc", "r", "3","p", "c");
    card card8 = new card("cc", "r", "2","p", "c");
    card card9 = new card("c", "r", "1","p", "c");

    card card10 = new card("aaa", "g", "3","p", "a");
    card card11 = new card("aa", "g", "2","p", "a");
    card card12 = new card("a", "g", "1","p", "a");
    card card13 = new card("bbb", "g", "3","p", "b");
    card card14 = new card("bb", "g", "2","p", "b");
    card card15 = new card("b", "g", "1","p", "b");
    card card16 = new card("ccc", "g", "3","p", "c");
    card card17= new card("cc", "g", "2","p", "c");
    card card18= new card("c", "g", "1","p", "c");

    private card[] all_card =new card[] {card1,card2,card3,card4,card5,card6,card7,card8,card9,
            card10,card11,card12,card13,card14,card15,card16,card17,card18};

    private card gameField[][] = new card[3][4];


    int isGame = 0;
    int controller_player= 0;
    private card[] game_card =new card[3];





    @FXML
    void btnClick(ActionEvent event) {
        isGame++;
        Button btn = (Button)event.getSource();
        btn.setText(btn.getText()+":)");


        int rowIndex = GridPane.getRowIndex(btn) == null? 0: GridPane.getRowIndex(btn);
        int columnIndex = GridPane.getColumnIndex(btn)== null? 0: GridPane.getColumnIndex(btn);

        game_card[isGame-1] = gameField[rowIndex][columnIndex];

        System.out.println(game_card[isGame-1]);

        if(isGame == 3)
        {
            if(game_card[0].property(game_card[1], game_card[2]))
            {
                controller_player++;
                mainLabl2.setText(String.valueOf(controller_player));
            }

            isGame = 0;
        }

    }

    @FXML
    void btnClick1(ActionEvent event) {
        int rnd = (int)(Math.random() * 17);
        btn00.setText(all_card[rnd].name);
        gameField[0][0] = all_card[rnd];

        rnd = (rnd+1)%18;
        btn01.setText(all_card[rnd].name);
        gameField[0][1] = all_card[rnd];
        rnd = (rnd+1)%18;
        btn02.setText(all_card[rnd].name);
        gameField[0][2] = all_card[rnd];
        rnd = (rnd+1)%18;
        btn03.setText(all_card[rnd].name);
        gameField[0][3] = all_card[rnd];

        rnd = (rnd+1)%18;
        btn10.setText(all_card[rnd].name);
        gameField[1][0] = all_card[rnd];
        rnd = (rnd+1)%18;
        btn11.setText(all_card[rnd].name);
        gameField[1][1] = all_card[rnd];
        rnd = (rnd+1)%18;
        btn12.setText(all_card[rnd].name);
        gameField[1][2] = all_card[rnd];
        rnd = (rnd+1)%18;
        btn13.setText(all_card[rnd].name);
        gameField[1][3] = all_card[rnd];

        rnd = (rnd+1)%18;
        btn20.setText(all_card[rnd].name);
        gameField[2][0] = all_card[rnd];
        rnd = (rnd+1)%18;
        btn21.setText(all_card[rnd].name);
        gameField[2][1] = all_card[rnd];
        rnd = (rnd+1)%18;
        btn22.setText(all_card[rnd].name);
        gameField[2][2] = all_card[rnd];
        rnd = (rnd+1)%18;
        btn23.setText(all_card[rnd].name);
        gameField[2][3] = all_card[rnd];


    }
    /*int rnd = (int)(Math.random() * 17);
        for( int i=0; i<12; i++)
        {
            all_btn[i].setText(all_card[rnd].name);
            gameField[i/4][i%4] = all_card[rnd];
            rnd = (rnd+1)%18;
        }*/

    @FXML
    void initialize() {

    }

}
/*if(!isGame)return;

        Button btn= (Button)event.getSource();

        int rowIndex = GridPane.getRowIndex(btn) == null ? 0:GridPane.getRowIndex(btn);
        int columnIndex = GridPane.getColumnIndex(btn) == null ? 0:GridPane.getColumnIndex(btn);

        gameField[rowIndex][columnIndex] = nowSym;

        btn.setText(String.valueOf(nowSym));
        if(gameField[0][0]== gameField[0][1] && gameField[0][1] == gameField [0][2] && (gameField[0][0]== 'x' || gameField[0][0]== 'o')){
            isGame = false;
        }

        nowSym= nowSym =='x' ? 'o' :'x';

         */