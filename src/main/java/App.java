
import Report.Result;
import Report.Resultv2;
import builder.CreatePaket;
import converter.ConverterToKg;
import converter.ConverterToPaket2021;
import converter.ConverterToPaket2022;
import fruit.*;
import human.adult.Parent;
import human.child.Someone;
import human.child.StudentA;
import human.child.StudentB;
import human.adult.Teacher;
import paket.PaketA;
import paket.PaketB;


public class App {

    public static void main(String[] args) {

        // prove how to work the mechanism
        Result.showTheResults(new Someone("someone", "no school"));

        //first approach - too long
        run();

        //a custom builder design-it is actually not proper just to show you how to make a development
        //if you start by using basic principles
        System.out.println(" ");
        System.out.println("custom design\n");

        CreatePaket.Builder builder = new CreatePaket.Builder();

        builder.child("noah", "no school", 45, new Pear(15), new Apple(12)).
                adult("marry", new ConverterToPaket2021()).giveMeMyPaket();

        CreatePaket createPaket = builder.build();

        System.out.println(createPaket.getChild().getName());
        System.out.println(createPaket.getPaket().getAmount());
        System.out.println(createPaket.getAdult().getName());


    }

    private static void run() {
        System.out.println("StudentA\n");
        //create a student
        StudentA studentA = new StudentA("sarah", 6);
        //add fruits into the array list
        studentA.addFruit(new Apple(5), new Apple(2));
        studentA.addFruit(new Apple(5), new Pear(4), new Apple(2));
        //check the details
        Resultv2 resultv2 = new Resultv2(studentA);
        resultv2.showTheResults();
        //create a package
        int convertedValue = new Parent("john", new ConverterToKg(), studentA).weightedByParent();
        PaketA paketA = new PaketA();
        paketA.setAmount(convertedValue);


        System.out.println("StudentB\n");
        //create a student this time add the fruits via ctor
        StudentB studentB = new StudentB("sarah", "school a", 65, new Apple(4), new Banana(10));
        //check the details
        Result.showTheResults(studentB);
        //create a package
        PaketB paketB = new Teacher("marry", new ConverterToPaket2022(), studentB).packagedByTeacher();


        System.out.println("what's in my package?");
        System.out.println(paketA.getAmount());
        System.out.println(paketB.getAmount());
    }


}
