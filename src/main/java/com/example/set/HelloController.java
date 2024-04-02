package com.example.set;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

//import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private Button btn00, btn01, btn02, btn10,btn11, btn12, btn20, btn21, btn22, btn30, btn31, btn32;
    private Button[] all_btn;
    public ImageView jpag;

    @FXML
    private Button mainBth;


    @FXML
    private Label mainLabl;

    @FXML
    private Label mainLabl2;


    Initialization I = new Initialization() ;
    Card [] all_card= I.get();
    Card[][] gameField = new Card[4][3];


    int isGame = 0;
    int controller_player = 0;
    Card[] game_card = new Card[3];

    Button[] btns = new Button[3];



    void heppy (){
        // Создаем изображение для кнопки
         Image image = new Image("смайлик.jpg");

        // Создаем представление изображения
        ImageView imageView = new ImageView(image);




    }



    @FXML
    void btnClick(ActionEvent event) {
        isGame++;
        Button btn = (Button) event.getSource();
        btn.setText(btn.getText() + ":)");


        int rowIndex = GridPane.getRowIndex(btn) == null ? 0 : GridPane.getRowIndex(btn);
        int columnIndex = GridPane.getColumnIndex(btn) == null ? 0 : GridPane.getColumnIndex(btn);

        game_card[isGame - 1] = gameField[rowIndex][columnIndex];
        btns[isGame - 1] = btn;

        if (isGame == 3) {

            if (game_card[0].property(game_card[1], game_card[2])) {

                controller_player++;
                mainLabl2.setText(String.valueOf(controller_player));

                for (int i = 0; i < 3; i++) {
                    int rnd = (int) (Math.random() * 17);
                    btns[i].setText(all_card[rnd].name);
                    btns[i].setStyle(all_card[rnd].color);
                   // Objects.equals(a,b)
                    int rowIndex1 = GridPane.getRowIndex(btns[i]) == null ? 0 : GridPane.getRowIndex(btns[i]);
                    int columnIndex1 = GridPane.getColumnIndex(btns[i]) == null ? 0 : GridPane.getColumnIndex(btns[i]);
                    gameField[rowIndex1][columnIndex1] = all_card[rnd];
                }

            }
            isGame = 0;
        }
        //if (controller_player==5){heppy();}

    }


    @FXML
    void btnClick1(ActionEvent event) {



        int rnd = (int) (Math.random() * 17);
        for (int i = 0; i < 12; i++) {

            all_btn[i].setText(all_card[rnd].name);
            all_btn[i].setStyle(all_card[rnd].color);

            gameField[i / 3][i % 3] = all_card[rnd];
            rnd = (rnd + 1) % all_card.length;
        }
        isGame = 0;
        controller_player = 0;
        mainLabl2.setText(String.valueOf(controller_player));


    }

    @FXML
    void initialize() {
        all_btn = new Button[]{btn00, btn01, btn02, btn10, btn11, btn12, btn20, btn21, btn22, btn30, btn31, btn32};
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