import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CommandSelector {
    public CommandSelector() {
    }

    void commandSelector(SquareBrain squareBrain) {
        Scanner inputScanner = new Scanner(System.in);
        String command = inputScanner.nextLine();
        ArrayList<String> listOfCommands = new ArrayList<>(Arrays.asList(command.split(" ")));
        String commandType = listOfCommands.remove(0);
        ArrayList<Integer> commandParameters = listOfCommands.stream().map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));

        switch(commandType) {
            case "C":
                Command c1 = new Create(squareBrain, commandParameters.get(0), commandParameters.get(1));
                c1.execute();
                break;
            case "S":
                c1 = new Scale(squareBrain, commandParameters.get(0), commandParameters.get(1));
                c1.execute();
                break;
            case "M":
                c1 = new Move(squareBrain, commandParameters.get(0), (commandParameters.get(1)), commandParameters.get(2));
                c1.execute();
                break;
            case "P":
                squareBrain.print();
                break;
            case "U":
                squareBrain.undo();
                break;
            case "R":
                squareBrain.redo();
        }

    }
}