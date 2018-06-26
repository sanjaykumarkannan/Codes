// A program to reverse an array in java
import java.util.Scanner;
class Program2
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array:");
    int s1=sc.nextInt();
    int arr[]=new int[s1];
    for(int i=0;i<arr.length;i++)
    {
      arr[i]=sc.nextInt();
    }
    for(int i=arr.length-1;i>=0;i--)
    {
        System.out.print(arr[i]+" ");
    }
  }
}
