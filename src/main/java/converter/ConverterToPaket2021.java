package converter;

import human.adult.IPackageTheFruits;

public class ConverterToPaket2021 implements IPackageTheFruits {
    @Override
    public int convert(int gather) {
        return gather * 2;
    }

}
