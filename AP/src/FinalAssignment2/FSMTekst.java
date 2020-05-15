package FinalAssignment2;

import java.util.ArrayList;

public class FSMTekst {
    ArrayList<String> on = new ArrayList<>();
    private ArrayList <Node> TheNodes;
    private Node cn;

    public FSMTekst(ArrayList<Node> arraynodes) {
        TheNodes = arraynodes;
        cn = TheNodes.get(0);
        on.add(cn.getName());
    }

    public void run(String input) {
        int fail = 0;
        System.out.println(input);
        int lengthInput = input.length();
        int i = 0;
        while (i < lengthInput){ char letter = input.charAt(i);
            if (letter == 'A') {
                for (Node current : TheNodes) {
                    String huidig = (current.getName());
                    if (huidig == (cn.getFirstnode())) {
                        on.add(huidig);
                        cn = current;
                        break;
                    }
                }
            } else {
                if (letter == 'B') {
                    for (Node current : TheNodes) {
                        String huidig = (current.getName());
                        if (huidig == (cn.getSecondnode())) {
                            on.add(huidig);
                            cn = current;
                            break;
                        }
                    }
                } else { fail = 1;
                }
            }
            i += 1;}

        if (fail == 1) {
            System.out.println("The FSM has failed");
            System.out.println("There has no other followable connection found");
        }
        else {
            System.out.println("Path followed: " + on);
        }
    }
}
