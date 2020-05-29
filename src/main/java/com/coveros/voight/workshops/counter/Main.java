package com.coveros.voight.workshops.counter;

import java.io.File;
import java.util.regex.Pattern;

public class Main {

    public Main(String arg) {
        String fName = arg;
        FileContents fc = new FileContents(new File(fName));
        LineCounter l = new LineCounter(fc);
        ParagraphCounter p = new ParagraphCounter(fc);
        RegexCounter r = new RegexCounter(fc, Pattern.compile("The", Pattern.CASE_INSENSITIVE));
        System.out.println("* * * * * * * * * * * * * * *");
        System.out.println(l.getCount());
        System.out.println(p.getCount());
        System.out.println(r.getCount());
    }

    public static void main(String[] args) {
        Main m = new Main(args[0]);
    }
}
