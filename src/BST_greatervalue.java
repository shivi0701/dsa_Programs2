class n{
    int data;
    n left;
    n right;
    public n(int data){
        this.data=data;
    }
}
public class BST_greatervalue {
    n root = null;
    public void insert(int value) {
        n newnode = new n(value);

        if (root == null) {
            root=newnode;
        }
        else
        {
            n current = root;
            while (true) {
                if (value < current.data) {
                   while (current.left!=null){
                       current=current.left;
                   }
                   current.left=newnode;
                   return;
                }
                if (value > current.data) {
                    while (current.right!=null){
                        current=current.right;
                    }
                    current.right=newnode;
                    return;
                    }
                }
            }
        }

    public void print(n root){
        if(root==null){
            return;
        }
        else {
            System.out.println(root.data);
            print(root.left);
            print(root.right);
        }
    }
    public int traverse(n root){
        int s=0;
        if(root==null){
            return 0;
        }
        else {
            n n2= root;
            if(n2.data>root.data)
            s+= n2.data;
            traverse(root.left);
            traverse(root.right);
        }
       return s;
    }
    public void max_value(int val){
        n n1= new n(val);
        int a= traverse(n1);
        n1.data= a;
    }
}
class M{
    public static void main(String[] args) {
        int arr[] = {30, 20, 50, 25, 35, 40, 10};
        BST_greatervalue OBJ= new BST_greatervalue();
        for(int i=0;i<arr.length;i++){
            OBJ.insert(arr[i]);
        }
        OBJ.print(OBJ.root);
        System.out.println("\n");
        for(int i=0;i<arr.length;i++){
            OBJ.traverse(new n(arr[i]));
            OBJ.max_value(arr[i]);
        }
        OBJ.print(OBJ.root);
    }
}
