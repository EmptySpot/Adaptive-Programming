package CruiseshipJavaCode;

import java.util.ArrayList;

public class Bedrijf {
    private String Bedrijfsnaam;
    private int Bedrijfsid;
    private Cruiseship Cruiseship;
    private ArrayList<Medewerker> Medewerkers;


    public Bedrijf(String bn, int bi) {
        Bedrijfsnaam = bn;
        Bedrijfsid = bi;
        Medewerkers = new ArrayList<>();
    }

    public String getBedrijfsnaam() {
        return Bedrijfsnaam;
    }

    public int getBedrijfsid() {
        return Bedrijfsid;
    }

    public void setBedrijfsnaam(String bn) {
        Bedrijfsnaam = bn;
    }

    public void setBedrijfsid(int bi) {
        Bedrijfsid = bi;
    }

    public void setCruiseship(Cruiseship cs) {
        Cruiseship = cs;
    }

    public void voegMedewerker(Medewerker mmedewerker){
        Medewerkers.add(mmedewerker);
    }

    public ArrayList<Medewerker> getMedewerkers() {
        return Medewerkers;
    }

    @Override
    public String toString() {
        return "Bedrijf{" +
                "Bedrijfsnaam='" + Bedrijfsnaam + '\'' +
                ", Bedrijfsid=" + Bedrijfsid + '\'' +
                ", Cruiseship=" + Cruiseship + '\'' +
                ", Medewerkers= " + Medewerkers +
                '}';
    }
}
