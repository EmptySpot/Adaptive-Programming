package FinalAssignment2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

class FSMTekstTest {

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
        d1.setDictio('A',s0);
        d1.setDictio('B',s1);
        d2.setDictio('A',s1);
        d2.setDictio('B',s2);
        d3.setDictio('A',s0);
        d3.setDictio('B',s2);

        List<String> Answer = new ArrayList<>();
        Answer.add("0");
        Answer.add("1");
        Answer.add("d2");
        Answer.add("2");
        Answer.add("0");

        List<String> Test = new ArrayList<>();
        Test.add("A");
        Test.add("B");
        Test.add("B");
        Test.add("A");

        List<String> Test2 = new ArrayList<>();
        Test2.add("C");
        Test2.add("A");
        Test2.add("K");
        Test2.add("A");

        List<String> Answer2 = new ArrayList<>();
        Answer2.add("0");
        Answer2.add("d1");
        Answer2.add("0");
        Answer2.add("F");

        FSMTekst FSMTekst = new FSMTekst();
        FSMTekst FSMTekst2 = new FSMTekst();
        List ans = new ArrayList();
        List ans2 = new ArrayList();

        assertEquals(Answer, FSMTekst.run(s0, Test, ans));
        assertEquals(Answer2, FSMTekst2.run(s0, Test2, ans2));
    }
}