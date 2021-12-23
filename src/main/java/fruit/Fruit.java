package fruit;

public abstract class Fruit {
    private final int amount;


    protected Fruit(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

}
