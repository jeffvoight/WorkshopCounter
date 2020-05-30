package com.coveros.voight.workshops.counter.counters;

import com.coveros.voight.workshops.counter.FileContents;

import java.util.Iterator;

/**
 * Counts and contains the number of lines in a FileContents
 */
public class LineCounter extends Counter implements Comparable {
    private final FileContents fileContents;

    /**
     * FileContents constructor.
     *
     * @param contents FileContents from which you want to count the lines.
     */
    public LineCounter(FileContents contents) {
        this.fileContents = contents;
    }

    /**
     * Line count implementation of countItems
     *
     * @return the number of lines in the FileContents
     */
    @Override
    protected int countItems() {
        Iterator it = fileContents.iterator();
        int itemCount = 0;
        while (it.hasNext()) {
            it.next();
            itemCount++;
        }
        this.theCount = itemCount;
        return itemCount;
    }

    /**
     * Gets the name of the file
     *
     * @return String containing the name of the file.
     */
    @Override
    public String getName() {
        return fileContents.getName();
    }

    /**
     * CompareTo compares two items and tells you whether it's greater
     * than, equal to, or less than this item
     *
     * @param o Object to compare
     * @return -1 for less than, 0 for equal, and 1 for greater than
     */
    @Override
    public int compareTo(Object o) {
        Integer cc = ((Counter) o).getCount();
        Integer lc = this.getCount();
        return lc.compareTo(cc);
    }
}
