package com.coveros.voight.workshops.counter.counters;

import com.coveros.voight.workshops.counter.FileContents;

import java.util.Iterator;

/**
 * Counts and contains the number of paragraphs in a FileContents
 */
public class ParagraphCounter extends Counter {

    public ParagraphCounter(FileContents fc){
        super(fc);
    }

    /**
     * Paragraph count implementation of countItems
     *
     * @return the number of paragraphs in the FileContents
     */
    @Override
    protected int countItems() {
        Iterator it = fileContents.iterator();
        int itemCount = 0;
        while (it.hasNext()) {
            String line = (String) it.next();
            if (line.equals("")) {
                itemCount++;
            }
        }
        return itemCount;
    }
}
