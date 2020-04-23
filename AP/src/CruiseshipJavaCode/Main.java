package CruiseshipJavaCode;

public class Main {
    public static void main(String[] arg)
    {
        Bedrijf bd = new Bedrijf("Henk", 5);
        System.out.println(bd);
        Cruiseship cs = new Cruiseship("Caribbean Princess", 4);
        bd.setCruiseship(cs);
        System.out.println(bd);
        Medewerker mw = new Medewerker("Bob", 130);
        cs.voegMedewerker(mw);
        bd.voegMedewerker(mw);
        Medewerker mw2 = new Medewerker("Daan", 4023);
        cs.voegMedewerker(mw2);
        Medewerker mw3 = new Medewerker("Mazikeen",21);
        bd.voegMedewerker(mw3);
        Klant kl = new Klant("Andy", 130);
        cs.voegKlant(kl);
        Klant kl2 = new Klant("Alex", 4023);
        cs.voegKlant(kl2);
        Suite st = new Suite("The Perfect Isaacs Hut", 420.00);
        st.setKlant(kl);
        System.out.println(bd);
        System.out.println(st);
    }
}
