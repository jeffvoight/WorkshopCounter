package com.coveros.voight.workshops.counter.counters;

import com.coveros.voight.workshops.counter.FileContents;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

/**
 * There's are intentionally corrupt tests in here.
 */
public class LineCounterTest {
    FileContents fc2 = new FileContents(new File("src/test/resources/twolines.txt"));
    FileContents fc3 = new FileContents(new File("src/test/resource/threelines.txt"));
    LineCounter lc2 = new LineCounter(fc2);
    LineCounter lc3 = new LineCounter(fc3);

    @Test
    public void testCountItems() {
        Assert.assertEquals(lc2.getCount(), 2);
    }

    @Test
    public void testGetName() {
        Assert.assertEquals(lc2.getName(), "twolines.txt");
    }

    @Test
    public void testCompareTo() {
        Assert.assertTrue(lc2.compareTo(lc3) > 0); // twolines should be less than threelines
    }

    @Test
    public void testGetCount() {
        Assert.assertEquals(lc2.getCount(), 2);
    }

}
