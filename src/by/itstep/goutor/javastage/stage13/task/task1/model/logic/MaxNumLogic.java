package by.itstep.goutor.javastage.stage13.task.task1.model.logic;

public class MaxNumLogic {
    public static final int ERROR = -1;

    public static int getMaxNumber(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                return ERROR;
            }
        }


        int maxNum = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > maxNum) {
                maxNum = numbers[i];
            }
        }

        return maxNum;
    }


}
