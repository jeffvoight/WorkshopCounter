package com.coveros.voight.workshops.counter.counters;

/**
 * This is the Counter class. It keeps track of how many 'things'
 * are encountered.
 */
public abstract class Counter {

    protected int theCount = -1; // How many items counted

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
        return countItems();
    }

    public abstract String getName();
}
