package converter;

import human.adult.IWeightTheFruits;

public class ConverterToKg implements IWeightTheFruits {
    @Override
    public int convert(int gather) {
        return gather * 100;
    }
}
