package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class WindChill {
    public static void main(String[] args) {
        Utility utility=new Utility();
        System.out.println("Enter Temperature(in Fahrenheit) and Velocity(miles per hour)  : ");
        float t =utility.getFloatValue();
        float v =utility.getFloatValue();
        utility.WindChill(t,v);
    }
}
