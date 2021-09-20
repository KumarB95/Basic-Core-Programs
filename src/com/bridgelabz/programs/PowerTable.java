package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class PowerTable {
    public static void main(String[] args) {
        Utility utility=new Utility();
        System.out.println("Enter power to 2 (0 to 31) : ");
        int power=utility.getIntValue();
        utility.powerTable(power);
    }
}
