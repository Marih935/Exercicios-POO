//match the candidate block of code (on the left) to the output that you'd see if the block were inserted

class A {
    int ivar = 7;

    void m1() {
        System.out.print("A's m1, ");
    }
    void m2() {
        System.out.print("A's m2, ");
    }
    void m3() {
        System.out.print("A's m3, ");
    }
}

class B extends A{
    void m1() {
        System.out.print("B's m1, ");
    }
}

class C extends B {
    void m3() {
        System.out.print("C's m3, " + (ivar + 6));
    }
}

public class Mixed2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

        //outputs: 
        //A's m1, A's m2, A's m3, 6
        //B's m1, A's m2, A's m3
        //A's m1, B's m2, A's m3,
        //B's m1, A's m2, C's m3, 13
        //B's m1, C's m2, A's m3,
        //B's m1, A's m2, C's m3, 6
        //A's m1, A's m2, C's m3, 13

        //code candidates:
        b.m1(); c.m2(); a.m3(); //output: B's m1, A's m2, A's m3
        c.m1(); c.m2(); c.m3(); //output: B's m1, A's m2, C's m3, 13
        a.m1(); b.m2(); c.m3(); //output: A's m1, B's m2, A's m3,
        a.m1(); a.m2(); a.m3(); //output: A's m1, A's m2, A's m3, 6


    }
}