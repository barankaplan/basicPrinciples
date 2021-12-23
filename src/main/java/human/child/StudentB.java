package human.child;

import fruit.Fruit;

import java.util.*;
import java.util.stream.Collectors;

public class StudentB extends Boy implements IAddTheFruits, IGatherTheFruits {

    private ArrayList<Fruit> listOfTheFruits = new ArrayList<>();
    private Set<String> hash_set = new HashSet<>();

    public StudentB(String name, String school, int weight,Fruit... fruit) {
        super(name, school, weight);
        addFruit(fruit);
    }

    @Override
    public void addFruit(Fruit... fruit) {
        listOfTheFruits.addAll(Arrays.asList(fruit));
    }

    @Override
    public int gather() {
        return gathering();
    }

    private int gathering() {
        generalInformation();
        System.out.println(getFruitList());
        System.out.println(fruitsAndAmounts());
        return getSumOfTheFruits();
    }

    private Map<String, Integer> fruitsAndAmounts() {
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

    private List<Fruit> getFruitList() {
        List<Fruit> listOfTheObjects = listOfTheFruits.stream().distinct().collect(Collectors.toList());
        return listOfTheObjects;
    }

    private int getSumOfTheFruits() {
        int sumOfTheFruits = listOfTheFruits.stream().mapToInt(Fruit::getAmount).sum();
        return sumOfTheFruits;
    }

    private void generalInformation() {
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


    @Override
    public void getTheNameOfTheSchool() {
        super.getTheNameOfTheSchool();
    }

}
