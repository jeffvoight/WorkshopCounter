package com.coveros.voight.workshops.counter;

import java.util.Iterator;

public class ParagraphCounter extends Counter {
    private final FileContents fileContents;

    public ParagraphCounter(FileContents fc){
        this.fileContents = fc;
    }

    @Override
    protected int countItems() {
        Iterator it = fileContents.iterator();
        int itemCount = 0;
        while(it.hasNext()){
            String line = (String)it.next();
            if(line.equals("")) {
                itemCount++;
            }
        }
        return itemCount;
    }
}
