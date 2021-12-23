package human.adult;

import human.Human;

public abstract class Adult extends Human {

    Adult(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "human is an adult and the name is : " + super.getName();
    }
}
