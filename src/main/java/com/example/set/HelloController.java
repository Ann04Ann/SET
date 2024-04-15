package com.example.set;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
    Card[] all_card = I.card();


    Card[][] gameField = new Card[4][3];


    int isGame = 0;
    int controller_player = 0;
    Card[] game_card = new Card[3];
    Button[] btns = new Button[3];
    ImageView[] ivs = new ImageView[3];



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
        //ImageView iv = (ImageView) event.getSource();
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
                    int rnd = (int) (Math.random() * 17);

                    //btns[i].setText(all_card[rnd].name);


                    ivs[i].setImage(all_card[rnd].image);
                    btns[i].setGraphic(ivs[i]);
                    btns[i].setText("");


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
    //public Image image = new Image("imaeg.png");

    @FXML
    void btnClick1(ActionEvent event) throws FileNotFoundException {



        int rnd = (int) (Math.random() * 17);
        for (int i = 0; i < 12; i++) {


            // all_btn[i].setText(all_card[rnd].name);
           // all_btn[i].setStyle(all_card[rnd].color);


            //Image image = new Image(new FileInputStream("C:\\Users\\annas\\SET_SET\\SET\\src\\main\\resources\\images\\riLxM6di8.png"));
            all_iv[i].setImage(all_card[rnd].image);
            all_btn[i].setGraphic(all_iv[i]);
            all_btn[i].setText("");


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
        all_iv = new ImageView[]{iv00, iv01, iv02, iv10, iv11, iv12, iv20, iv21, iv22, iv30, iv31, iv32};

    }
}
