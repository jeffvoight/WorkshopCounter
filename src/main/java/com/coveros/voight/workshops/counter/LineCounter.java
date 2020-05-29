package com.coveros.voight.workshops.counter;

import java.util.Iterator;

public class LineCounter extends Counter {
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
}
