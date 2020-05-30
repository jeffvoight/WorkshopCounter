package com.coveros.voight.workshops.counter.counters;

import com.coveros.voight.workshops.counter.FileContents;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Counts and contains the number of paragraphs in a FileContents
 */
public class RegexCounter extends Counter {
    private final FileContents fileContents;
    private final Pattern pattern;

    /**
     * FileContents constructor.
     *
     * @param fc      FileContents from which you want to count the regex.
     * @param pattern Pattern to match
     */
    public RegexCounter(FileContents fc, Pattern pattern) {
        this.fileContents = fc;
        this.pattern = pattern;
    }

    /**
     * Regexp count implementation of countItems
     *
     * @return the number of occurances of the regex in the FileContents
     */
    @Override
    protected int countItems() {
        Iterator it = fileContents.iterator();
        int itemCount = 0;
        while (it.hasNext()) {
            String line = (String) it.next();
            Matcher m = pattern.matcher(line);
            int prevStart = 0;
            if (m.find(prevStart)) {
                itemCount++;
            }
        }
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
}
