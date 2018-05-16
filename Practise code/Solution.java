import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  static String readString()
{
  Scanner scanner = new Scanner(System.in);
  return scanner.nextLine();
}

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
    int a;
    double b;
    String c="";
    a=scan.nextInt();
    b=scan.nextDouble();
    c=readString();

/* Read and save an integer, double, and String to your variables.*/
// Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
    System.out.println(i+a);
    System.out.println(d+b);
    System.out.println(s+""+c);
/* Print the sum of both integer variables on a new line. */

/* Print the sum of the double variables on a new line. */

/* Concatenate and print the String variables on a new line;
  the 's' variaouble above should be printed first. */
      }

}
