package com.coveros.voight.workshops.counter.counters;

import com.coveros.voight.workshops.counter.FileContents;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.regex.Pattern;

public class RegexCounterTest {
    FileContents fc2 = new FileContents(new File("src/test/resources/twolines.txt"));
    FileContents fc3 = new FileContents(new File("src/test/resources/threelines.txt"));
    RegexCounter pc2 = new RegexCounter(fc2, Pattern.compile("This"));
    RegexCounter pc3 = new RegexCounter(fc3, Pattern.compile("third"));


    @Test
    public void testGetCount() {
        Assert.assertEquals(pc2.getCount(), 2);
    }

    @Test
    public void testGetName() {
        Assert.assertEquals(pc3.getName(), "threelines.txt");
    }
}
