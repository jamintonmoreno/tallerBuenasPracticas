/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerbuenaspracticas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author yohapimo
 */
public class PlayList2 extends PlayList {

    Scanner sc = new Scanner(System.in);

    public PlayList2(int id, String title, String genre, String date, double duration, String cover, String description) {
        super(id, title, genre, date, duration, cover, description);
    }

    public void createList() {

        PlayList play1 = new PlayList(1, "Periódico de Ayer ", " Salsa ", " Septiembre-1976 ", 8.2, " caratula 1 ", " Canción de Héctor lavoe");
        PlayList play2 = new PlayList(2, "La vida es un Carnaval ", " Salsa ", " Marzo-1998 ", 7.3, " caratula 2 ", " Canción de Celia Cruz");
        PlayList play3 = new PlayList(3, "Vámos pal monte ", " Salsa ", " Noviembre-1971 ", 5.9, " caratula 3 ", " Canción de Eddie Palmieri");
        PlayList play4 = new PlayList(4, "La más bella ", " Salsa ", " Julio-2013 ", 7.5, " Caratula 4 ", " Canción de Rigo 'El Negro'");
        PlayList play5 = new PlayList(5, "Qué haces aquí ", " Salsa ", " Diciembre-2012 ", 6.2, " Caratula 5 ", " Canción de  The LeBron Brothers");

        List<PlayList> playlistas = new ArrayList<PlayList>();

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
