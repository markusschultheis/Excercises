public class Landstrasse extends Weg {

    public Landstrasse(String name, int laengeInKm) {
        this.setName(name);
        this.setLaenge(laengeInKm);
    }

    public boolean darfBefahrenWerdenVon(Fahrzeug f) {
        boolean darfBefahrenWerden = false;
        if (f.toString() == "Fahrrad" || f.toString() == "Kfz") {
            darfBefahrenWerden = true;
        } else {
            darfBefahrenWerden = false;
        }
        return darfBefahrenWerden;
    }
}
