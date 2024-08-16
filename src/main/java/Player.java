import java.util.Random;
import java.util.Scanner;

public class Player {

    private String name;
    private String move;

    Scanner user_input = new Scanner(System.in);

    // Retrieving Player Information

    public void askName() {
        System.out.println("What is your name? ");
        this.name = user_input.next();
    }

    public void askMove() {
        System.out.println("Choose your Weapon: Rock, Paper or Scissors");
        this.move = user_input.next();
    }

    // Generating CPU Information

    public void generateCpuMove(){
        Random random = new Random();
        int generatedValue = random.nextInt(3);

        if (generatedValue == 0) {
            this.move = "Rock";
        } else if (generatedValue == 1) {
            this.move = "Paper";
        } else {
            this.move = "Scissors";
        }
    }

    public String getName() {
        return name;
    }
    public String getMove() {
        return move;
    }

}