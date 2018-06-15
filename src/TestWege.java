public class TestWege {

    public static void main(String[] args) throws VerkehrAusnahme {

        Weg autobahn = new Autobahn("A1", 100);
        Weg radweg = new Radweg("Radweg Kalkar", 25);
        Weg schienenweg = new Schiene("Hannover-Köln",450);
        Weg landweg = new Landstrasse("L180", 23);

        Fahrzeug auto = new Kfz(100);
        Fahrzeug eisenbahn = new Eisenbahn(250);
        Fahrzeug rad = new Fahrrad(7);
/*
        gebeAus(autobahn, auto);
        gebeAus(landweg, rad);
        gebeAus(schienenweg, eisenbahn);
        gebeAus(radweg, rad);
        gebeAus(autobahn, rad);
        gebeAus(schienenweg, rad);
*/
        autobahn.darfBefahrenWerdenVon(auto);
        autobahn.darfBefahrenWerdenVon(rad);
        autobahn.darfBefahrenWerdenVon(eisenbahn);


    }

    static void gebeAus(Weg w, Fahrzeug f) throws VerkehrAusnahme {
        System.out.println("Die Fahrtdauer beträgt " + f.befahre(w) + " Minuten");
    }
}
