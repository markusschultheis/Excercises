public class Fahrrad extends Fahrzeug {

    public Fahrrad(int geschwindigkeit) {
        this.setzeGeschwindigkeit(geschwindigkeit);
       // this.befahre(Landstrasse);
    }

    public String toString() {
        return "Fahrrad";
    }
}
