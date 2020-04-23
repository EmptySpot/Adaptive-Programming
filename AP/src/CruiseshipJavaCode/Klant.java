package CruiseshipJavaCode;

public class Klant {
    private String Klant_naam;
    private int Klant_id;

    public Klant(String kn, int ki) {
        Klant_naam = kn;
        Klant_id = ki;
    }

    public String getNaam() {
        return Klant_naam;
    }

    public void setNaam(String kn) {
        Klant_naam = kn;
    }

    public int getId() {
        return Klant_id;
    }

    public void setId(int ki) {
        Klant_id = ki;
    }

    @Override
    public String toString() {
        return "Klant{" +
                "Klant_naam='" + Klant_naam + '\'' +
                ", Klant_id=" + Klant_id +
                '}';
    }
}
