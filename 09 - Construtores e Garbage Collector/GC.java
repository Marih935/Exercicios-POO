//which of the lines of code on the right, if added to the class on the left at point A, would cause exacly one additional object to be eligible for garbage collection?

public class GC {
    public static GC doStuff() {
        GC newGC = new GC();
        doStuff2(newGC);
        return newGC;
    }

    public static void main(String[] args) {
        GC gc1;
        GC gc2 = new GC();
        GC gc3 = new GC();
        GC gc4 = gc3;
        gc1 = doStuff();

        // point A
        gc4 = null;
    }

    public static void doStuff2(GC copyGC) {
        GC localGC = copyGC;
    }
}