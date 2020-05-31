package com.coveros.voight.workshops.counter.counters;

import com.coveros.voight.workshops.counter.FileContents;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ParagraphCounterTest {
    FileContents fc2;
    FileContents fc3;
    ParagraphCounter pc2;
    ParagraphCounter pc3;

    @BeforeClass
    public void setup() throws IOException {
        fc2 = new FileContents(new File("src/test/resources/twolines.txt"));
        fc3 = new FileContents(new File("src/test/resource/threelines.txt"));
        pc2 = new ParagraphCounter(fc2);
        pc3 = new ParagraphCounter(fc3);
    }
    @Test
    public void testCountItems() {
        Assert.assertEquals(pc2.countItems(), 0);
    }

    @Test
    public void testGetName() {
        Assert.assertEquals(pc3.getName(), "threelines.txt");
    }

}
