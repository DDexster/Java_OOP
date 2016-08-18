package kursW;

import kursW.Filters.FilterUtils;
import kursW.LibraryBlock.Band;

import java.util.ArrayList;

/**
 * Created by ddexster on 17.08.16.
 */
public class KursRunner {
    public static void main(String[] args) {
        ArrayList<Band> bands = KursUtils.getBandsBase();
        System.out.println(bands);
    }

}
