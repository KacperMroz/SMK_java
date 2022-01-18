import java.util.EmptyStackException;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class SquareBrain {
    public TreeMap<Integer, Square> mapOfSquares; //map with current state to print
    public Stack<TreeMap<Integer,Square>> historicalStack = new Stack<>(); //stack with historical states to undo
    public Stack<TreeMap<Integer,Square>> undoStack = new Stack<>(); //stack with maps which were undo (to be able to do redo)

    public SquareBrain() {
        this.mapOfSquares = new TreeMap<>();
    }


    public void create(int id, int x, int y, int length) {
        updateStack();
        Square square = new Square(x, y, length);
        this.mapOfSquares.put(id, square);
    }

    void move(int id, int j, int k) {
        updateStack();
        Square squareToMove = this.mapOfSquares.get(id);
        if (squareToMove != null) {
            squareToMove.x += j;
            squareToMove.y += k;
        }
    }

    void print() {
        this.mapOfSquares.forEach((key, value) -> System.out.println(key + " " + value));
    }

    void scale(int id, int j) {
        updateStack();
        Square squareToScale = this.mapOfSquares.get(id);
        if (squareToScale != null) {
            squareToScale.length *= j;
        }
    }

    void updateStack() {
        historicalStack.push((clone(this.mapOfSquares)));
    }


    public TreeMap<Integer, Square> clone(TreeMap<Integer, Square> original) {
        TreeMap<Integer, Square> copy = new TreeMap<>();
        for (Map.Entry<Integer, Square> entry : original.entrySet()) {
            copy.put(entry.getKey(), new Square(entry.getValue()));
        }
        return copy;
    }

    void undo(){
        try {
            undoStack.push(clone(mapOfSquares));
            this.mapOfSquares = historicalStack.pop();
        } catch (EmptyStackException e) {
            e.printStackTrace();
        }
    }

    void redo(){
        try {
            historicalStack.push(clone(mapOfSquares));
            this.mapOfSquares = undoStack.pop();
        } catch (EmptyStackException e) {
            e.printStackTrace();
        }
    }
}