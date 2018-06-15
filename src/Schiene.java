public class Schiene extends Weg {

    public Schiene(String name, int laengeInKm) {
        this.setName(name);
        this.setLaenge(laengeInKm);
    }

    public boolean darfBefahrenWerdenVon(Fahrzeug f) {
        boolean darfBefahrenWerden = false;

        if (f.toString() == "Eisenbahn") {
            darfBefahrenWerden = true;
        }
        return darfBefahrenWerden;
    }

}

