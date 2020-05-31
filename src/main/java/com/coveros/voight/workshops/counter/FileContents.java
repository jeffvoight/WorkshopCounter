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

    private final String[] theLines = new String[66000];
    private final String fname;
    private int lines = -1;

    /**
     * File Constructor. Reads a file and stores the results.
     * This constructor is intentionally written like this for a workshop.
     * I promise I would never write bugs like this. Except here. I'm clearly doing it here.
     *
     * @param f the File to read
     */
    public FileContents(File f) {
        fname = f.getName();
        int i = 0;
        BufferedReader buff = null;
        try {
            buff = new BufferedReader(new FileReader(f));
            while (buff.ready()) {
                String theLine = buff.readLine();
                theLines[i++] = theLine;
                lines = i;
            }
        } catch (FileNotFoundException e) {
            log.error("Couldn't find the file!");
        } catch (IOException e) {
            log.error("IO Error in file " + e.getMessage());
        } finally {
            try {
                if (buff != null) {
                    buff.close();
                }
            } catch (IOException ioe) {
                log.error("IOError.");
            }
        }
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
        ArrayList<String> stringArrayList = new ArrayList<>();
        if (lines < 0 || theLines == null || theLines.length == 0) {
            return new Iterator() {
                @Override
                public boolean hasNext() {
                    return false;
                }

                @Override
                @SuppressWarnings("squid:S2272")
                public Object next() {
                    return null;
                }
            };
        }

        for (int i = 0; i < lines; i++) {
            stringArrayList.add(theLines[i]);
        }
        return stringArrayList.iterator();
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
