//what would be the output when the program runs?

class Output {
    public static void main(String[] args) {
        Output output = new Output();
        output.go();
    }

    void go() {
        int value = 7;
        for (int i = 1; i < 8; i++) {
            value++;//8 9 10 11 12 13 14
            if (i > 4) {
                System.out.print(++value + " ");//12 14 16
            }
            if (value > 14) {
                System.out.println(" i = " + i);
                break;
            }
        }
    }
}

//output: 12 14 i = 6