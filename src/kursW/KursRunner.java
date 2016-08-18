package kursW;

import kursW.Enums.Genre;
import kursW.Filters.FilterUtils;
import kursW.LibraryBlock.Band;

import java.util.ArrayList;

/**
 * Created by ddexster on 17.08.16.
 */
public class KursRunner {
    public static void main(String[] args) {
        ArrayList<Band> bands = KursUtils.getBandsBase();
        // особое задание написать фильтр по поиску жанра, первой буквы исполнителя и года альбома
        ArrayList<Band> resultHW = FilterUtils.findByPrivateTask(bands, Genre.PUNK, 'd', 1978);
        System.out.println(resultHW);
    }

}
