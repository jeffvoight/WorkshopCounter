package com.coveros.voight.workshops.counter;

import java.io.File;

public class Main {

    public Main(String arg) {
        String fName = arg;
        FileContents fc = new FileContents(new File(fName));
        LineCounter l = new LineCounter(fc);
        System.out.println("* * * * * * * * * * * * * * *");
        System.out.println(l.getCount());
    }

    public static void main(String[] args) {
        Main m = new Main(args[0]);
    }
}
