import java.util.Scanner;

public class BinaryTreeByArray {
    int[] arr;
    int lastusedindex;
    public BinaryTreeByArray(int size){
        arr= new int[size+1];
        lastusedindex=0;
    }
    public void insert(int value){
        if(arr.length-1==lastusedindex){
            System.out.println("Array is Full");
        }
        else {
            arr[lastusedindex+1]=value;
            lastusedindex++;
        }
    }
    // Preorder Traversal
    public void pretraversal(int index){
        if(index> lastusedindex){
            return;
        }
        System.out.println(arr[index]);
        pretraversal(index*2);
        pretraversal(index*2+1);
    }
    // inorder traversal
    public void intraversal(int index){
        if(index>lastusedindex){
            return;
        }
        intraversal(index*2);
        System.out.println(arr[index]);
        intraversal(index*2+1);
    }
    // search the node
    public void search(int ele){
        int c=0;
       for(int i=1;i<arr.length;i++){
           if (arr[i]==ele){
               c++;
               System.out.println("Element found");
           }
       }
       if(c==0){
           System.out.println("Element not found");
       }
    }
    // to delete the node
    public void delete(int ele){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                arr[i]=0;
                System.out.println("Element deleted");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeByArray obj = new BinaryTreeByArray(10);
        while (true) {
            System.out.println(" Enter your choice \n 1) to insert a node \n 2) to preorder traversal of the binary tree \n 3) to inorder teaversal of the Binary tree \n 4) to search a node \n 5) to delete a node \n 6) to exit");
            int c = sc.nextInt();
            switch (c) {
                case 1 -> obj.insert(sc.nextInt());
                case 2 -> obj.pretraversal(sc.nextInt());
                case 3 -> obj.intraversal(sc.nextInt());
                case 4 -> obj.search(sc.nextInt());
                case 5 -> obj.delete(sc.nextInt());
                case 6 -> System.exit(0);
            }
        }
    }
}