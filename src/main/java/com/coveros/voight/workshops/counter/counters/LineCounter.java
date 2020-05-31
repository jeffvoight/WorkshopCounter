package com.coveros.voight.workshops.counter.counters;

import com.coveros.voight.workshops.counter.FileContents;

import java.util.Iterator;

/**
 * Counts and contains the number of lines in a FileContents
 */
public class LineCounter extends Counter {


    public LineCounter(FileContents fc){
        super(fc);
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
}
