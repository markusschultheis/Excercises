public class Kfz extends Fahrzeug {

    /**
     * Erzeugt ein Fahrzeug mit einer konstanten Geschwindigkeit von 100 Km/h
     * @param geschwindigkeit
     */
    public Kfz(int geschwindigkeit) {
        this.setzeGeschwindigkeit(geschwindigkeit);
    }

    public String toString() {
        return "Kfz";
    }

}
