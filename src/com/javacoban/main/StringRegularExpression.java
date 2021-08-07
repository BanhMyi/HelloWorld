package com.javacoban.main;

public class StringRegularExpression {

    public static void main(String[] args) {
        String string;
        /* .: any character
        [abc]: exactly given letters
        [abc][vz]: either first or second set
        [^abc]: except abc
        [a-z1-7]: a-z or 1-7
        A|B: A or B
        XZ: exactly XZ

        \d: digits
        \D: not digits
        \s: Space
        \S: not space
        \w: alphabets or digits
        \W: neither alphabets nor digits

        *: 0 or more times
        +: 1 or more times
        ?: 0 or 1 time
        {X}: X times
        {X, Y}: between X and Y times

         */

//        string = "a";
//        System.out.println(string.matches("."));
//
//        string = "av";
//        System.out.println(string.matches("[ac][vz]"));
//        string = "abc";
//        System.out.println(string.matches("[a-z]*"));

//        string = "hau@gmail.com";
//        System.out.println(string.matches("\\w*@*(.*)"));
 //       isBinaryNumber(10101);
 //       checkDateFormat("19/12/1995");
        // replace special characters
        string = "a@dasf%fsgfd*";
        System.out.println(string.replaceAll("\\W", "")); ///[^a-zA-Z0-9]
    }


    public static void isBinaryNumber(int number) {
        String s = String.valueOf(number);
        // Binary has only 0, 1
        System.out.println(s.matches("[01]*"));         // =>+
    }

    public static void checkDateFormat(String date) {
        // dd/mm/yyyy
        System.out.println(date.matches("[0-3]\\d/[0-1]\\d/\\d{4}"));
    }
}
