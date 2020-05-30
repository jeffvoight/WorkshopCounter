package com.coveros.voight.workshops.counter.counters;

import com.coveros.voight.workshops.counter.FileContents;

import java.util.Iterator;

public class LineCounter extends Counter implements Comparable {
    private final FileContents fileContents;

    public LineCounter(FileContents contents){
        this.fileContents = contents;
    }

    @Override
    protected int countItems() {
        Iterator it = fileContents.iterator();
        int itemCount = 0;
        while(it.hasNext()){
            it.next();
            itemCount++;
        }
        this.theCount = itemCount;
        return itemCount;
    }

    @Override
    public String getName() {
        return fileContents.getName();
    }

    @Override
    public int compareTo(Object o) {
        Integer cc = ((Counter)o).getCount();
        Integer lc = this.getCount();
        return lc.compareTo(cc);
    }
}
