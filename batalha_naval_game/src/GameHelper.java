import java.util.ArrayList;
import java.util.Scanner;

public class GameHelper {
    public String getUserInput(String prompt) {
        System.out.println(prompt + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public ArrayList<String> placeStartup(int i) {
        return null;
    }
}
