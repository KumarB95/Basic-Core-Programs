package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Distance {
    public static void main(String[] args) {
        Utility utility=new Utility();
        System.out.println("Enter Co-ordinate to calculate Euclidean Distance from origin (0,0) : ");
        int x =utility.getIntValue();
        int y=utility.getIntValue();
        utility.getEuclideanDistance(x,y);
    }
}
