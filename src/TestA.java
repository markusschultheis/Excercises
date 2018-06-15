public class TestA {

    public static void main(String[] args) {

        A a1 = new A(3);
        A a2 = new A(8);

        a2 = a1;

        a2.setX(1);
        A a3 = new A(5);
        a3.setX(6);
        a3 = a2;
        a3.setX(2);

        System.out.println(a1.getX());
        System.out.println(a2.getX());
        System.out.println(a3.getX());
    }
}
