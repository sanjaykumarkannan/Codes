import java.util.Scanner;
import java.lang.*;//Math.pi function is present inside java.lang.Math module

class Circle
{
  public static void main(String args[])
  {
    System.out.println("Enter radius of the circle:");
    Scanner sc=new Scanner(System.in);
    double rad=sc.nextDouble();
    double area=Math.PI*rad*rad;
    double per=2*Math.PI*rad;
    System.out.println("Area of circle is: "+area);
    System.out.println("Perimeter of circle is: "+per);
  }
}
