package com.coveros.voight.workshops.counter;

import org.testng.annotations.Test;

public class MainTest {

    @Test(enabled = true)
    public void testMain() {
        String[] dirname = {"src/main/resources/"};
        Main.main(dirname);
    }
}