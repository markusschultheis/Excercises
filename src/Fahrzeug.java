public abstract class Fahrzeug {

    private int geschwindigkeit;

    Fahrzeug(){

    }

    public Fahrzeug(int geschwindigkeit) {
        this.setzeGeschwindigkeit(geschwindigkeit);
    }

    public void setzeGeschwindigkeit(int neueGeschwindigkeit){
        this.geschwindigkeit = neueGeschwindigkeit;
    }

    public int befahre(Weg weg) throws VerkehrAusnahme {
        // Ausgabe der Fahrdauer in Minuten
        // Ergänze hier für c) die Methode befahre(Weg weg)
        if (weg.darfBefahrenWerdenVon(this) == true) {
            return weg.liefereLaengeInKm() * 60 / this.geschwindigkeit;
        } else {
            throw new VerkehrAusnahme(weg, this);

        }
    }
}
