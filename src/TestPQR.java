public class TestPQR {

    public static void main(String[] args) {

        P paula = new P();
        P peter = new Q();
        P pia = new R();
        R rolf = new R();

        System.out.println(paula.antworte(rolf));
        System.out.println(peter.antworte(paula));
        System.out.println(pia.antworte(rolf));
        System.out.println(rolf.antworte(peter));
        System.out.println(rolf.antworte(pia));
        System.out.println(rolf.antworte(rolf));
    }

}
