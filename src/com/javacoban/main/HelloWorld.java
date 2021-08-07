package com.javacoban.main;

import java.util.Scanner;

public class HelloWorld {

    static Scanner scan = new Scanner(System.in);
    static final float PI = 3.1415F;

    public static void main(String[] args) {
        double input = scan.nextDouble();
        int numberStudent = 15;
        long people = 1000;
        float area = 1.234F;
        double doubleNumber = 3.5565;

        System.out.printf("");
        people = numberStudent;
        long total = numberStudent + people;

        int a = numberStudent/2;
        System.out.println("a= " + a);


//        System.out.println(" Hello world ");
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Nhap vao 1 so: ");
//        int number = scan.nextInt();
//        System.out.println("In ra so da nhap: " + number);


//        double doubleNumber = 423432.4;
//        float floatNummber = 123.4F;
//        long l = 123;
//        int i = 432564;
//        System.out.println(i++);
//
//        short s1 = 1;
//        short s2 = 2 ;
//        double total =doubleNumber/i;

//        int x = (-20);
//        int y = x << 1;
//        System.out.println(y);
//
//        int z = y >> 1;
//        System.out.println(z);
//        calculateAreaRectangle();

//        String s = "hellowld4";
//        System.out.println(s.matches("[a-z]*[0-9]+"));

    }

    public static void calculateAreaRectangle() {
        int length;
        int width;
        System.out.println(" Enter length, width of the rectangle: ");
        length = scan.nextInt();
        width = scan.nextInt();
        int area = length * width;
        System.out.printf("The Area of rectangle is: %d", area);
        String ss = new String();
        String s = "Vu Dinh Thang";
    }

    public void calculatePerimeterRectangle() {

    }

    public void solveQuadraticEquation() {
        System.out.print("Enter the value of a: ");
        double a = scan.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = scan.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = scan.nextDouble();
        double d= b * b - 4.0 * a * c;
        if (d> 0.0)
        {
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        }
        else if (d == 0.0)
        {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        }
        else
        {
            System.out.println("Roots are not real.");
        }
    }
}
