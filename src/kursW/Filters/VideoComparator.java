package kursW.Filters;

import kursW.LibraryBlock.Video;

import java.util.Comparator;

/**
 * Created by ddexster on 18.08.16.
 */
public enum VideoComparator implements Comparator<Video> {
    AME {
        @Override
        public int compare(Video o1, Video o2) {
            return o1.getName().compareTo(o1.getName());
        }
    },
    GENRE {
        @Override
        public int compare(Video o1, Video o2) {
            return o1.getGenre().compareTo(o2.getGenre());
        }
    },
    LENGTH {
        @Override
        public int compare(Video o1, Video o2) {
            return Double.compare(o1.getLength(), o2.getLength());
        }
    }
}
