public class Scale implements Command {
    SquareBrain squareBrain;
    int id;
    int j;

    public Scale(SquareBrain squareBrain, int id, int j) {
        this.squareBrain = squareBrain;
        this.id = id;
        this.j = j;
    }

    public void execute() {
        this.squareBrain.scale(this.id, this.j);
    }
}
