import java.util.ArrayList;

public class StartupBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<SimpleStartup> startups = new ArrayList<SimpleStartup>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        SimpleStartup one = new SimpleStartup();
        one.setName("poniez");
        SimpleStartup two = new SimpleStartup();
        two.setName("hacqi");
        SimpleStartup three = new SimpleStartup();
        three.setName("cabista");
        startups.add(one);
        startups.add(two);
        startups.add(three);
        
        System.out.println("Your goal is to sink three startups.");
        System.out.println("poniez, hacqi, cabista");
        System.out.println("Try to sink them all in the fewest number of guesses");
    
        for (SimpleStartup startupToSet : startups) {
            ArrayList<String> newLocation = helper.placeStartup(3);
            startupToSet.setLocationCells(newLocation);
        }
    }


    private void startPlaying() {
        while (!startups.isEmpty()) {
            int userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(int userGuess) {
        numOfGuesses++;
        String result = "miss";

        for (SimpleStartup startupToTest : startups) {
            result = startupToTest.checkYourself(userGuess);

            if (result.equals("hit")) {
                break;
            }

            if (result.equals("kill")) {
                startups.remove(startupToTest);
                break;
            }
        }
    }

    private void finishGame() {
        System.out.println("All startups are dead! Your stock is now worthless");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println(" You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options");
        }
    }

    public static void main(String[] args) {
        StartupBust game = new StartupBust();
        game.setUpGame();
        game.startPlaying();
    }
}
