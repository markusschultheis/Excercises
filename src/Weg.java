public abstract class Weg {

    private String name;
    private int laenge;
    private boolean darfBefahrenWerdenVon;

    public abstract boolean darfBefahrenWerdenVon(Fahrzeug f);

    //Standardkonstruktor muss vorhanden sein in einer abstrakten Klasse
    Weg() {

    }

    public Weg(String name, int laengeInKm) {
        this.setName(name);
        this.setLaenge(laengeInKm);
    }

    public String liefereName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int liefereLaengeInKm() {
        return laenge;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }
}
