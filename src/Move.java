public class Move implements Command {
    int id;
    int j;
    int k;
    SquareBrain squareBrain;

    public Move(SquareBrain squareBrain, int id, int j, int k) {
        this.id = id;
        this.j = j;
        this.k = k;
        this.squareBrain = squareBrain;
    }

    public void execute() {
        this.squareBrain.move(this.id, this.j, this.k);
    }
}