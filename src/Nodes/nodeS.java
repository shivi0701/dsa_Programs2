package Nodes;

public class nodeS {
     private int data;         //data hiding
     private nodeS next;

    @Override
    public String toString() {
        return "nodeS{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

    public nodeS(int data){
        this.data=data;
        next=null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public nodeS getNext() {
        return next;
    }

    public void setNext(nodeS next) {
        this.next = next;
    }
}
