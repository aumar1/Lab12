package edu.cscc;

//Adil Umar, 11/19/19, Read file and add unique words to set

import java.io.File;
import java.util.Set;

public class Main {
    private static final String fname = "AtTheMountainsOfMadness_HP_Lovecraft.txt";

    public static void main(String[] args) {
        File myfile = new File(fname);
        Set<String> uniques = UniqueWords.processDocument(myfile);
        for (String s : uniques) {
            System.out.println(s);
        }
        System.out.println("Got "+uniques.size()+" words");
    }
}
