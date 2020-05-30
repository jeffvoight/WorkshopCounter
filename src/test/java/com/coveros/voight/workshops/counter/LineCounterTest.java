package com.coveros.voight.workshops.counter;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Iterator;

import static org.mockito.Mockito.when;


public class LineCounterTest {
    FileContents fc= new FileContents(new File("src/test/resources/twolines.txt"));
    FileContents fc2 = new FileContents(new File("src/test/resources/twolines.txt"));
    FileContents fc3 = new FileContents(new File("src/test/resource/threelines.txt"));
    LineCounter lc = new LineCounter(fc);

    @Test
    public void testCountItems() {
        Assert.assertEquals(lc.countItems(), 2);
    }

    @Test
    public void testGetName() {
        Assert.assertEquals(lc.getName(), "twolines.txt");
    }

    @Test
    public void testCompareTo() {
    }

    @Test
    public void testGetCount() {
    }

}
