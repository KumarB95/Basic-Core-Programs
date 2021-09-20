package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class FlipCoin {
    public static void main(String[] args) {
        Utility utility=new Utility();
        System.out.println("Enter Number of times you want to Flip : ");
        int flip=utility.getIntValue();
        utility.flipCoinPer(flip);
    }
}
