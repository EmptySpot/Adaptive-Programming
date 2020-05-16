package FinalAssignment2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FSMDiceTest {

        Node s0 = new Node("0");
        Node s1 = new Node("1");
        Node s2 = new Node("2");

        Node d1 = new Node("d1");
        Node d2 = new Node("d2");
        Node d3 = new Node("d3");


    @Test
    void run() {
        s0.setDictio('A',s1);
        s0.setDictio('B',s2);
        s0.setDictio('C',d1);
        s1.setDictio('A',s2);
        s1.setDictio('B',d2);
        s2.setDictio('A',s0);
        s2.setDictio('B',d3);


        FSMDice FSMDice = new FSMDice();
        String Answer = (FSMDice.run(s0).getName());

        if (Answer.equals("d1")) {
            assertEquals("d1", Answer);
        }
        else if (Answer.equals("d2")) {
            assertEquals("d2", Answer);
        }
        else {
            assertEquals("d3", Answer);
        }




    }
}