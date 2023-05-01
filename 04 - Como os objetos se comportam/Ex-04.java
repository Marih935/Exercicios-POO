//take code snippets from the pool and place them into the blank lines in the code

public class Puzzle4 {
    public static void main(String[] args){
        Puzzle4b[] values = new Puzzle4b[6];
        int number = 1;
        int i = 0;
        while(i < 6){
            values[i] = new Puzzle4b();
            values[i].intValue = number;
            number = number * 10;
            i = i + 1;
        }

        int result = 0;
        i = 6;
        while(i > 0){
            i = i - 1;
            result = result + values[i].doStuff(i);
        }

        System.out.println("result " + result);
    }
}

class Puzzle4b {
    int intValue;
    public int doStuff(int intValue){
        if(intValue > 100){
            return intValue;
        } else {
            return (intValue * 5);
        }
    }
}

//output: result 543345