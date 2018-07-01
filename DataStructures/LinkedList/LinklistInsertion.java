class LinklistInsertion
{
  Node head;
  static class Node
  {
    int data;
    Node next;
    Node(int d)
    {
      data=d;
      next=null;
    }
  }
  public void beginning(int value)
  {
    Node newnode=new Node(value);
    newnode.next=head;
    head=newnode;
  }
  public void after(int element,int value)
  {
    Node newnode=new Node(value);
    Node current=head;
    while(current.data!=element)
    {
      current=current.next;
    }
    Node temp;
    temp=current.next;
    current.next=newnode;
    newnode.next=temp;
  }
  public void end(int value)
  {
    Node newnode=new Node(value);
    Node last=head;
    while(last.next!=null)
    {
      last=last.next;
    }
    last.next=newnode;
    newnode.next=null;
  }
  public void print()
  {
    while(head.next!=null)
    {
      System.out.print(head.data+"\t");
      head=head.next;
    }
        System.out.print(head.data+"\t");
  }
  public static void main(String args[])
  {
    LinklistInsertion llist=new LinklistInsertion();
    llist.beginning(10);
    llist.end(20);
    llist.after(10,15);
    llist.after(15,30);
    llist.print();
  }

}
