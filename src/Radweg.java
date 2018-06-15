public class Radweg extends Weg {

    public Radweg(String name, int laengeInKm){
        this.setName(name);
        this.setLaenge(laengeInKm);
    }

    public boolean darfBefahrenWerdenVon(Fahrzeug f) {
        if (f.toString() == "Fahrrad") {
            return true;
        } else {
            return false;
        }
    }
}
