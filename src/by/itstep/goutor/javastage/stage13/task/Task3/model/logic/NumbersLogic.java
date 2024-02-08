package by.itstep.goutor.javastage.stage13.task.Task3.model.logic;

public class NumbersLogic {
    public static boolean getOrderedNumbers(int[] numbers) {

        boolean ordered = true;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < numbers[i - 1]) {
                ordered = false;
                break;
            }

        }


        return ordered;
    }
}
