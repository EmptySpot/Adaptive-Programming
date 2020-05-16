package FinalAssignment2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Node s0 = new Node("0");
        Node s1 = new Node("1");
        Node s2 = new Node("2");
        Node s3 = new Node("3");
        Node s4 = new Node("4");
        Node s5 = new Node("5");

        Node d1 = new Node("d1");
        Node d2 = new Node("d2");
        Node d3 = new Node("d3");
        Node d4 = new Node("d4");
        Node d5 = new Node("d5");
        Node d6 = new Node("d6");

        s0.setDictio('A',s1);
        s0.setDictio('B',s2);
        s0.setDictio('C',s3);
        s1.setDictio('A',s3);
        s1.setDictio('B',s4);
        s2.setDictio('A',s5);
        s2.setDictio('B',d6);
        s3.setDictio('A',s1);
        s3.setDictio('B',d1);
        s4.setDictio('A',d2);
        s4.setDictio('B',d3);
        s5.setDictio('A',d4);
        s5.setDictio('B',d5);
        d1.setDictio('A',s0);
        d1.setDictio('B',s1);
        d1.setDictio('C',s2);
        d2.setDictio('A',s2);
        d2.setDictio('B',s3);
        d3.setDictio('A',s4);
        d3.setDictio('B',s4);
        d4.setDictio('A',s5);
        d4.setDictio('B',d3);
        d5.setDictio('A',d2);
        d5.setDictio('B',d1);
        d6.setDictio('A',s5);
        d6.setDictio('B',s0);

        System.out.println("Which to run? Dice / Tekst:");
        Scanner lineinput = new Scanner(System.in);
        String Ninput = lineinput.nextLine().toUpperCase();
        if (Ninput.contains("D")){
            FSMDice FSMDice = new FSMDice();
            System.out.print(FSMDice.run(s0).getName());}
        else {
            FSMTekst FSMTekst = new FSMTekst();
            List inp = new ArrayList();
            List ans = new ArrayList();
            System.out.println("Give a line: ");
            String input = "start";
            while (!input.equals("CLOSE")) {
                input = lineinput.nextLine().toUpperCase();
                inp.add(input);
            }
            inp.remove(inp.size()-1);
            List answer = (FSMTekst.run(s0, inp, ans));
            if (answer.get(answer.size()-1) == "F"){
                System.out.println("The code has failed, it received: " + answer + ", before its demise on finding a connectable route and ending on a F to pay respect.");
            } else {
                System.out.println("The code has succeeded and found the following path: " + answer);
            }
        }
    }
}