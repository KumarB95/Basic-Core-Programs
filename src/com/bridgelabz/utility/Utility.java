package com.bridgelabz.utility;

import java.io.PrintWriter;
import java.util.Scanner;

public class Utility {
    Scanner scanner;

    public Utility(){
        scanner =new Scanner(System.in);
    }
    public int getIntValue(){
        return scanner.nextInt();
    }
    public float getFloatValue(){
        return scanner.nextFloat();
    }
    public char getChar(){
        return scanner.next().charAt(0);
    }

    public void flipCoinPer(int flip) {
        int head=0,tail=0;
        for (int i=0;i < flip;i++ ){
            float op= (float) Math.random();
            if (op>0.5)
                head++;
            else
                tail++;
        }
        System.out.println("Head Percentage : "+((head*100)/flip));
        System.out.println("Tail Percentage : "+(100-((head*100)/flip)));
    }

    public void leapYearCheck(int year) {
        if (year % 400==0 && year % 4==0 && year % 100!=0 ){
            System.out.println("This is leap year  : "+year);}
        else{
            System.out.println("This is not leap year  : "+year);}
    }

    public void powerTable(int power) {
        if (power>0 && power<31){
            int powTwo= (int) Math.pow(2,power);
            System.out.format("Power %d of 2 : %d\n",power,powTwo);
            for (int i=1;i<=10;i++){
                System.out.format("%d X %d : %d \n",powTwo,i,(powTwo*i));
            }
        }
        else {
            System.out.println("Enter power in between 0 to 31 ");
        }
    }

    public void harmonicNumber(int number) {
        float sum=1;
        for (int i=2;i<=number;i++){
            sum+= (float) 1/i;
        }
        System.out.println("Harmonic Number : "+sum);
    }

    public void factorCheck(int factorNumber1) {
        // Print the number of 2s that divide n
        while (factorNumber1%2==0)
        {
            System.out.print(2 + " ");
            factorNumber1 /= 2;
        }

        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(factorNumber1); i+= 2)
        {
            // While i divides n, print i and divide n
            while (factorNumber1%i == 0)
            {
                System.out.print(i + " ");
                factorNumber1 /= i;
            }
        }

        // This condition is to handle the case when
        // n is a prime number greater than 2
        if (factorNumber1 > 2)
            System.out.print(factorNumber1);
    }

    public void quotientAndRemainder(int dividend, int divisor) {
        float quotient,remainder;
        System.out.println("Quotient is : "+(dividend/divisor));
        System.out.println("Remainder is : "+(dividend%divisor));
    }

    public void swapNumbers(int a, int b) {
        System.out.format("Before Swap first number %d and second number %d \n",a,b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.format("After Swap first number %d and second number %d",a,b);
    }

    public void checkOddOrEven(int a) {
        if (a%2 == 0){
            System.out.format("Entered number %d is Even",a);
        }
        else {
            System.out.format("Entered number %d is Odd",a);
        }
    }

    public void checkVowelOrConsonant(char a) {
        if (a=='a' || a=='e' ||a=='i' ||a=='o' ||a=='u' ||a=='A' || a=='E' ||a=='I' ||a=='O' ||a=='U' ){
            System.out.println("It is Vowel");
        }
        else {
            System.out.println("It is Consonant");
        }
    }

    public void findLargestofThree(int a, int b, int c) {
        if (a>b && a>c){
            System.out.format("Largest Number %d ",a);
        }
        else if (b>a && b>c){
            System.out.format("Largest Number %d ",b);
        }
        else {
            System.out.format("Largest Number %d ",c);
        }
    }

    public Integer[][] getIntTwoDArray(int m, int n) {
        Integer [][]array=new Integer[m][n];
        System.out.println("Enter "+(m*n)+" Integer Values :");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                array[i][j]=getIntValue();
            }
        }
        return array;
    }

    public <t> void printArray(t[][] array, int m, int n) {
        PrintWriter writer=new PrintWriter(System.out);
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                writer.write("arr["+ i +"]["+ j +"]="+array[i][j] );
                writer.flush();
            }
            System.out.println();
        }
    }

    public Double[][] getDoubleTwoDArray(int m, int n) {
        Double [][]array1=new Double[m][n];
        System.out.println("Enter "+(m*n)+" Double Values :");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                array1[i][j]= scanner.nextDouble();
            }
        }
        return array1;
    }

    public Boolean[][] getBooleanTwoDArray(int m, int n) {
        Boolean [][]array2=new Boolean[m][n];
        System.out.println("Enter "+(m*n)+" Boolean Values :");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                array2[i][j]= scanner.nextBoolean();
            }
        }
        return array2;
    }

    public void printArrayBoolean(Boolean[][] array2, int m, int n) {
        PrintWriter writer=new PrintWriter(System.out);
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                writer.write("arr["+ i +"]["+ j +"]="+array2[i][j] );
                writer.flush();
            }
            System.out.println();
        }
    }

    public void getEuclideanDistance(int x, int y) {
        float distance;
        distance=(float)Math.sqrt((x*x)+(y*y));
        System.out.println("Euclidean Distance : "+distance);
    }

    public void quadratic(int a, int b, int c) {
        float root1,root2;
        int delta;
        delta=((b*b)-(4*a*c));
        root1=(float)(-b + ((Math.sqrt(delta))/(2*a)));
        root2=(float)(-b - ((Math.sqrt(delta))/(2*a)));
        System.out.format("Root 1 %f ,Root 2 %f , Delta %d ",root1,root2,delta);
    }

    public void WindChill(float t, float v) {
        double w;
        w= (float)(35.74)+(0.6215*t)+((0.4275*t)-(35.75))*(Math.pow(v, 0.16));
        System.out.println("Wind Chill : "+w);
    }
}
