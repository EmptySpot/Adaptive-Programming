package f2b;

public class Node2 {
    private String firstNode;
    private String secondNode;
    private String name;

    public Node2(String nm, String fn, String sn){
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