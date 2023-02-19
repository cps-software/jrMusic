/*
 * jMusic Tutorial
 * Simple example
 */
import jm.music.data.*;
import jm.JMC;
import jm.util.*;
 
public class Dot01 implements JMC {

    public static void main(String[] args) { 
        Note n = new Note(C4, QUARTER_NOTE);
        Phrase phr = new Phrase();
        phr.addNote(n);
        
        View.notate(phr);
    }
}