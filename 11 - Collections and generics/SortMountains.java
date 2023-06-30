//fill in the blanks so the program will create the output shown

// output:
// as entered:
// [Longs 14255, Elbert 14433, Maroon 14156, Castle 14265]
// by name:
// [Castle 14265, Elbert 14433, Longs 14255, Maroon 14156]
// by height:
// [Elbert 14433, Castle 14265, Longs 14255, Maroon 14156]

import java.util.*;

public class SortMountains {
    public static void main (String[] args) {
        List<Mountain> mountains = new ArrayList<>();
        mountains.add(new Mountain("Longs", 14255));
        mountains.add(new Mountain("Elbert", 14433));
        mountains.add(new Mountain("Maroon", 14156));
        mountains.add(new Mountain("Castle", 14265));
        System.out.println("as entered:\n" + mountains);

        mountains.sort(new NameCompare());
        System.out.println("by name:\n" + mountains);

        mountains.sort(new HeightCompare());
        System.out.println("by height:\n" + mountains);
    }
}

class Mountain {
    String name;
    int height;

    Mountain(String n, int h) {
        name = n;
        height = h;
    }
    public String toString() {
        return name + " " + height;
    }
}