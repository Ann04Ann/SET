package com.example.set;

import javafx.scene.image.Image;

import java.io.FileNotFoundException;

//это надо сделать файлом, но я не знаю как
public class Initialization_card {


    /*кодировка: тип    +    цвет      +      заливка        + количество */
    /*           ромб-1      красный-1        прозрачность-1              */
    /*           овал-2      зеленый-2        штриховка-2                 */
    /*           кривая-3    фиолетовый-3     сплошная-3                  */

    Card[] card() throws FileNotFoundException {
        Initialization_png I = new Initialization_png();
        Image[] all = I.imeag();


        Card card_1111 = new Card("rhombus","red","pesto",   1, all[0]);
        Card card_1112 = new Card("rhombus","red","pesto",   2, all[1]);
        Card card_1113 = new Card("rhombus","red","pesto",   3, all[2]);
        Card card_1121 = new Card("rhombus","red","hatching",1, all[3]);
        Card card_1122 = new Card("rhombus","red","hatching",2, all[4]);
        Card card_1123 = new Card("rhombus","red","hatching",3, all[5]);
        Card card_1131 = new Card("rhombus","red","full",    1, all[6]);
        Card card_1132 = new Card("rhombus","red","full",    2, all[7]);
        Card card_1133 = new Card("rhombus","red","full",    3, all[8]);

        Card card_1211 = new Card("rhombus","green","pesto",   1, all[9]);
        Card card_1212 = new Card("rhombus","green","pesto",   2, all[10]);
        Card card_1213 = new Card("rhombus","green","pesto",   3, all[11]);
        Card card_1221 = new Card("rhombus","green","hatching",1, all[12]);
        Card card_1222 = new Card("rhombus","green","hatching",2, all[13]);
        Card card_1223 = new Card("rhombus","green","hatching",3, all[14]);
        Card card_1231 = new Card("rhombus","green","full",    1, all[15]);
        Card card_1232 = new Card("rhombus","green","full",    2, all[16]);
        Card card_1233 = new Card("rhombus","green","full",    3, all[17]);

        Card card_1311 = new Card("rhombus","violet","pesto",   1, all[18]);
        Card card_1312 = new Card("rhombus","violet","pesto",   2, all[19]);
        Card card_1313 = new Card("rhombus","violet","pesto",   3, all[20]);
        Card card_1321 = new Card("rhombus","violet","hatching",1, all[21]);
        Card card_1322 = new Card("rhombus","violet","hatching",2, all[22]);
        Card card_1323 = new Card("rhombus","violet","hatching",3, all[23]);
        Card card_1331 = new Card("rhombus","violet","full",    1, all[24]);
        Card card_1332 = new Card("rhombus","violet","full",    2, all[25]);
        Card card_1333 = new Card("rhombus","violet","full",    3, all[26]);


        Card card_2111 = new Card("oval","red","pesto",   1, all[27]);
        Card card_2112 = new Card("oval","red","pesto",   2, all[28]);
        Card card_2113 = new Card("oval","red","pesto",   3, all[29]);
        Card card_2121 = new Card("oval","red","hatching",1, all[30]);
        Card card_2122 = new Card("oval","red","hatching",2, all[31]);
        Card card_2123 = new Card("oval","red","hatching",3, all[32]);
        Card card_2131 = new Card("oval","red","full",    1, all[33]);
        Card card_2132 = new Card("oval","red","full",    2, all[34]);
        Card card_2133 = new Card("oval","red","full",    3, all[35]);

        Card card_2211 = new Card("oval","green","pesto",   1, all[36]);
        Card card_2212 = new Card("oval","green","pesto",   2, all[37]);
        Card card_2213 = new Card("oval","green","pesto",   3, all[38]);
        Card card_2221 = new Card("oval","green","hatching",1, all[39]);
        Card card_2222 = new Card("oval","green","hatching",2, all[40]);
        Card card_2223 = new Card("oval","green","hatching",3, all[41]);
        Card card_2231 = new Card("oval","green","full",    1, all[42]);
        Card card_2232 = new Card("oval","green","full",    2, all[43]);
        Card card_2233 = new Card("oval","green","full",    3, all[44]);

        Card card_2311 = new Card("oval","violet","pesto",   1, all[45]);
        Card card_2312 = new Card("oval","violet","pesto",   2, all[46]);
        Card card_2313 = new Card("oval","violet","pesto",   3, all[47]);
        Card card_2321 = new Card("oval","violet","hatching",1, all[48]);
        Card card_2322 = new Card("oval","violet","hatching",2, all[49]);
        Card card_2323 = new Card("oval","violet","hatching",3, all[50]);
        Card card_2331 = new Card("oval","violet","full",    1, all[51]);
        Card card_2332 = new Card("oval","violet","full",    2, all[52]);
        Card card_2333 = new Card("oval","violet","full",    3, all[53]);


        Card card_3111 = new Card("curve","red","pesto",   1, all[54]);
        Card card_3112 = new Card("curve","red","pesto",   2, all[55]);
        Card card_3113 = new Card("curve","red","pesto",   3, all[56]);
        Card card_3121 = new Card("curve","red","hatching",1, all[57]);
        Card card_3122 = new Card("curve","red","hatching",2, all[58]);
        Card card_3123 = new Card("curve","red","hatching",3, all[59]);
        Card card_3131 = new Card("curve","red","full",    1, all[60]);
        Card card_3132 = new Card("curve","red","full",    2, all[61]);
        Card card_3133 = new Card("curve","red","full",    3, all[62]);

        Card card_3211 = new Card("curve","green","pesto",   1, all[63]);
        Card card_3212 = new Card("curve","green","pesto",   2, all[64]);
        Card card_3213 = new Card("curve","green","pesto",   3, all[65]);
        Card card_3221 = new Card("curve","green","hatching",1, all[66]);
        Card card_3222 = new Card("curve","green","hatching",2, all[67]);
        Card card_3223 = new Card("curve","green","hatching",3, all[68]);
        Card card_3231 = new Card("curve","green","full",    1, all[69]);
        Card card_3232 = new Card("curve","green","full",    2, all[70]);
        Card card_3233 = new Card("curve","green","full",    3, all[71]);

        Card card_3311 = new Card("curve","violet","pesto",   1, all[72]);
        Card card_3312 = new Card("curve","violet","pesto",   2, all[73]);
        Card card_3313 = new Card("curve","violet","pesto",   3, all[74]);
        Card card_3321 = new Card("curve","violet","hatching",1, all[75]);
        Card card_3322 = new Card("curve","violet","hatching",2, all[76]);
        Card card_3323 = new Card("curve","violet","hatching",3, all[77]);
        Card card_3331 = new Card("curve","violet","full",    1, all[78]);
        Card card_3332 = new Card("curve","violet","full",    2, all[79]);
        Card card_3333 = new Card("curve","violet","full",    3, all[80]);




        return new Card[] {card_1111, card_1112, card_1113,card_1121, card_1122, card_1123,card_1131, card_1132, card_1133,
                card_1211, card_1212, card_1213,card_1221, card_1222, card_1223,card_1231, card_1232, card_1233,
                card_1311, card_1312, card_1313,card_1321, card_1322, card_1323,card_1331, card_1332, card_1333,

                card_2111, card_2112, card_2113,card_2121, card_2122, card_2123,card_2131, card_2132, card_2133,
                card_2211, card_2212, card_2213,card_2221, card_2222, card_2223,card_2231, card_2232, card_2233,
                card_2311, card_2312, card_2313,card_2321, card_2322, card_2323,card_2331, card_2332, card_2333,

                card_3111, card_3112, card_3113,card_3121, card_3122, card_3123,card_3131, card_3132, card_3133,
                card_3211, card_3212, card_3213,card_3221, card_3222, card_3223,card_3231, card_3232, card_3233,
                card_3311, card_3312, card_3313,card_3321, card_3322, card_3323,card_3331, card_3332, card_3333};
    };

}
