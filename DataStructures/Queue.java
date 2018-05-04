import java.io.*;
import java.util.*;
class Queue
{
  int front,rear,size;
  int array[];
  public Queue(int capacity)
  {
    this.array=new int[capacity];
    this.front=this.rear=-1;
    this.size=0;
  }
  public void enqueue(int num)
  {
    if(this.front==-1)
    {
      this.front=this.front+1;
      this.array[this.front]=num;
      this.rear=this.rear+1;
      this.size=this.size+1;
      System.out.println(num+ " enqueued to queue!");
    }
    else if(this.rear==999)
    {
      System.out.println("Queue is full!");
    }
    else
    {
      this.rear=this.rear+1;
      this.array[this.rear]=num;
      this.size=this.size+1;
      System.out.println(num+ " enqueued to queue!");
    }
  }
 public void dequeue()
  {
    if(this.front==-1)
    {
      System.out.println("Stack is already empty!");
    }
    int deq;
    deq=this.array[this.front];
    System.out.println(deq+ " dequeued from queue!");
    this.front=this.front+1;
    this.size=this.size-1;
  }
  public void front()
  {
    System.out.println("Front value in queue is: "+this.array[this.front]);
  }
  public void rear()
  {
    System.out.println("Rear value in queue is: "+this.array[this.rear]);
  }
  public static void main(String args[])
  {
    Queue q=new Queue(500);
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.dequeue();
    q.dequeue();
    q.enqueue(40);
    q.front();
    q.rear();
  }
}
