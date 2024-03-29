import java.util.ArrayList;

public class SimpleStartup {
    private int[] locationCells;
    private int numOfHits = 0;

    public void setLocationCells(ArrayList<String> newLocation) {
        locationCells = newLocation;
    }

    public String checkYourself(int guess) {
        String result = "miss";

        for (int cell : locationCells){
            if(guess == cell){
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if(numOfHits == locationCells.length){
            result = "kill";
        }
        
        System.out.println(result);
        return result;
    }

    public void setName(String string) {
    }
}
