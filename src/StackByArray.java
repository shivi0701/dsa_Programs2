import java.util.Scanner;

public class StackByArray {
    int[] arr;
    int top;
    public StackByArray(int size){
        arr= new int[size];
        top=-1;
    }
    public boolean isFullStack(){
        if(top==arr.length-1){
            System.out.println("Stack is full");
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public void push(int val){
        if (isFullStack()){
            System.out.println("Stack Overflow Error");
        }
        else {
            arr[top+1]=val;
            top++;
            System.out.println("Successfully inserted");
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow Error");
        }
        else {
            System.out.println(arr[top]);
            top--;
        }
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            System.out.println(arr[top]);
        }
    }
    public void delete(){
        arr=null;
        System.out.println("Stack deleted");
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input the size of Stack");
        StackByArray sta= new StackByArray(sc.nextInt());
       while (true){
           System.out.println("""
                    Enter your choice\s
                     1) To push the element\s
                     2) to pop the element\s
                     3) To peek the Stack\s
                     4) to delete the stack\s
                     5) exit""");
           System.out.println("Enter your choice");
           int c = sc.nextInt();
           switch (c) {
               case 1 -> sta.push(sc.nextInt());
               case 2 -> sta.pop();
               case 3 -> sta.peek();
               case 4 -> sta.delete();
               case 5 -> System.exit(0);
           }
       }
    }
}