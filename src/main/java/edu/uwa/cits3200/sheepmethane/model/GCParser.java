import java.io.*;
import java.util.Scanner;
/**
 * Write a description of class GCParser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GCParser
{
    
    /**
     * Constructor for objects of class GCParser
     */
    public GCParser(String fileName) throws IOException {
        readGC(fileName);
    }

    /**
     * Reads in the GC file.
     * 
     * @param  fileName     the file to open
     */
    public void readGC(String fileName) throws IOException {
        StringBuilder text = new StringBuilder();
        String nl = System.getProperty("line.separator"); //detects newline type
        Scanner s = new Scanner(new FileInputStream(fileName), "ISO-8859-1");
        try {
            while (s.hasNextLine())
            text.append(s.nextLine() + nl);
        } finally {
            s.close();
        }
        System.out.println("Read in: " + text);
    }
}
