package com.javacoban.main;

import java.util.Scanner;

public class DataType {

    public static void main(String[] args) {
        int number1, number2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        number1 = scanner.nextInt();
        System.out.println("Enter number 2: ");
        number2 = scanner.nextInt();
        int area = calculateArea(number1, number2);
        System.out.println("Area: " + area );

        int perimeter = calculatePerimter(number1, number2);
        System.out.println("Perimeter: " + perimeter);
        Math.sqrt(4673563478.432);

    }

    public static int calculateArea(int number1, int number2) {
        return number1 * number2;
    }

    public static int calculatePerimter(int number1, int number2) {
        return 2*(number1 + number2);
    }


}
