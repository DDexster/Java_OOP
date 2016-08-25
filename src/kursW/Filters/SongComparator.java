package kursW.Filters;

import kursW.LibraryBlock.Song;

import java.util.Comparator;

/**
 * Created by ddexster on 18.08.16.
 */
public enum SongComparator implements Comparator<Song> {
    NAME {
        @Override
        public int compare(Song o1, Song o2) {
            return o1.getName().compareTo(o1.getName());
        }
    },
    GENRE {
        @Override
        public int compare(Song o1, Song o2) {
            return o1.getGenre().compareTo(o2.getGenre());
        }
    },
    LENGTH {
        @Override
        public int compare(Song o1, Song o2) {
            return Double.compare(o1.getLength(), o2.getLength());
        }
    },
    ALBUMPOSITION {
        @Override
        public int compare(Song o1, Song o2) {
            return Integer.compare(o1.getNumInAlbum(), o2.getNumInAlbum());
        }
    }
}
