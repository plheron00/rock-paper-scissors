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
