package human.child;

public abstract class Girl extends Child {
    private final int age;

    protected Girl(String name, String school, int age) {
        super(name, school);
        this.age = age;
    }

    protected Girl(String name, int age) {
        super(name, "not known");
        this.age = age;
    }

    public void getAge() {
        System.out.println("age method in girl");
        System.out.println(age + " years old" + "\n");
    }

    @Override
    public String getName() {
        return "child is a girl her name is " + super.getName() + "\n";
    }

    @Override
    protected void polyMorph() {
        getAge();
    }

    protected abstract void message();


}
