/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerbuenaspracticas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author yohapimo
 */
public class PlayList3 extends PlayList {

    public PlayList3(int id, String title, String genre, String date, double duration, String cover, String description) {
        super(id, title, genre, date, duration, cover, description);
    }

    public void createList() {

        Scanner sc = new Scanner(System.in);

        PlayList play1 = new PlayList(1, "Burbujas de Amor ", " Romantica ", " Noviembre-1990 ", 6.5, " caratula 1 ", " Canción de Juan Luis Guerra 4.40");
        PlayList play2 = new PlayList(2, "Bailamos ", " Romantica ", " Febrero-1999 ", 5.2, " caratula 2 ", " Canción de Enrrique Iglesias");
        PlayList play3 = new PlayList(3, "Chiquitita ", " Romantica ", " Junio-1979 ", 5.5, " caratula 3 ", " Canción de ABBA");
        PlayList play4 = new PlayList(4, "Todo tiene su fin ", " Romantica ", " Mayo-1970 ", 7.1, " Caratula 4", " Canción de Módulos");
        PlayList play5 = new PlayList(5, "!Hola mi Amor! ", " Romantica ", " Octubre-1986 ", 4.9, " Caratula 5 ", " Canción de Junco");

        ArrayList<PlayList> playlistas = new ArrayList<PlayList>();

        playlistas.add(play1);
        playlistas.add(play2);
        playlistas.add(play3);
        playlistas.add(play4);
        playlistas.add(play5);

        Collections.sort(playlistas);  // ascendente
        //Collections.sort(playlistas, Collections.reverseOrder());  // Descendente

        for (PlayList element : playlistas) {
            System.out.println(element);

        }

    }

}
