package f2a;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Node> nodesarray = new ArrayList<>();
        Node s0 = new Node("s0", "s2", "s1");
        Node s1 = new Node("s1", "s1", "s2");
        Node s2 = new Node("s2", null, "s3");
        Node s3 = new Node("s3", "s3", "s0");

        nodesarray.add(s0);
        nodesarray.add(s1);
        nodesarray.add(s2);
        nodesarray.add(s3);

        f2afsm f3afsm = new f2afsm(nodesarray);
        System.out.println("Example");
        f3afsm.run("BAAB");
        f2afsm f2afsm = new f2afsm(nodesarray);
        System.out.println("Give a line: ");
        Scanner lineinput = new Scanner(System.in);
        String oldinput = lineinput.nextLine();
        String input = oldinput.toUpperCase();
        f2afsm.run(input);
    }
}