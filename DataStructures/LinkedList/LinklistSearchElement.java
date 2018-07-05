//This program will search for an element in a linklist and returs yes if available else no
class LinklistSearchElement
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
  public void push(int val) //Creates a newnode at the beginning of the linklist.
  {
    Node newnode=new Node(val);
    Node temp=head;
    head=newnode;
    newnode.next=temp;
  }
  public boolean searchelement(Node temp,int val)
  {
    while(temp!=null)
    {
      if(temp.data==val)
        return true;
      temp=temp.next;
    }
    return false;
  }
  public static void main(String args[])
  {
    LinklistSearchElement llist=new LinklistSearchElement();
    llist.push(10);
    llist.push(20);
    llist.push(30);
    llist.push(40);
    if(llist.searchelement(llist.head,15))
    {
      System.out.println("Yes, the data is present.");
    }
    else
    {
      System.out.println("No its not available.");
    }
  }
}
