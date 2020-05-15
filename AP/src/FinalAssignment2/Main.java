package FinalAssignment2;



import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Node> nodesarray = new ArrayList<>();
        Node s0 = new Node("0", "1", "2");
        Node s1 = new Node("1", "3", "4");
        Node s2 = new Node("2", "5", "6");
        Node s3 = new Node("3", "1", "d1");
        Node s4 = new Node("4", "d2", "d3");
        Node s5 = new Node("5", "d4", "d5");
        Node s6 = new Node("6", "2", "d6");
        Node s7 = new Node("d1", "0", "1");
        Node s8 = new Node("d2", "1", "2");
        Node s9 = new Node("d3", "2", "3");
        Node s10 = new Node("d4", "3", "4");
        Node s11 = new Node("d5", "4", "5");
        Node s12 = new Node("d6", "5", "6");

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