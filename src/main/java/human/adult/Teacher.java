package human.adult;

import human.child.StudentB;
import paket.PaketB;

public class Teacher extends Adult {
    private final IPackageTheFruits iPackageTheFruits;
    private final StudentB studentB;
    private final PaketB paketB = new PaketB();

    public Teacher(String name, IPackageTheFruits iPackageTheFruits, StudentB studentB) {
        super(name);

        this.iPackageTheFruits = iPackageTheFruits;
        this.studentB = studentB;
    }

    public PaketB packagedByTeacher() {
        System.out.println("packagedByTeacher");
        paketB.setAmount(iPackageTheFruits.convert(studentB.gather()));
        return paketB;
    }
}
