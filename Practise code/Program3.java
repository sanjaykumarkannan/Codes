//find no of odd and even no's in a array
import java.util.Scanner;
class Program3
{
  public static void main(String args[])
  {
    int array[]=new int[]{3,32,5,54,6};
    int odd=0,even=0;
    for(int i=0;i<array.length;i++)
    {
      if(array[i]%2==0)
      {
        even++;
      }
      else
      {
        odd++;
      }
  }
  System.out.println("EVEN NO:"+even+"\nODD NO:"+odd);
}
}
