import java.util.Random;

    public class Dice {
    private int sides;
    private int value;
    private static final Random rng = new Random();

    public Dice (int sides) {
        this.sides=sides;
        this.value=0;
    }
    public int roll() {
        value=rng.nextInt(1,sides+1);
        return value;
    }
    public int getSides() {
        return sides;
    }
public int getValue() {
    return value;
    }
    @Override 
    public String toString() {
        return "Dice { sides: " +sides + ", value: " +value +"}";
    }
}