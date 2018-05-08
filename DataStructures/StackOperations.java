import java.io.*;
import java.util.*;
class StackOperations
{
  static void stack_push(Stack<Integer> stack)
  {
    System.out.println("Enter the no of elements you wanna push:");
    Scanner s=new Scanner(System.in);
    int no=s.nextInt();
    int arr[]=new int[no];
    for(int i=0;i<no;i++)
    {
      arr[i]=s.nextInt();
      stack.push(arr[i]);
    }
  }
  static void stack_pop(Stack<Integer> stack)
  {
    System.out.println("Pop elements in stack:");
    //System.out.println(stack.size());
    for(int j=0;j<stack.size();j++)
    {
    Integer p=(Integer)stack.pop();
    System.out.println(p);
    }
  }
  static void stack_peek(Stack<Integer> stack)
  {
    System.out.println("Value at top of stack is ");
    Integer pe=(Integer)stack.peek();
    System.out.println(pe);
  }
  static void stack_search(Stack<Integer> stack,int element)
  {

    Integer pos=(Integer) stack.search(element);
    if(pos==-1)
    {
      System.out.println("Element not found");
    }
    else
    {
    System.out.println("Position of element you searched is "+pos);
    }
  }
  public static void main(String args[])
  {
    //StackOperations so=new StackOperations();
    Stack<Integer> stack=new Stack<Integer>();
    stack_push(stack);
    stack_peek(stack);
    stack_search(stack,5);
    stack_pop(stack);
  }
}
