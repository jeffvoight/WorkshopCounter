package com.coveros.voight.workshops.counter.counters;

import com.coveros.voight.workshops.counter.FileContents;

import java.util.Iterator;

/**
 * Counts and contains the number of paragraphs in a FileContents
 */
public class ParagraphCounter extends Counter {
    private final FileContents fileContents;

    /**
     * FileContents constructor.
     *
     * @param fc FileContents from which you want to count the lines.
     */
    public ParagraphCounter(FileContents fc) {
        this.fileContents = fc;
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

    /**
     * Gets the name of the file
     *
     * @return String containing the name of the file
     */
    @Override
    public String getName() {
        return fileContents.getName();
    }
}
