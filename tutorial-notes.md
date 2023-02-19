# Dots and Dashes 1

Musical notes are often talked about as 'dots' and when displayed on a time line they can appear as 'dashes' which indicate their length. jMusic is a kind of code for describing music, in the same way that the dots and dashes that comprise semaphore is a code for describing letters of the alphabet.  

This series of tutorials will introduce you to both the musical and programming concepts behind jMusic in alternating tutorials.

Programming langauges classsify objects by 'type', for example all whole numbers are of type integer. In jMusic we declare some musical types.  

An object of type Note is being declared here. The object is called 'n.' In the first line n is declared as being of type Note (an instance of the Note class). In the second line n is instantiated (created) and given values.  

Objects are created with the Java keyword new, as in new Note(). The Note constructor takes two arguments, a pitch and a rhythm value. In this case jMusic constants are used for both; C4 is middle C or MIDI note value 60, and QUARTER_NOTE equals the value 1.0 beats.

All jMusic constants are in upper case. Constants make the code easier to read but the values can be replaced by valid numbers if you prefer.

The new keyword is again used and the Phrase constructor takes no arguments in this example. This means that it will use default values.

## The jMusic Data Structure

The musical information in jMusic is stored in a hierarchical fashion based upon a conventional score on paper.

```zsh
Score (Contains any number of Parts)
  |
  +-- Part (contains any number of Phrases)
       |
       +-- Phrase (contains any number of Notes)
             |
             +---- Note (holdsinformation about a single musical event)
```

## Polyphonic Music
There are two ways in which to write polyphonic music in jMusic, and these two paradigms are applied in much the same manner as in the real world. The first is to save multiple voices to a single part. This is analogous to organ fugue where a composer may write for two or more simultaneous parts for one hand to play. The second way in which we can write polyphonic music is to write for two or more parts, as for a woodwind quintet. Furthermore a combination of both techniques can be used.

An orchestral score works similarly to this by containing both monophonic (trumpets, flutes, clarinets etc.) and polyphonic parts like the harp, piano, marimba, and occasionally the string family.