package kursW.Filters;

import kursW.LibraryBlock.Album;

import java.util.Comparator;

/**
 * Created by ddexster on 18.08.16.
 */
public enum AlbumComparator implements Comparator<Album> {
    NAME {
        @Override
        public int compare(Album o1, Album o2) {
            return o1.getName().compareTo(o2.getName());
        }
    },
    BAND {
        @Override
        public int compare(Album o1, Album o2) {
            return o1.getBand().getName().compareTo(o2.getBand().getName());
        }
    },
    YEAR {
        @Override
        public int compare(Album o1, Album o2) {
            return Integer.compare(o1.getYear(), o2.getYear());
        }
    },
    LENGTH {
        @Override
        public int compare(Album o1, Album o2) {
            return Double.compare(o1.getLength(), o2.getLength());
        }
    }

}
