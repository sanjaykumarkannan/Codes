//Write a Java program to create a new string taking first and last
//characters from two given strings. If the length of either string is 0 use "#" for missing character.
import java.util.Scanner;
import java.lang.*;

class Program1
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter two strings:");
      System.out.println("String 1:");
      String s1=sc.nextLine();
      System.out.println("String 2:");
      String s2=sc.nextLine();
      if(s1.length()>1 && s2.length()>1)
      {
        StringBuilder str=new StringBuilder();
        str.append(s1.charAt(0));
        str.append(s1.charAt(s1.length()-1));
        str.append(s2.charAt(0));
        str.append(s2.charAt(s2.length()-1));
        System.out.println(str);
      }
  }
}
