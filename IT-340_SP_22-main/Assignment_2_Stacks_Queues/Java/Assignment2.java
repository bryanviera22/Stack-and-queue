import java.util.ArrayList;

public class Assignment2 {
 ArrayList<String> fruit=  new ArrayList<String>(); 
 ArrayList<String> q =  new ArrayList<String>();

 public class Stack {
  
  public void push(String node) {
   fruit.add(node);
  }
  
  public String pop() {
   if(!isEmpty()) {
     String value = fruit.get(fruit.size()-1);
     fruit.remove(fruit.size()-1);
   return value;
   }
   else {
    System.out.println("There is nothing to pop");
      return null;
   }
  }
  public boolean isEmpty() {
    return fruit.size()==0;
  }
  public void printStack() {
 System.out.println("---Stack----");
 //loop structure and print it out

   for(int i=0; i<fruit.size(); i++){

    System.out.println(fruit.get(i));

   }



  }
  
  public Stack() {
     //int i = fruit.size;

    
  }

 }
 
 public class Queue{

  public void enqueue(String node) {



  }


  public String dequeue() {

   //todo
   return null;
  }
  public boolean isEmpty() {

   //todo
   return false;
  }
  public void printQueue() {


  }

  public Queue() {

  }

 }
 
 public Assignment2() {
  Stack fruit= new Stack();
  fruit.pop();
  fruit.push("Apple");
  fruit.push("Banana");
  fruit.pop();
  fruit.push("Canned Yams");
  fruit.push("Durian");
  fruit.printStack();
  fruit.pop();
  fruit.pop();
  fruit.printStack();
  
  Queue q = new Queue();
  q.enqueue("Job 1");
  q.enqueue("Job 2");
  q.enqueue("Job 3");
  q.printQueue();
  q.dequeue();
  q.dequeue();
  q.printQueue();
         
 }
 
 
 public static void main(String[] args) {
  new Assignment2();

 }
}



