package FinalAssignment2;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

class FSMTekstTest {

    Node s0 = new Node("0", "1", "2");
    Node s1 = new Node("1", "0", "2");
    Node s2 = new Node("2", "0", "1");


    @org.junit.jupiter.api.Test
    void run() {
        ArrayList<Node> nodesarray = new ArrayList<>();
        nodesarray.add(s0);
        nodesarray.add(s1);
        nodesarray.add(s2);

        String Test = "ABBA";

        List<String> Answer = new ArrayList<>();
        Answer.add("0");
        Answer.add("1");
        Answer.add("2");
        Answer.add("1");
        Answer.add("0");
        FSMTekst FSMTekst = new FSMTekst(nodesarray);


        assertEquals(Answer, FSMTekst.run(Test));

    }
}