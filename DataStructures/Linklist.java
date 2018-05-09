import java.io.*;
import java.util.Scanner;
class Linklist
{
  static Node head;
  class Node
  {
    int val;
    Node next;
    Node(int data)
    {
       val=data;
       next=null;
    }
  }
  public void insert(int data)
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Where do you want to insert the new data?\n1.Beginning\n2.After a particular element\n3.Before a particula element");
    int selection=in.nextInt();
    switch(selection)
    {
      case 1:
          if(head==null)
          {
            Node head =new Node(data);
            head.next=null;
          }
          Node node=new Node(data);
          node.next=head;
          head=node;
          break;
      case 2:
        System.out.println("Enter the element after which you want to insert this element:");
        int value=in.nextInt();
        Node curr_node=head;
        while(curr_node.next!=null)
        {
          //checks if value present in that node matches with the user entered element(after which the your node is going to be inserted)
          if(curr_node.val==value)
          {
            Node temp;
            Node new_node=new Node(data);
            temp=curr_node.next;
            curr_node.next=new_node;
            new_node.next=temp;
          }
          curr_node=curr_node.next;
        }
    }
  }
public void print()
{
  Node node;
  node=head;
  while(node.next!=null)
  {
    System.out.println(" "+node.val);
    node=node.next;
  }
  System.out.println(" "+node.val);
}
  public static void main (String args[])
  {
    //Scanner in=new Scanner(System.in);
    Linklist l=new Linklist();
    l.insert(10);
    l.insert(120);
    l.insert(1022);
    l.insert(103);
    l.insert(2);
    System.out.println("Head element of link list is: "+head.val);
    l.print();
  }

}
