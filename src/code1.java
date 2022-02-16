class Node{
    String str;
    Node next;

    public Node(String str) {
        this.str = str;
    }
}

public class code1 {
    Node f;
    Node r;
    String even = "";
    String odd = "";
    int[] arr2 = new int[1000];

    public String ascii(char[] arr) {
        int k = 0;
        for (char c : arr) {
            arr2[k++] = c;
        }
        for (int j=0;j<k;j++){
            if(arr2[j]%2==0){
                even += arr[j];
            }
            else{
                odd += arr[j];
            }
        }
        return even+odd;
    }
    public void enqueue(String s){
        Node n1=new Node(s);
        if(f==null && r==null){
            f=r=n1;
        }
        else {
            r.next=n1;
            r=n1;
        }
    }
}

class Main001{
    public static void main(String[] args) {
        code1 c1 = new code1();
        for (int i = 0; i < args.length; i++) {
            char[] arr = args[i].toCharArray();
            String s = c1.ascii(arr);
            c1.enqueue(s);
            c1.even="";
            c1.odd="";
        }
            Node t = c1.f;
        try {
            while (c1.r != null) {
                System.out.println(t.str);
                t = t.next;
            }
        }catch (NullPointerException e){
            System.out.println(e);
        }
    }
}