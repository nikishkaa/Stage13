package by.itstep.goutor.javastage.stage13.task.task1.util;

public class GeometricMeanUI {
    public static String getGeometricMeanUI(double geometricMeans) {

        String msg = "\nGeometric means is: ";

        return geometricMeans < 0 ? "Error" : msg + geometricMeans;
    }
}
