import java.util.Scanner;

public class GameHelper {
    public String getUserInput(String prompt) {
        System.out.print(prompt + ": ");
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextLine();
        }
    }    
}
