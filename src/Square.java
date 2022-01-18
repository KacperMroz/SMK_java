public class Square {
    int x;
    int y;
    int length;

    public Square(int x, int y, int length) {
        this.x = x;
        this.y = y;
        this.length = length;
    }

    public Square(Square square) {
        this.x = square.x;
        this.y = square.y;
        this.length = square.length;
    }

    public String toString() {
        return this.x + " " + this.y + " " + this.length;
    }
}