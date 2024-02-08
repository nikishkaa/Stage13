package by.itstep.goutor.javastage.stage13.task.task5.model.logic;

public class NumbersLogic {
    public static boolean getSameNumbers(int[] numbers) {

        boolean same = true;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] != numbers[i - 1]) {
                same = false;
                break;
            }

        }

        return same;
    }
}
