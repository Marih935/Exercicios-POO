//which of these would compile?

//1
public class Foo {
    static int x;

    public void go() {
        System.out.println(x);
    }
}

//2
public class Foo2 {
    int x;

    public void go() {
        System.out.println(x);
    }
}

//3
public class Foo3 {
    final int x;

    public void go() {
        System.out.println(x);
    }
}

//4
public class Foo4 {
    static final int x = 12;

    public void go() {
        System.out.println(x);
    }
}

//5
public class Foo5 {
    static final int x = 12;

    public void go(final int x) {
        System.out.println(x);
    }
}

//6
public class Foo6 {
    int x = 12;

    public static void go(final int x) {
        System.out.println(x);
    }
}

//todos compilariam, exceto o 6, que não compila porque o método go() é estático e a variável x é não-estática