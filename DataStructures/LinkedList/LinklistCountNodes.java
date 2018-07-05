class LinklistCountNodes
{
  Node head;
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
  public void beginning(int d)
  {
    Node newnode=new Node(d);
    Node temp=head;
    head=newnode;
    newnode.next=temp;
  }
  public int nodecount()
  {
    int count=0;
    Node temp=head;
    while(temp!=null)
    {
      count++;
      temp=temp.next;
    }
    return count;
  }
  public void print()
  {
    Node temp=head;
    while(temp!=null)
    {
      System.out.print(temp.data+"\t");
      temp=temp.next;
    }
  }
  public static void main(String args[])
  {
    LinklistCountNodes llist=new LinklistCountNodes();
    llist.beginning(40);
    llist.beginning(30);
    llist.beginning(20);
    llist.beginning(10);
    llist.beginning(50);
    System.out.println("Linklist has "+llist.nodecount()+" nodes!");
    System.out.println("Linklist is ");
    llist.print();
  }
}
