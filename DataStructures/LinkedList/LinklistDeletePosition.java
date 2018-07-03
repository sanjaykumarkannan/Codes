//This program will delete a node in a link list at particular position
import java.util.Scanner;
class LinklistDeletePosition
{
  Node head=null;
  Node prev;
  static class Node
  {
    int data;
    Node next;
    Node(int val)
    {
      data=val;
      next=null;
    }
  }
  public void beginning(int value)
  {
    Node newnode=new Node(value);
    Node temp=head;
    head=newnode;
    newnode.next=temp;
  }
  public void print()
  {
    Node temp=head;
    while(temp.next!=null)
    {
      System.out.print(temp.data+"\t");
      temp=temp.next;
    }
      System.out.print(temp.data);
  }
  public void deletenode(int pos)
  {
    if(pos==0)
    {
      head=head.next;
    }
    Node temp=head;

    for(int i=0;i<pos;i++)
    {
      prev=temp;
      temp=temp.next;
    }
    prev.next=temp.next;
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    LinklistDeletePosition llist=new LinklistDeletePosition();
    llist.beginning(10);
    llist.beginning(20);
    llist.beginning(30);
    llist.beginning(40);
    System.out.println("Enter position of node which has to be deleted:");
    int p=in.nextInt();
    llist.deletenode(p);
    llist.print();
  }
}
