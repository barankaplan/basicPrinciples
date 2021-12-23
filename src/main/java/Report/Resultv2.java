package Report;

import human.child.Boy;
import human.child.Child;
import human.child.Girl;
import human.child.IGatherTheFruits;

public class Resultv2 {

    private IGatherTheFruits iGatherTheFruits;


    public void setiGatherTheFruits(IGatherTheFruits iGatherTheFruits) {
        this.iGatherTheFruits = iGatherTheFruits;
    }

    public Resultv2(IGatherTheFruits iGatherTheFruits) {
        setiGatherTheFruits(iGatherTheFruits);

    }

    public void showTheResults() {
        System.out.println("Total: " + iGatherTheFruits.gather() + "\n");
        msgDwn((Child) iGatherTheFruits);
        msgUpc((Child) iGatherTheFruits);
    }


    private static void msgUpc(Child child) {
        System.out.println(child.getName() + "\n");
    }

    private static void msgDwn(Child child) {

        if (child instanceof Girl) {
            ((Girl) child).getAge();
        }
        if (child instanceof Boy) {
            ((Boy) child).getTheNameOfTheSchool();
        }
    }
}
