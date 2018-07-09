//Swapping node in a linked list
class Linklistswapnodes
{
  Node head;
  Node prev=null;
  Node addrv1;
  Node addrv2;
  Node prev1;
  Node prev2;
  Node temp1;
  Node temp2;
  class Node
  {
    int data;
    Node next;
    Node(int val)
    {
      data=val;
      next=null;
    }
  }
  public void push(int d)
  {
    Node temp=head;
    Node newnode=new Node(d);
    head=newnode;
    head.next=temp;
  }
  public void swap(int v1,int v2)
  {
    Node temp=head;

    while(temp!=null)
    {
        if(temp.data==v1)
        {
          prev1=prev;
          addrv1=temp;
        }
        if(temp.data==v2)
        {
          prev2=prev;
          addrv2=temp;
        }
      prev=temp;
      temp=temp.next;
    }
    temp1=prev1.next;
    prev1.next=addrv2;
    temp2=addrv2.next;
    addrv2.next=addrv1.next;
    prev2.next=addrv1;
    addrv1.next=temp2;
  }
  public void print()
  {
    Node temp=head;
    while (temp!=null)
    {
      System.out.print(temp.data+"\t");
      temp=temp.next;
    }
  }
  public static void main (String args[])
  {
  Linklistswapnodes llist=new Linklistswapnodes();
  llist.push(10);
  llist.push(20);
  llist.push(30);
  llist.push(40);
  llist.push(50);
  llist.push(60);
  System.out.println("Linklist before swapping:\n");
  llist.print();
  llist.swap(20,30);
  System.out.println("\nLinklist after swapping:\n");
  llist.print();
  }
}
