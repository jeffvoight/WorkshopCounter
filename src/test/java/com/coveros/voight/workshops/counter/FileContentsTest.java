package com.coveros.voight.workshops.counter;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Iterator;

public class FileContentsTest {
    FileContents c = new FileContents(new File("src/test/resoures/threelines.txt"));

    @Test
    public void testIterator() {
        Iterator iterator = c.iterator();
        Assert.assertTrue(iterator != null);
    }

    @Test
    public void testGetName() {
        Assert.assertEquals(c.getName(), "threelines.txt");
    }
}
