package com.coveros.voight.workshops.counter;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class FileContents {
    private int lines = -1;
    private final String[] theLines = new String[10000];
    private final String fname;

    /**
     * This constructor is intentionally written like this for a workshop.
     * I promise I would never write bugs like this. Except here. I'm clearly doing it here.
     * @param f
     */
    public FileContents(File f){
        fname = f.getName();
        int i=0;
        try {
            BufferedReader buff = new BufferedReader(new FileReader(f));
            while(buff.ready()){
                String theLine = buff.readLine();
                theLines[i++] = theLine;
                lines = i;
            }
        } catch (FileNotFoundException e) {
            System.err.println("Couldn't find the file!");
        } catch (IOException e) {
            System.err.println("IO Error in file " + e.getMessage());
        }
    }

    /**
     * I don't want to spoil any surprises.
     * @return hint: it's the whole thing
     */
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

    public String getName() {
        return fname;
    }
}
