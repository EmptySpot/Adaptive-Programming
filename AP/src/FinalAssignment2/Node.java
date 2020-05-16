package FinalAssignment2;
import java.util.*;

public class Node {
    private String name;
    private Map<Character, Node> dictio = new HashMap<>();

    public Node(String nm){
        name = nm;
    }

    public String getName() {
        return name;
    }



    public void setDictio(char nummer, Node node) {
        dictio.put(nummer, node);
    }

    public Map<Character, Node> getDictio() {
        return dictio;
    }
}