
package problemSolving;

import java.util.Scanner;


public class Squaretest {
    public static void main(String[] args) {
        square s1=new square();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int answer=s1.square(n);
        System.out.println("The square value of "+n+" is : "+answer);
    }
}
