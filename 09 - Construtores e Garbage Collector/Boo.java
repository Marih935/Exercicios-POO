//see if you can recognize which constructors are not legal. match the compiler error with the constructors that caused them

public class Boo {
    Boo(int i) {}
    Boo(String s) {}
    Boo(String s, int i) {}
}

class SonOfBoo extends Boo {
    public SonOfBoo() {
        super("boo");
    }

    public SonOfBoo(int i) {
        super("Fred");
    }

    public SonOfBoo(String s) {
        super(42);
    }

    // Public SonOfBoo(int i, String s) {
    // } NOT LEGAL

    //symbol: constructor Boo()

    // public SonOfBoo(String a, String b, String c) {
    //     super(a, b);
    // } NOT LEGAL

    //symbol: constructor Boo(java.lang.String,java.lang.String)

    public SonOfBoo(int i, int j) {
        super("man", j);
    }

    // public SonOfBoo(int i, int x, int y) {
    //     super(i, "star");
    // } NOT LEGAL

    //symbol: constructor Boo(int,java.lang.String)
}

