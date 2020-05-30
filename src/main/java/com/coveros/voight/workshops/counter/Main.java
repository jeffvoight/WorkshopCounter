package com.coveros.voight.workshops.counter;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Main {

    public Main(String arg) {
        String dirName = arg;
        File f = new File(dirName);
        File[] files = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        });
        LineCounter[] lineCounterArray = new LineCounter[files.length];
        for(int i = 0; i < files.length; i++){
            FileContents fc = new FileContents(files[i]);
            LineCounter l = new LineCounter(fc);
            lineCounterArray[i] = l;
            ParagraphCounter p = new ParagraphCounter(fc);
            RegexCounter r = new RegexCounter(fc, Pattern.compile("The", Pattern.CASE_INSENSITIVE));
            System.out.println("* * * * * * * * * * * * * * *");
            System.out.println(l.getCount());
            System.out.println(p.getCount());
            System.out.println(r.getCount());
        }

        Arrays.sort(lineCounterArray);

        for(int i = 0; i < files.length; i++){
            System.out.println(lineCounterArray[i].getName() + " is " + lineCounterArray[i].countItems() + " lines long.");
        }

    }

    public static void main(String[] args) {
        Main m = new Main(args[0]);
    }
}
