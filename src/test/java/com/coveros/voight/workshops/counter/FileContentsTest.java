package com.coveros.voight.workshops.counter;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class FileContentsTest {
    FileContents fc;

    @BeforeClass
    public void setup() throws IOException {
        fc = new FileContents(new File("src/test/resoures/threelines.txt"));
    }
    @Test
    public void testIterator() {
        Iterator iterator = fc.iterator();
        Assert.assertTrue(iterator != null);
    }

    @Test
    public void testGetName() {
        Assert.assertEquals(fc.getName(), "threelines.txt");
    }
}
