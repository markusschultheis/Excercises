public class Autobahn extends Weg {

    public Autobahn(String name, int laengeInKm) {
        this.setName(name);
        this.setLaenge(laengeInKm);
    }

    public boolean darfBefahrenWerdenVon(Fahrzeug f) {
        System.out.println(f.getClass());
        if (f.getClass() == Eisenbahn.class) { System.out.println("Is Esenbahn"); }
        if (Eisenbahn.class.isInstance(f)) {return false;}
        if (Fahrrad.class.isInstance(f)) {return false;}

/*
        boolean darfBefahrenWerden = false;

        if (f.toString() == "Kfz") {
            darfBefahrenWerden = true;
        }

        return darfBefahrenWerden;
     */
        return true;
    }
}
