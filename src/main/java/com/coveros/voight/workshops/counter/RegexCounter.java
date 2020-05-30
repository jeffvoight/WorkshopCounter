package com.coveros.voight.workshops.counter;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCounter extends Counter {
    private final FileContents fileContents;
    private final Pattern pattern;

    public RegexCounter(FileContents fc, Pattern pattern) {
        this.fileContents = fc;
        this.pattern = pattern;
    }

    @Override
    protected int countItems() {
        Iterator it = fileContents.iterator();
        int itemCount = 0;
        while(it.hasNext()){
            String line = (String)it.next();
            Matcher m = pattern.matcher(line);
            int prevStart = 0;
            if(m.find(prevStart)) {
                itemCount++;
            }
        }
        return itemCount;
    }

    @Override
    public String getName() {
        return fileContents.getName();
    }
}
