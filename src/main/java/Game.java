import java.util.Random;

public class Game {

    public void playGame(Player user, Player cpu) {
        boolean tie = true;

        //Checks user input against cpu move
        while (tie) {
            user.askMove();
            cpu.generateCpuMove();
            if (user.getMove().equals(cpu.getMove())) {
                System.out.println("No Way!" + user.getName() + " and Mochi picked the same move! Let's go again!");
            } else {
                // Check user.getMove() and do something that is result dependant
                switch (user.getMove()) {
                    case "Rock":
                        if (cpu.getMove() == "Paper") {
                            getDialogue("lose", user.getName());
                        } else {
                            getDialogue("win", user.getName());
                        }
                        break;
                    case "Paper":
                        if (cpu.getMove() == "Scissors") {
                            getDialogue("lose", user.getName());
                        } else {
                            getDialogue("win", user.getName());
                        }
                        break;
                    case "Scissors":
                        if (cpu.getMove() == "Rock") {
                            getDialogue("lose", user.getName());
                        } else {
                            getDialogue("win", user.getName());
                        }
                        break;
                }
                tie = false;
            }

        }
    }

    //Randomly rolls for the win/lose dialogue
    private void getDialogue(String result, String name) {
        Random random = new Random();
        int generatedValue = random.nextInt(3);

        if (result.equals("lose")) {
            switch (generatedValue) {
                case 0:
                    System.out.println("Ha Ha! Mochi always wins! Better luck next time " + name + "!");
                    break;
                case 1:
                    System.out.println("Wow " + name + "! You need more practise to beat Mochi!");
                    break;
                case 2:
                    System.out.println("You Lost? Mochi does not know how?! This games too easy!");
                    break;
            }
        }
        if (result.equals("win")) {
            switch (generatedValue) {
                case 0:
                    System.out.println("No Way! Mochi never loses :(" + name + " has some skills!");
                    break;
                case 1:
                    System.out.println("Hark! How did you beat Mochi?!" + name + ", Teach me your ways!");
                    break;
                case 2:
                    System.out.println("Mochi does not like this one bit! How dare " + name + "beat Mochi!");
                    break;
            }
        }
    }
}
