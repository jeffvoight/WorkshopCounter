package com.coveros.voight.workshops.counter.counters;

import com.coveros.voight.workshops.counter.FileContents;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class ParagraphCounterTest {
    FileContents fc2 = new FileContents(new File("src/test/resources/twolines.txt"));
    FileContents fc3 = new FileContents(new File("src/test/resource/threelines.txt"));
    ParagraphCounter pc2 = new ParagraphCounter(fc2);
    ParagraphCounter pc3 = new ParagraphCounter(fc3);

    @Test
    public void testCountItems() {
        Assert.assertEquals(pc2.countItems(), 0);
    }

    @Test
    public void testGetName() {
        Assert.assertEquals(pc3.getName(), "threelines.txt");
    }

}
