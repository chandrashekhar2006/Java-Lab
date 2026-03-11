class A {
    int i;
    int j;

    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("Sum: " + (i + j + k));
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        superOb.i = 10;
        superOb.j = 20;
        superOb.showij();

        B subOb = new B();
        subOb.i = 5;
        subOb.j = 15;
        subOb.k = 25;

        subOb.showij();
        subOb.showk();
        subOb.sum();
    }
}
