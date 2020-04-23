package CruiseshipJavaCode;

import java.util.ArrayList;


public class Cruiseship {
    private String Cruiseship_naam;
    private int Cruiseship_id;
    private Medewerker Medewerker;
    private ArrayList <Medewerker> Medewerkers;
    private ArrayList <Klant> Klanten;
    public Cruiseship(String cn, int ci) {
        Cruiseship_naam = cn;
        Cruiseship_id = ci;
        Medewerkers = new ArrayList<>();
        Klanten = new ArrayList<>();
    }

    public String getCruiseship_naam() {
        return Cruiseship_naam;
    }

    public void setCruiseship_naam(String cn) {
        Cruiseship_naam = cn;
    }

    public int getCruiseship_id() {
        return Cruiseship_id;
    }

    public void setCruiseship_id(int ci) {
        Cruiseship_id = ci;
    }

    public void voegMedewerker(Medewerker mmedewerker){
        Medewerkers.add(mmedewerker);
    }

    public void voegKlant(Klant kklant){
        Klanten.add(kklant);
    }

    public ArrayList<Klant> getKlanten() {
        return Klanten;
    }

    public ArrayList<Medewerker> getMedewerkers() {
        return Medewerkers;
    }
    public Medewerker getMedewerker(){ return Medewerker;}

    @Override
    public String toString() {
        return "Cruiseship{" +
                "Cruiseship_naam= '" + Cruiseship_naam + '\'' +
                ", Cruiseship_id= " + Cruiseship_id + '\'' +
                ", Mederwerkers= " + Medewerkers + '\'' +
                ", Klanten= " + Klanten +
                '}';
    }
}
