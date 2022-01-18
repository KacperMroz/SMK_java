class Create implements Command {
    SquareBrain squareBrain;
    int id;
    int length;

    public Create(SquareBrain squareBrain, int id, int length) {
        this.squareBrain = squareBrain;
        this.id = id;
        this.length = length;
    }

    public void execute() {
        this.squareBrain.create(this.id, 0, 0, this.length);
    }
}