package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class LeapYear {
    public static void main(String[] args) {
        Utility utility=new Utility();
        System.out.println("Enter Year you want to check Leap year or not : ");
        int year=utility.getIntValue();
        utility.leapYearCheck(year);
    }
}
