package human.child;

public class Someone extends Child implements IGatherTheFruits {
    public Someone(String name, String school) {
        super(name, school);
    }

    @Override
    public int gather() {
        return 0;
    }
}
