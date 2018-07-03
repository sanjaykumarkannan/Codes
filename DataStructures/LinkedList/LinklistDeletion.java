class LinklistDeletion
{
  Node head;
  Node prev=null;

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
    Node ptr=head;
    while(ptr.data!=element)
    {
      ptr=ptr.next;
    }
    Node newnode=new Node(value);
    newnode.next=ptr.next;
    ptr.next=newnode;
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
    Node temp=head;
    while(temp.next!=null)
    {
      System.out.print(temp.data+"\t");
      temp=temp.next;
    }
      System.out.print(temp.data+"\t");
  }

 public void deletee(int value)
  {
      Node temp=head;
      if (temp != null && temp.data == value)// when the first node has the value
          {
              head = temp.next; // Changed head
              return;
          }

      while(temp!=null && temp.data!=value)
      {
        prev=temp;
        temp=temp.next;
      }

      if(temp==null) //when no node is present
        return;
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
    System.out.println("\nLinklist after deletion:");
    llist.print();
  }
}
