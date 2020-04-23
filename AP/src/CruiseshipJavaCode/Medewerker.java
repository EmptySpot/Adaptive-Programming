package CruiseshipJavaCode;

public class Medewerker {
    private String Medewerker_naam;
    private int Medewerker_id;


    public Medewerker(String mn, int mi) {
        Medewerker_naam = mn;
        Medewerker_id = mi;
    }

    public String getNaam() {
        return Medewerker_naam;
    }

    public int getId() {
        return Medewerker_id;
    }

    public void setNaam(String mn) {
        Medewerker_naam = mn;
    }

    public void setId(int mi) {
        Medewerker_id = mi;
    }

    @Override
    public String toString() {
        return "Medewerker{" +
                "Medewerker_naam='" + Medewerker_naam + '\'' +
                ", Medewerker_id=" + Medewerker_id +
                '}';
    }
}
