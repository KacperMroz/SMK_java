public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        SquareBrain squareBrain = new SquareBrain();
        CommandSelector cs = new CommandSelector();

        while(true) {
            cs.commandSelector(squareBrain);
        }
    }
}