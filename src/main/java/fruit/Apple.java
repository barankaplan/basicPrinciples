package fruit;

public class Apple extends Fruit {

    public Apple(int amount) {
        super(amount);
    }

    @Override
    public String toString() {
        return "Apple: " + getAmount();
    }

}
