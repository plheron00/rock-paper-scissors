public class App {

    public static void main(String[] args) {

        Player newUser = new Player();
        Player newCpu = new Player();
        Game game = new Game();

        System.out.println("Hi there! *Beep Boop* My name is Mochi, and I'll be your opponent today ^_^");
        newUser.askName();
        System.out.println("It's on " + newUser.getName() +"! Let's Play!");
        game.playGame(newUser, newCpu);

    }
}

// I ran out of time to implement Type Safety :(
// My plan was to implement an Enum called Move to reduce the reliance on strings,
// and would repeatedly ask for another move until the user inputs something
// which satisfies what we're looking for!