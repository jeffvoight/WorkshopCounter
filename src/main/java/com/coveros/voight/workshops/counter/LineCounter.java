package com.coveros.voight.workshops.counter;

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
        return itemCount;
    }

    @Override
    public int compareTo(Object o) {
        Integer cc = ((Counter)o).countItems();
        Integer lc = this.countItems();
        return lc.compareTo(cc);
    }
}
