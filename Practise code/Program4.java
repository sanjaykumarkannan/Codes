// Java program to find whether an array
// is subset of another array
 class Program4
 {
   static boolean subset(int arr1[],int arr2[],int p,int q)
   {
      for(int i=0;i<q;i++)
      {
        for(int j=0;j<p;j++)
        {
          if(arr2[i]==arr1[j])
             break;
          else if (j==p)
            return false;
        }
      }
      return true;
   }
   public static void main(String args[])
   {
     int a1[]={1,2,3,4,5,6};
     int a2[]={2,3,4,8};
     int m=a1.length;
     int n=a2.length;
     if(subset(a1,a2,m,n))
     {
       System.out.println("a2 is a subset of a1");
     }
     else
     {
       System.out.println("a2 is not a subset of a1");
     }
   }
 }
