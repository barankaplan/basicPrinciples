package human.child;

import fruit.Fruit;

import java.util.*;
import java.util.stream.Collectors;

public class StudentA extends Girl implements IAddTheFruits, IGatherTheFruits {
    private static ArrayList<Fruit> listOfTheFruits = new ArrayList<>();
    private static Set<String> hash_set = new HashSet<>();


    public StudentA(String name, String school, int age) {
        super(name, school, age);
    }

    public StudentA(String name, int age) {
        super(name, age);
    }

    @Override
    public final void getAge() {
        System.out.println("overridden method in student");
        super.getAge();
    }

    @Override
    protected void message() {
        System.out.println("boys and girls use interface , but only a girl uses implements this" +
                "abstract method!");
    }

    @Override
    public final void addFruit(Fruit... fruit) {
        listOfTheFruits.addAll(Arrays.asList(fruit));
    }

    @Override
    public final int gather() {
        return gathering();
    }

    private static int gathering() {
        generalInformation();
        System.out.println(getFruitList());
        System.out.println(fruitsAndAmounts());
        return getSumOfTheFruits();
    }

    private static Map<String, Integer> fruitsAndAmounts() {
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < listOfTheFruits.size(); i++) {
            if (!result.containsKey(listOfTheFruits.get(i).getClass().getName())) {
                result.put(listOfTheFruits.get(i).getClass().getName(), listOfTheFruits.get(i).getAmount());
            } else {
                //add the current change to the already existing sum
                int sumSoFar = result.get(listOfTheFruits.get(i).getClass().getName());
                result.put(listOfTheFruits.get(i).getClass().getName(), sumSoFar + listOfTheFruits.get(i).getAmount());
            }
        }
        return result;
    }

    private static List<Fruit> getFruitList() {
        List<Fruit> listOfTheObjects = listOfTheFruits.stream().distinct().collect(Collectors.toList());
        return listOfTheObjects;
    }

    private static int getSumOfTheFruits() {
        int sumOfTheFruits = listOfTheFruits.stream().mapToInt(Fruit::getAmount).sum();
        return sumOfTheFruits;
    }

    private static void generalInformation() {
        for (var val :
                listOfTheFruits) {
            hash_set.add(val.getClass().getName());
        }
        System.out.println("we have " + hash_set.size() + " types of fruit");
        for (var val :
                hash_set) {
            System.out.println(val.substring(val.lastIndexOf(".") + 1));
        }
    }



}
