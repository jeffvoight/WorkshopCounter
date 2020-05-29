package com.coveros.voight.workshops.counter;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class FileContents {
    private int lines = -1;
    private final String[] theLines = new String[100000];

    public FileContents(File f){
        int i=0;
        try {
            BufferedReader buff = new BufferedReader(new FileReader(f));
            while(buff.ready()){
                String theLine = buff.readLine();
                theLines[i++] = theLine;
                lines = i;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Iterator iterator() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        if(lines < 0 || theLines == null || theLines.length == 0){
            return new Iterator() {
                @Override
                public boolean hasNext() {
                    return false;
                }

                @Override
                public Object next() {
                    return null;
                }
            };
        }

        for(int i = 0; i < lines; i++){
            stringArrayList.add(theLines[i]);
        }
        return stringArrayList.iterator();
    }
}
