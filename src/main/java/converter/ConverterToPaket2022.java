package converter;

import human.adult.IPackageTheFruits;

public class ConverterToPaket2022 implements IPackageTheFruits {
    @Override
    public int convert(int gather) {
        return gather * 3;
    }
}
