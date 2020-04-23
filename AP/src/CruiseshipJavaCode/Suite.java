package CruiseshipJavaCode;

public class Suite {
    private String Suite_id;
    private double Suite_prijs;
    private Klant Klant;

    public Suite(String si, double sp) {
        Suite_id = si;
        Suite_prijs = sp;
    }

    public String getSuite_id() {
        return Suite_id;
    }

    public void setSuite_id(String si) {
        Suite_id = si;
    }

    public double getSuite_prijs() {
        return Suite_prijs;
    }

    public void setSuite_prijs(double sp) {
        Suite_prijs = sp;
    }

    public CruiseshipJavaCode.Klant getKlant() {
        return Klant;
    }

    public void setKlant(CruiseshipJavaCode.Klant kl) {
        Klant = kl;
    }

    @Override
    public String toString() {
        return "Suite{" +
                "Suite_id='" + Suite_id + '\'' +
                ", Suite_prijs=" + Suite_prijs + '\'' +
                ", Klant= " + Klant +
                '}';
    }
}
