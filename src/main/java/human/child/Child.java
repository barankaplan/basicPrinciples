package human.child;

import human.Human;

public abstract class Child extends Human {
    private final String school;

    protected Child(String name, String school) {
        super(name);
        this.school = school;
    }

    protected String getSchool() {
        return school;
    }

    @Override
    public String getName() {
        System.out.println("human is a child");
        return super.getName();
    }


    protected void polyMorph() {
        System.out.println(getSchool());
    }


}
