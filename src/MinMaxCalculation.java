public class MinMaxCalculation {
    public static double calculateMin(double... numbers) {
        double min = Double.MAX_VALUE;
        for (double num : numbers) {
            min = Math.min(min, num);
        }
        if (min == Double.MAX_VALUE)
            return 0;
        return min;
    }
    public static double calculateMax(double... numbers) {
        double max = Double.MIN_VALUE;
        for (double num : numbers) {
            max = Math.max(max, num);
        }
        if (max == Double.MIN_VALUE)
            return 0;
        return max;
    }

}
