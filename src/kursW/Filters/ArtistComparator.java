package kursW.Filters;

import kursW.LibraryBlock.Artist;

import java.util.Comparator;

/**
 * Created by ddexster on 18.08.16.
 */
public enum ArtistComparator implements Comparator<Artist> {
    ID {
        @Override
        public int compare(Artist o1, Artist o2) {
            return Long.compare(o1.getID(), o2.getID());
        }

    },
    NAME {
        @Override
        public int compare(Artist o1, Artist o2) {
            return o1.getName().compareTo(o2.getName());
        }
    },
    SECNAME {
        @Override
        public int compare(Artist o1, Artist o2) {
            return o1.getSecName().compareTo(o2.getSecName());
        }
    },
    AGE {
        @Override
        public int compare(Artist o1, Artist o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    },
    POSITION {
        @Override
        public int compare(Artist o1, Artist o2) {
            return o1.getPosition().compareTo(o2.getPosition());
        }
    },
    BAND {
        @Override
        public int compare(Artist o1, Artist o2) {
            return o1.getBand().getName().compareTo(o1.getBand().getName());
        }
    }
}
