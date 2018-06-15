public class Rekursion {

    int count;
    int fakultaet = 1;

    int a(int x, int y) {
        count++;
        if (x <= 0 || y < 0) {
            System.out.println("a(" + x + ", " + y +")");
            System.out.println(x-y+2);
            return x - y + 2;
        }
        if (x % 2 == 0) {
            count++;
            System.out.println("a(" + x + ", " + y +")");
            return a(x/2, y) + a(x,y-1);
        }
        System.out.println("a(" + x + ", " + y +")");
        return a(x-1,y-2);
    }

    int fakultaetIterativ(int n){
        if (n>1){
            for (int i = n; i != 0; i--) {
                fakultaet*=i;
            }
        }
        if (n <= 1){
            fakultaet = 1;
        }
        return fakultaet;
    }

    long zufallszahl(int n){
        if (n<3){
            return n + 1;
        }

        long f1 = zufallszahl(n - 1);
        long f2 = zufallszahl(n - 2);
        long f3 = zufallszahl(n - 3);

        return 1 + (((f1 - f2) * f3) % 100);
    }

    int summeRekursiv(int n){
        if (n == 0) {
            return 0;
        }
        return summeRekursiv(n - 1) + n;
    }

    int a(int x){
        int y = 2 * x;
        int z = 3;
        int w = b(y, z) + x;
        return w;
    }

    int b(int c, int d){
        int e = c + 2 * d;
        return e;
    }

    boolean istPalindromIterativ(String s){
        //Basisfall
        boolean wahr = false;

        if (s.length() == 1 || s.length() == 0) {
            return true;
        }
        // Wen das erste und das letzte Zeichen gleich sind
        if (s.length() >= 2) {
            for (int i = 0; i < s.length()/2; i++) {
                char ersterBuchstabe = s.charAt(i);
                char letzterBuchstabe = s.charAt(s.length()-1-i);
                if (ersterBuchstabe == letzterBuchstabe) {
                    wahr = true;
                }
            }
        }
        return wahr;
    }

}
