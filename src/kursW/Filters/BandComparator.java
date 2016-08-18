package kursW.Filters;

import kursW.LibraryBlock.Band;

import java.util.Comparator;

/**
 * Created by ddexster on 18.08.16.
 */
public enum BandComparator implements Comparator<Band> {
    NAME {
        @Override
        public int compare(Band o1, Band o2) {
            return o2.getName().compareTo(o2.getName());
        }
    }
}
