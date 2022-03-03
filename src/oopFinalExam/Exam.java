package oopFinalExam;

import java.util.Scanner;

public class Exam {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter String: ");

        String str = myObj.nextLine();

        char[] chars = str.toCharArray();
        int max = 0;
        char MaxChar = 0;
        int bigger = 0;
        char BiggerChar = 0;
        int biggest = 0;
        char BiggestChar = 0;
        for (char c : chars) {
            int index = 0;
            for (int i = 0; i < chars.length; i++) {
                if (c == chars[i]) {
                    index++;
                }
            }
            if (index >= max) {
                max = index;
                MaxChar = c;
            } else if (index >= bigger) {
                bigger = index;
                BiggerChar = c;
            } else if (index >= biggest) {
                biggest = index;
                BiggestChar = c;
            }
        }
        System.out.printf("Max=%s,SecondMax=%s,ThirdMax=%s\n", MaxChar, BiggerChar, BiggestChar);
    }

}
