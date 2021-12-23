package fruit;

public class Banana extends Fruit {

    public Banana(int amount) {
        super(amount);
    }

    @Override
    public String toString() {
        return "Banana: " + getAmount();
    }
}
