package FinalAssignment2;

public class Node {
    private String firstNode;
    private String secondNode;
    private String name;

    public Node(String nm, String fn, String sn){
        name = nm;
        firstNode = fn;
        secondNode = sn;
    }

    public String getName() {
        return name;
    }

    public String getFirstnode(){
        return firstNode;
    }
    public String getSecondnode(){
        return secondNode;
    }

}