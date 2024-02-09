package by.itstep.goutor.javastage.stage13.task.task6.model.logic;

public class MirrorNumberLogic {
    public static boolean getMirrorNumberLogic(int[] numbers) {

        if (numbers.length % 2 != 1) {
            return false;
        }

        boolean mirror = true;

        for (int i = 0; i < numbers.length / 2; i++) {

            if (numbers[i] != numbers[numbers.length - 1 - i]) {
                mirror = false;
                break;
            }


        }


        return mirror;
    }
}
