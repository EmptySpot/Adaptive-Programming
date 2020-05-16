package FinalAssignment2;

import java.util.*;

public class FSMDice {


    public Node run(Node node) {
        Collection value = node.getDictio().values();
        List theValList = new ArrayList(value);
        double size = value.size();
        double chance = (1 / size);
        double chancevariable = 0.0;
        ArrayList<Double> chancelist = new ArrayList<>();
        while (chancevariable <= 1){
            chancelist.add(chancevariable);
            chancevariable = (chancevariable + chance);
        }

        Random rGetal = new Random();
        double letter = rGetal.nextDouble();
        int sizelist = chancelist.size();
        int counter = 1;
        int locatie = 0;
        while (counter < sizelist){
            if (letter < (chancelist.get(counter))){
                if (letter >= (chancelist.get(counter-1))){
                    locatie = counter;
                }

            }
            counter += 1;
        }

        Node resultaat = (Node) theValList.get(locatie-1);
        if (resultaat.getName().contains("d")){
            return resultaat;
        } else {
            return run(resultaat);
        }

    }
}


