package f2b;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Node2> nodesarray = new ArrayList<>();
        Node2 s0 = new Node2("0", "1", "2");
        Node2 s1 = new Node2("1", "3", "4");
        Node2 s2 = new Node2("2", "5", "6");
        Node2 s3 = new Node2("3", "1", "d1");
        Node2 s4 = new Node2("4", "d2", "d3");
        Node2 s5 = new Node2("5", "d4", "d5");
        Node2 s6 = new Node2("6", "2", "d6");
        Node2 s7 = new Node2("d1", null, null);
        Node2 s8 = new Node2("d2", null, null);
        Node2 s9 = new Node2("d3", null, null);
        Node2 s10 = new Node2("d4", null, null);
        Node2 s11 = new Node2("d5", null, null);
        Node2 s12 = new Node2("d6", null, null);

        nodesarray.add(s0);
        nodesarray.add(s1);
        nodesarray.add(s2);
        nodesarray.add(s3);
        nodesarray.add(s4);
        nodesarray.add(s5);
        nodesarray.add(s6);
        nodesarray.add(s7);
        nodesarray.add(s8);
        nodesarray.add(s9);
        nodesarray.add(s10);
        nodesarray.add(s11);
        nodesarray.add(s12);


        f2bfsm f2bfsm = new f2bfsm(nodesarray);
        f2bfsm.run();
    }
}