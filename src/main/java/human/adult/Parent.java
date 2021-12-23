package human.adult;


import human.child.StudentA;


public class Parent extends Adult {
    private final IWeightTheFruits iWeightTheFruits;
    private final StudentA studentA;


    public Parent(String name, IWeightTheFruits iWeightTheFruits, StudentA studentA) {
        super(name);
        this.iWeightTheFruits = iWeightTheFruits;
        this.studentA = studentA;
    }


    public int weightedByParent() {
        System.out.println("weightedByParent");
        return iWeightTheFruits.convert(studentA.gather());
    }

}
