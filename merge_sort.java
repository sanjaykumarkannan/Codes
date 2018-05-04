import java.io.*;
import java.util.*;

class merge_sort
{
  public void merge(int arr[],int l,int m,int r)
  {
    int s1=m-l+1;
    int s2=r-m;
    int L[]=new int[s1];
    int R[]=new int[s2];
    for(int i=0;i<s1;i++)
    {
      L[i]=arr[l+i];
    }
    for(int j=0;j<s2;j++)
    {
      R[j]=arr[m+1+j];
    }
    int i=0,j=0;
    int k=l;
    while(i<s1 && j<s2)
    {
      if(L[i]<=R[i])
      {
        arr[k]=L[i];
        i++;
        k++;
      }
      else
      {
        arr[k]=R[j];
        j++;
        k++;
      }
    }
    while(i<s1)
    {
      arr[k]=L[i];
      i++;
      k++;
    }
    while(j<s2)
    {
      arr[k]=R[j];
      j++;
      k++;
    }
  }
  public void sort(int arr[],int l,int r)
  {
    if(l<r)
    {
      //int m=(l+r)/2;
      int m=l+(r-l)/2;
      sort(arr,l,m);
      sort(arr,m+1,r);
      merge(arr,l,m,r);
    }
  }
  public static void main(String args[])
  {
    int arr[]={10,5,20,30,15,25,80,40};
    merge_sort ms=new merge_sort();
    int len=arr.length;
    ms.sort(arr,0,len-1);
    System.out.println("Sorted array is: ");
    for(int i=0;i<len-1;i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
}
