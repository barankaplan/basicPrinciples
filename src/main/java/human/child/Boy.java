package human.child;

public abstract class Boy extends Child {
    private final int weight;

    protected Boy(String name, String school, int weight) {
        super(name, school);
        this.weight = weight;
    }


    @Override
    public String getName() {
        return "child is a boy and his name is " + super.getName();
    }


    public void getTheNameOfTheSchool() {
        System.out.println("the name of the school is: " + getSchool());
    }

    @Override
    protected void polyMorph() {
        System.out.println(getName());
    }
}
