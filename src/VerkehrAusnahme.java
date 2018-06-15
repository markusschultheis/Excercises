public class VerkehrAusnahme extends Exception {

    VerkehrAusnahme(Weg w, Fahrzeug f){
        System.out.println("Der Weg " + w.liefereName() + " darf von " + f.toString() + " nicht befahren werden");
        return;
    }
}
