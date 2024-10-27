package static2.ex;

public class MathArrayUtils {

    public static int sum(int[] array) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            num += array[i];
        }
        return num;
    }

    public static double average(int[] array) {
        int num = 0;
        int returnNum = 0;
        for (int i = 0; i < array.length; i++) {
            num += array[i];
        }
        returnNum += num / array.length;
        return returnNum;
    }

    public static int min(int[] array) {
        int min = 0;
        min += array[0];
        for (int i = 0; i < array.length; i++) {
            if (min <= array[i]) {
                return min;
            } else {
                min += array[i];
            }
        }
        return min;
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
