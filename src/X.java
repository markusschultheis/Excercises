import java.awt.*;

public class X {

    public int methodeA(int i){
        System.out.println("A " +i);
        if (i > 0) {
            try {
                return methodeB(i/2);
            }
            catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
            catch (RuntimeException re) {
                System.out.println("RuntimeException");
            }
        }
        return 4 * i;
    }

    public int methodeB(int i){
        System.out.println("B "+i);
        if (i == 4) {
            throw new IllegalArgumentException("Die 4 ist verboten!");
        }
        if (i<2) {
            return 10/i;
        }
        return methodeA(i/2);
    }
}
