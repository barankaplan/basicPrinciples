package paket;

public class PaketB extends Paket {
    private int amount;

    public int getAmount() {
        System.out.println(getClass().getName());
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
