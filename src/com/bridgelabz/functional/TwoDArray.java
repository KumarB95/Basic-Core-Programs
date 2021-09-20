package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class TwoDArray {
    public static void main(String[] args) {
        Utility utility=new Utility();
        int m=0,n=0,select;
        System.out.println("Enter your choice to enter type of array you want : \n 1. Integer 2. Double 3. Boolean");
        select = utility.getIntValue();
        if (select>0 && select <=3){
            System.out.println("Enter number of Rows and Column :");
            m=utility.getIntValue();
            n= utility.getIntValue();

            switch (select){
                case 1:
                    Integer[] [] array=utility.getIntTwoDArray(m,n);
                    utility.printArray(array,m,n);
                    break;
                case 2:
                    Double[] [] array1=utility.getDoubleTwoDArray(m,n);
                    utility.printArray(array1,m,n);
                    break;
                case 3:
                    Boolean[][] array2=utility.getBooleanTwoDArray(m,n);
                    utility.printArrayBoolean(array2,m,n);
                    break;
            }
        }
        else {
            System.out.println("Please Enter Correct Choice !");
        }

    }
}
