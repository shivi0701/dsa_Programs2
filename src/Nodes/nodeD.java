package Nodes;

public class nodeD {
    nodeD next;
    nodeD prev;
    int data;

    public nodeD(int data) {
        this.data = data;
        next=prev=null;   //chained assignment
    }

    @Override
    public String toString() {
        return "nodeD{" +
                "next=" + next +
                ", prev=" + prev +
                ", data=" + data +
                '}';
    }

    public nodeD getNext() {
        return next;
    }

    public nodeD getPrev() {
        return prev;
    }

    public int getData() {
        return data;
    }
}
