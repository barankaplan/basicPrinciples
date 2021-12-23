package fruit;


public class Pear extends Fruit {

    public Pear(int amount) {
        super(amount);
    }

    @Override
    public String toString() {
        return "Pears: " + getAmount();
    }
}
