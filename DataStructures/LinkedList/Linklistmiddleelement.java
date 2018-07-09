class Linklistmiddleelement
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
  public void push(int val)
  {
    Node newnode=new Node(val);
    Node temp=head;
    head = newnode;
    newnode.next=temp;
  }
  public void middleelement()
  {
    int count=0;
    Node temp=head;
    while(temp!=null)
    {
      count++;
      temp=temp.next;
    }
    int midptr=count/2;
    if(count%2==0)//if size of linklist is even the centre two no's should be printed;
    {
      int count1=0;
      temp=head;
      while(temp!=null)
      {
        count1++;
        if(count1==midptr)
        {
          System.out.println(temp.data+"\t");
        }
        if(count1==midptr+1)
        {
          System.out.println(temp.data);
          return;
        }
        temp=temp.next;
      }
    }
    else
    {
      temp=head;
      int count1=0;
      while(temp!=null)
      {
        count1++;
        if(count1==midptr+1)//doing midptr+1 because 5/2 will be rounded of as 2 by java so midptr+1 will point to the third node or the middle node
        {
          System.out.println(temp.data);
        }
        temp=temp.next;
      }
    }
  }
  public static void main(String args[])
  {
    Linklistmiddleelement llist=new Linklistmiddleelement();
    llist.push(10);
    llist.push(20);
    llist.push(30);
    llist.push(40);
    llist.push(50);
    llist.push(60);
    llist.middleelement();
    //System.out.println(7/2);
  }
}
