package f2b;

//This code works with the same code I worked on 2a for, so again some credit go to Quinn and Nonne

import java.util.ArrayList;
import java.util.Random;

public class f2bfsm {
    private final ArrayList<Node2> TheNodes;
    private Node2 cn;
    ArrayList<String> on = new ArrayList<>();

    public f2bfsm(ArrayList<Node2> arraynodes) {
        TheNodes = arraynodes;
        cn = TheNodes.get(0);
        on.add(cn.getName());
    }

    public void run() {
        int fail = 0;
        int i = 0;
        Random rand = new Random();
        while (i == 0) {
            int letter = rand.nextInt(2);
            if (letter == 0) {
                for (Node2 current : TheNodes) {
                    String huidig = (current.getName());
                    if (huidig == (cn.getFirstnode())) {
                        on.add(huidig);
                        cn = current;
                        break;
                    }
                }
            } else {
                if (letter == 1) {
                    for (Node2 current : TheNodes) {
                        String huidig = (current.getName());
                        if (huidig == (cn.getSecondnode())) {
                            on.add(huidig);
                            cn = current;
                            break;
                        }
                    }
                } else {
                    fail = 1;
                }
            }
            String last = (on.get(on.size() - 1));
            if (last.contains("d")) {
                i += 1;
            }}

            if (fail == 1) {
                System.out.println("The FSM has failed");
                System.out.println("There has no other followable connection found");
            } else {
                System.out.println("De dobbelsteen is geeindigd op: " + on.get(on.size()-1));
            }
        }
    }
