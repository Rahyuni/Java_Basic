package static2.ex;

public class MathArrayUtils {
    private static int value;

    public static int sum(int[] array) {
        for (int i = 0; i < array.length; i++) {
            value += array[i];
        }
        return value;
    }

    public static double average(int[] array) {
        int num = 0;
        value = 0;
        for (int i = 0; i < array.length; i++) {
            value += array[i];
        }
        num += value / array.length;
        return num;
    }

    public static int min(int[] array) {
        int num = 0;
        num += array[0];
        for (int i = 0; i < array.length; i++) {
            if (num <= array[i]) {
                return num;
            } else {
                num += array[i];
            }
        }
        return num;
    }

    public static int max(int[] array) {
        int max = 0;
        max += array[0];
        for (int i = 0; i < array.length; i++) {
            if (max > array[i]) {
                return max;
            } else {
                max = array[i];
            }
        }
        return max;
    }
}
