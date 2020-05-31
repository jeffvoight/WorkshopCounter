package com.coveros.voight.workshops.counter.counters;

import com.coveros.voight.workshops.counter.FileContents;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

public class RegexCounterTest {
    FileContents fc2;
    FileContents fc3;
    RegexCounter pc2;
    RegexCounter pc3;

    @BeforeClass
    public void setup() throws IOException {
        fc2 = new FileContents(new File("src/test/resources/twolines.txt"));
        fc3 = new FileContents(new File("src/test/resources/threelines.txt"));
        pc2 = new RegexCounter(fc2, Pattern.compile("This"));
        pc3 = new RegexCounter(fc3, Pattern.compile("third"));
    }

    @Test
    public void testGetCount() {
        Assert.assertEquals(pc2.getCount(), 2);
    }

    @Test
    public void testGetName() {
        Assert.assertEquals(pc3.getName(), "threelines.txt");
    }
}
