package builder;

import fruit.Fruit;
import human.adult.Adult;
import human.adult.IPackageTheFruits;
import human.adult.Teacher;
import human.child.Child;
import human.child.StudentB;
import paket.Paket;


public class CreatePaket {

    private static StudentB getStudentB(String name, String school, int weight, Fruit... fruits) {
        return new StudentB(name, school, weight, fruits);
    }
    private static Teacher getTeacher(String name, IPackageTheFruits iPackageTheFruits, StudentB studentB) {
        return new Teacher(name, iPackageTheFruits, studentB);
    }
    private static Paket getPaket(Teacher adult) {
        return adult.packagedByTeacher();
    }


    public static class Builder{
        private Child child;
        private Adult adult;
        private Paket paket;

        public CreatePaket build(){
            return new CreatePaket(this);
        }

        public Builder (){
        }


        public Builder child(String name, String school, int weight, Fruit... fruits) {
            this.child=getStudentB( name,  school,  weight, fruits);
            return this;

        }

        public Builder adult(String name, IPackageTheFruits iPackageTheFruits) {
            this.adult= getTeacher(name,iPackageTheFruits, (StudentB) this.child);
            return this;
        }

        public Builder giveMeMyPaket() {
            this.paket=getPaket((Teacher) this.adult);
            return this;
        }
    }

    private CreatePaket(Builder builder) {
        this.child = builder.child;
        this.adult = builder.adult;
        this.paket = builder.paket;
    }

    private final Child child;
    private final Adult adult;
    private final Paket paket;

    public Child getChild() {
        return child;
    }

    public Adult getAdult() {
        return adult;
    }

    public Paket getPaket() {
        return paket;
    }
}
