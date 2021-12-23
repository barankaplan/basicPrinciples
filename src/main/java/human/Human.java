package human;

public abstract class Human {
    private final String name;

    protected Human(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

}
