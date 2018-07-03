class LinklistDeletion
{
  Node head;
  Node prev;

  class Node
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
    Node ptr=head;
    while(ptr.data!=element)
    {
      ptr=ptr.next;
    }
    Node newnode=new Node(value);
    newnode.next=ptr.next;
    ptr.next=newnode;
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
  public void deletee(int value)
  {
      Node temp=head;
      if (temp != null && temp.data != value)
          {
              head = temp.next; // Changed head
              return;
          }

      while(temp!=null && temp.data!=value)
      {
        prev=temp;
        temp=temp.next;
      }
      prev.next=temp.next;
  }
  public static void main(String args[])
  {
    LinklistDeletion llist=new LinklistDeletion();
    llist.beginning(10);
    llist.end(50);
    llist.beginning(30);
    llist.after(30,45);
    System.out.println("Linklist before deletion:");
    llist.print();
    llist.deletee(45);
    System.out.println("Linklist after deletion:");
    llist.print();
  }
}
