//determine whether this file will compile. if it won't compile, how would you fix it. when it runs, what would be its output?

// class StaticSuper {
//     static {
//         System.out.println("super static block");
//     }

//     StaticSuper() {
//         System.out.println("super constructor");
//     }
// }

// public class StaticTests extends StaticSuper {
//     static int rand;

//     static {
//         rand = (int) (Math.random() * 6);
//         System.out.println("static block " + rand);
//     }

//     StaticTests() {
//         System.out.println("constructor");
//     }

//     public static void main(String[] args) {
//         System.out.println("in main");
//         StaticTests st = new StaticTests();
//     }
// }

//arquivo corrigido:

class StaticSuper {
    static {
        System.out.println("super static block");
    }

    StaticSuper() {
        System.out.println("super constructor");
    }
}

public class StaticTests extends StaticSuper {
    static int rand;

    static {
        rand = (int) (Math.random() * 6);
        System.out.println("static block " + rand);
    }

    StaticTests() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("in main");
        StaticTests st = new StaticTests();
    }
}

//output:
// super static block
// static block 3
// in main
// super constructor
// constructor