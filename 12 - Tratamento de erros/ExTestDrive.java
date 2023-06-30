//use the code snippets to make a working Java program that produces the output listed below (you have to add missing curly braces)

// output:
// java ExTestDrive yes
// thaws

// java ExTestDrive no
// throws

class MyEx extends Exception { }

public class ExTestDrive {
    static void doRisky(String t) throws MyEx {
        System.out.print("h");
        if ("yes".equals(t)) {
            throw new MyEx();
        }
    }

    public static void main(String[] args) {
        String test = args[0];
        System.out.print("t");
        try {
            doRisky(test);
            System.out.print("r");
            System.out.print("o");
        } catch (MyEx e) {
            System.out.print("a");
        } finally {
            System.out.print("w");
        }
        System.out.println("s");
    }
}