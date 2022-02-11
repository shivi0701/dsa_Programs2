package Nodes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StackByLinkedList{
    nodeS top = null;
   public boolean isEmptyStack(){
       return (top==null);
   }
   public boolean isFullStack(){
       System.out.println("Never be full can be pushed");
       return false;
   }
   public void push(int data){                   //overloading
       nodeS newnode= new nodeS(data);
       if(isEmptyStack()){
           top=newnode;
       }
       else {
           newnode.setNext(top);
           top=newnode;
       }
   }
   public void push(){
       Scanner s= new Scanner(System.in);
       try {
           int tdata=s.nextInt();
           nodeS newnode= new nodeS(tdata);
       }catch (InputMismatchException e){
           System.out.println(e);
       }
   }
   public int pop(){
       int result=0;
       if(isEmptyStack()){
           System.out.println("empty");
       }
       if(!isEmptyStack()){
           result= top.getData();
           top=top.getNext();
           return result;
       }
       return 0;
   }
}
class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StackByLinkedList sll= new StackByLinkedList();
        while (true){
            System.out.println("""
                    Enter your choice\s
                     1) To insert the node in Stack\s
                     2) to make the node in stack by data\s
                     3) to remove the node from Stack\s
                     4) To check the stack is Empty or not\s
                     5) to check the stack is full or not\s
                     6) exit""");
            System.out.println("Enter your choice");
            int c = sc.nextInt();
            switch (c) {
                case 1 -> sll.push(sc.nextInt());
                case 2 -> sll.push();
                case 3 -> sll.pop();
                case 4 -> sll.isEmptyStack();
                case 5 -> sll.isFullStack();
                case 6 -> System.exit(0);
            }
        }
    }
}


