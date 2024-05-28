package com.example.set;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;


public class HelloController {

   // @FXML
   // private ResourceBundle resources;

   // @FXML
   // private URL location;
    @FXML
    private Button btn00, btn01, btn02, btn10, btn11, btn12, btn20, btn21, btn22, btn30, btn31, btn32;
    private Button[] all_btn;

    @FXML
    private ImageView iv00, iv01, iv02, iv10, iv11, iv12, iv20, iv21, iv22, iv30, iv31, iv32;
    private ImageView[] all_iv;


    @FXML
    private Button Start, Stop, Continuation, Help;


    @FXML
    private Label mainLabl, mainLabl2, start, stop, help;

    @FXML
    private Group rec1, rec2, rec3, rec4, rec5, rec6, rec7, rec8, rec9, rec10, rec11, rec12;
    private Group[] all_Rec;

    @FXML
    private Group finish;

    @FXML
    private Label Player1, Player2, Player3, Player4, Player5, Player6, Player7, Player8, Time1, Time2, Time3, Time4, Time5, Time6, Time7, Time8;

    private Label[] all_lebl;

    @FXML
    private ImageView fon;
    @FXML
    private TextField UserNameBox;


    @FXML
    private Label Time = new Label();


    @FXML
    private Stage name = new Stage();


    private static GameData gameData = new GameData();

    private String prav = "Cуть игры заключается в обнаружении разрешённых " + "\n"+
            "комбинаций карт (наборов) среди двенадцати карт." + "\n"+
            "Набор (или «сет») состоит из трёх карт,"+"\n"+
            "у которых каждая характеристика или у всех карт разная" + "\n"+
            "или у всех карт одинаковая. Другими словами три карты, " + "\n"+
            "среди которых две карты имеют одинаковую характеристику," + "\n"+
            " а у третей эта характеристика отличается, " + "\n" +
            "не являются набором (сетом). Причём вне зависимости "+ "\n"+
            "от того, соблюдается ли правило совпадения " +"\n"+
            "полного различия для других характеристик этих карт.";


    public HelloController() throws FileNotFoundException {
    }

    InitializationCard I = new InitializationCard();
    List<Card> all_card_list = I.card();
    Card[] all_card;


    Card[][] gameField = new Card[4][3];
    ImageView[][] gameImageView = new ImageView[4][3];


    int isGame = 0;
    int numer = 0;

    int controller_player = 0;
    Card[] game_card = new Card[3];
    Button[] btns = new Button[3];
    ImageView[] ivs = new ImageView[3];
    Group[] rec = new Group[3];

    private TimerGame time = new TimerGame(Time);

    private String playerName;


    private void delAllBtn(){for (int i=0; i<12; i++){
        all_btn[i].setVisible(false);
    }}

    private void pushAllBtn(){for (int i=0; i<12; i++){
        all_btn[i].setVisible(true);
    }}

    private void Finish() {
        time.stop();

        Start.setVisible(false);
        fon.setVisible(true);
        finish.setVisible(true);
        mainLabl.setVisible(false);

        Help.setVisible(false);
        Stop.setVisible(false);
        delAllBtn();

        int timeee = time.getTimeSeconds();
        System.out.println(timeee);
        gameData.addPlayer(playerName, timeee);
        gameData.printPlayersData(all_lebl);


    }

    @FXML
    private void btnClick(ActionEvent event) {
        if (controller_player < 2) {
            isGame++;
            Button btn = (Button) event.getSource();


            int rowIndex = GridPane.getRowIndex(btn) == null ? 0 : GridPane.getRowIndex(btn);
            int columnIndex = GridPane.getColumnIndex(btn) == null ? 0 : GridPane.getColumnIndex(btn);

            all_Rec[rowIndex + columnIndex * 4].setVisible(true);


            game_card[isGame - 1] = gameField[rowIndex][columnIndex];
            btns[isGame - 1] = btn;
            ivs[isGame - 1] = all_iv[((rowIndex) * 3 + columnIndex) % 12];
            rec[isGame - 1] = all_Rec[rowIndex + columnIndex * 4];


            if (isGame == 3) {

                if (game_card[0].property(game_card[1], game_card[2])) {

                    controller_player++;
                    mainLabl2.setText(String.valueOf(controller_player));

                    for (int i = 0; i < 3; i++) {

                        ivs[i].setImage(all_card[numer % 81].image);
                        btns[i].setGraphic(ivs[i]);
                        rec[i].setVisible(false);

                        int rowIndex1 = GridPane.getRowIndex(btns[i]) == null ? 0 : GridPane.getRowIndex(btns[i]);
                        int columnIndex1 = GridPane.getColumnIndex(btns[i]) == null ? 0 : GridPane.getColumnIndex(btns[i]);
                        gameField[rowIndex1][columnIndex1] = all_card[numer % 81];
                        numer++;
                    }

                } else {
                    rec[0].setVisible(false);
                    rec[1].setVisible(false);
                    rec[2].setVisible(false);
                }

                isGame = 0;
            }
            if (controller_player == 2) {
                Finish();


            }

        }


    }


    @FXML
    private void btnClick1(ActionEvent event) throws FileNotFoundException {
       // gameData.delAllPlayer();

        UserName Name = new UserName();
        Name.start(name);
        playerName = Name.getUserName();

        start.setVisible(false);
        fon.setVisible(false);
        //Start.setVisible(false);
        Stop.setVisible(true);
        Help.setVisible(true);
        mainLabl.setVisible(true);

        time.start();

        Collections.shuffle(all_card_list);
        all_card = (Card[]) all_card_list.stream().toArray(Card[]::new);
        for (int i = 0; i < 12; i++) {


            // all_btn[i].setText(all_card[rnd].name);
            // all_btn[i].setStyle(all_card[rnd].color);

            all_iv[i].setImage(all_card[i].image);
            all_btn[i].setGraphic(all_iv[i]);


            gameField[i / 3][i % 3] = all_card[i];
            gameImageView[i / 3][i % 3] = all_iv[i];

        }
        isGame = 0;
        controller_player = 0;
        numer = 12;
        mainLabl2.setText(String.valueOf(controller_player));

    }

    @FXML
    private void btnClickStop(ActionEvent event) throws FileNotFoundException {
        time.stop();


        fon.setVisible(true);
        stop.setVisible(true);
        Start.setVisible(false);
        Help.setVisible(false);
        Stop.setVisible(false);
        Continuation.setVisible(true);

        UserNameBox.setVisible(true);
        delAllBtn();


    }

    @FXML
    private void btnClickСontinuation(ActionEvent event) throws FileNotFoundException {
        time.start();



        fon.setVisible(false);
        stop.setVisible(false);
        Continuation.setVisible(false);
        Start.setVisible(true);
        Stop.setVisible(true);
        help.setVisible(false);
        Help.setVisible(true);
        pushAllBtn();


    }

    @FXML
    private void btnClickHelp(ActionEvent event) throws FileNotFoundException {

        time.stop();
        fon.setVisible(true);
        Help.setVisible(false);
        help.setText(prav);
        Continuation.setVisible(true);
        help.setVisible(true);
        Stop.setVisible(false);
        Start.setVisible(false);
        delAllBtn();

    }


    @FXML
    void initialize() {

        all_btn = new Button[]{btn00, btn01, btn02, btn10, btn11, btn12, btn20, btn21, btn22, btn30, btn31, btn32};
        all_iv = new ImageView[]{iv00, iv01, iv02, iv10, iv11, iv12, iv20, iv21, iv22, iv30, iv31, iv32};
        all_Rec = new Group[]{rec1, rec2, rec3, rec4, rec5, rec6, rec7, rec8, rec9, rec10, rec11, rec12};
        all_lebl = new Label[]{Player1, Player2, Player3, Player4, Player5, Player6, Player7, Player8, Time1, Time2, Time3, Time4, Time5, Time6, Time7, Time8};

    }
}
