package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class checkVowelOrConsonant {
    public static void main(String[] args) {
        Utility utility=new Utility();
        System.out.println("Enter a character : ");
        char a =utility.getChar();
        utility.checkVowelOrConsonant(a);
    }
}
