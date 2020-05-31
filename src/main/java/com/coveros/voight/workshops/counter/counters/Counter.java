package com.coveros.voight.workshops.counter.counters;

import com.coveros.voight.workshops.counter.FileContents;

/**
 * This is the Counter class. It keeps track of how many 'things'
 * are encountered.
 */
public abstract class Counter implements Comparable {
    protected FileContents fileContents;

    protected int theCount = -1; // How many items counted

    protected Counter() {
        fileContents = null;
    }
    /**
     * FileContents constructor.
     *
     * @param contents FileContents from which you want to count the lines.
     */
    public Counter(FileContents contents) {
        this.fileContents = contents;
        theCount = countItems();
    }

    /**
     * Count the items in the Counter. This is implementation defined.
     *
     * @return int containing the count of items
     */
    protected abstract int countItems();

    /**
     * Gets the count of how many items are found
     *
     * @return int containing the item count.
     */
    public int getCount() {
        return theCount;
    }

    public String getName(){
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
