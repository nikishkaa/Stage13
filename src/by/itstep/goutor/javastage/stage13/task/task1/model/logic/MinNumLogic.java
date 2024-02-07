package by.itstep.goutor.javastage.stage13.task.task1.model.logic;

public class MinNumLogic {
    public static final int ERROR = -1;

    public static int getMinNumLogic(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < 0) {
                return ERROR;
            }
        }


        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < minNum) {
                minNum = numbers[i];
            }

        }


        return minNum;
    }
}
