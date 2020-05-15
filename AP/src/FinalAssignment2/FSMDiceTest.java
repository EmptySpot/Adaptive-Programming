package FinalAssignment2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FSMDiceTest {

    Node s0 = new Node("0", "1", "2");
    Node s1 = new Node("1", "0", "d1");
    Node s2 = new Node("2", "0", "d2");
    Node s3 = new Node("d1", null, null);
    Node s4 = new Node("d2", null, null);

    @Test
    void run() {
        ArrayList<Node> nodesarray = new ArrayList<>();
        nodesarray.add(s0);
        nodesarray.add(s1);
        nodesarray.add(s2);
        nodesarray.add(s3);
        nodesarray.add(s4);

        FSMDice FSMDice = new FSMDice(nodesarray);
        String Answer = FSMDice.run();

        if (Answer.equals("d1")) {
            assertEquals("d1", Answer);
        }
        else if (Answer.equals("d2")) {
            assertEquals("d2", Answer);
        }
        else {
            assertEquals("d2", Answer);
        }




    }
}