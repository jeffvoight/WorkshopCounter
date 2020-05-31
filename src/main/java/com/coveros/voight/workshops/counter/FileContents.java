package com.coveros.voight.workshops.counter;

import org.testng.log4testng.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * This reads and stores all the lines in a file.
 */
public class FileContents {
    private Logger log = Logger.getLogger(FileContents.class);

    private final ArrayList<String> theLines = new ArrayList<>();
    private final String fname;
    private int lines = -1;

    /**
     * File Constructor. Reads a file and stores the results.
     * This constructor is intentionally written like this for a workshop.
     * I promise I would never write bugs like this. Except here. I'm clearly doing it here.
     *
     * @param f the File to read
     */
    public FileContents(File f) throws IOException {
        fname = f.getName();
        int i = 0;
        BufferedReader buff = new BufferedReader(new FileReader(f));
            while (buff.ready()) {
                String theLine = buff.readLine();
                theLines.add(theLine);
                lines = i;
            }
        buff.close();
    }

    /**
     * Returns an iterator of the lines in the file.
     * If the file is empty, returns an empty iterator.
     * <p>
     * I don't want to spoil any surprises.
     *
     * @return hint: it's the whole thing
     */
    public Iterator iterator() {
        return theLines.iterator();
    }

    /**
     * Gets the name of the file
     *
     * @return String containing the name of the file.
     */
    public String getName() {
        return fname;
    }
}
