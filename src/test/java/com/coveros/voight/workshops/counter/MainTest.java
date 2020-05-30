package com.coveros.voight.workshops.counter;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MainTest {

    @Test
    public void testMain() {
        String[] dirname = {"src/main/resources/"};
        Main.main(dirname);
    }
}