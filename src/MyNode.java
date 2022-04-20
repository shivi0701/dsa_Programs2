import java.util.Scanner;

public class MyNode {
   private String Phone;
   private MyNode left;
   private MyNode right;
   private boolean Rightthread;
   MyNode(String Phone){
       this.Phone=Phone;
   }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public MyNode getLeft() {
        return left;
    }

    public void setLeft(MyNode left) {
        this.left = left;
    }

    public MyNode getRight() {
        return right;
    }

    public void setRight(MyNode right) {
        this.right = right;
    }

    public boolean isRightthread() {
        return Rightthread;
    }

    public void setRightthread(boolean rightthread) {
        Rightthread = rightthread;
    }
}
class threadedTree {
    public String check(String s) {
        if (s.equals("one")) {
            return "1";
        }
        if (s.equals("two")) {
            return "2";
        }
        if (s.equals("three")) {
            return "3";
        }
        if (s.equals("four")) {
            return "4";
        }
        if (s.equals("five")) {
            return "5";
        }
        if (s.equals("six")) {
            return "6";
        }
        if (s.equals("seven")) {
            return "7";
        }
        if (s.equals("eight")) {
            return "8";
        }
        if (s.equals("nine")) {
            return "9";
        }
        if (s.equals("zero")) {
            return "0";
        }
        if (s.equals("double")) {

        }
        return null;
    }

}
class Mainn {
    public static void main(String[] args) {
        threadedTree ob = new threadedTree();
        Scanner sc = new Scanner(System.in);
        MyNode obj = new MyNode(sc.nextLine());
        String[] s = obj.getPhone().split(" ");
        String p;
        for (int i = 0; i < s.length; i++) {
            if(s[i]=="double"){
                for (int j=0;j<2;i++){
                    p= ob.check(s[i++]);
                    s[i++]=p;

                }
            }
            ob.check(s[i]);

        }
    }
}