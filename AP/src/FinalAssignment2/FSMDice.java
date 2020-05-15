package FinalAssignment2;

import java.util.ArrayList;
import java.util.Random;

public class FSMDice {
    private final ArrayList<Node> TheNodes;
    private Node cn;
    ArrayList<String> on = new ArrayList<>();

    public FSMDice(ArrayList<Node> arraynodes) {
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
                for (Node current : TheNodes) {
                    String huidig = (current.getName());
                    if (huidig.equals(cn.getFirstnode())) {
                        on.add(huidig);
                        cn = current;
                        break;
                    }
                }
            } else {
                if (letter == 1) {
                    for (Node current : TheNodes) {
                        String huidig = (current.getName());
                        if (huidig.equals(cn.getSecondnode())) {
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


