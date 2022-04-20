class N{
    int data;
    N left;
    N right;
    boolean rightthread;
    boolean leftthread;
    N(int data){
        this.data=data;
    }
}

public class avltree {
    private static N root;
    N leftmost(N n1){
        if(n1==null){
            return null;
        }
        while (n1.left!=null){
            n1= n1.left;
        }
        return n1;
    }
    N rightmost(N n1){
        if(n1==null){
            return null;
        }
        while (n1.right!=null){
            n1=n1.right;
        }
        return n1;
    }

    public void insert(N newnode){

    }
    public void Inorder(N root){
        N cur= leftmost(root);
        N pre= rightmost(root);
        while (cur!= null) {
            System.out.println(cur.data);
            if (cur.rightthread) {
                cur = cur.right;
            } else {
                cur = leftmost(cur.right);
            }
        }
        while (pre!=null){
            System.out.println(pre.data);
            if(pre.leftthread){
                pre=pre.left;
            }
            else {
                pre=rightmost(pre.left);
            }
        }
    }
    public static void main(String[] args) {
        N n1= new N(30);
        N n2= new N(40);
        N n3= new N(50);
        N n4= new N(60);
        n1=root;
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        N dummy= new N(Integer.MIN_VALUE);
        dummy.left= n1;
        dummy.right=n4;
        n2.rightthread=true;
        n2.right= n1;


    }
}
