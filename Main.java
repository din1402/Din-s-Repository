public class Main {
    public static int minimum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty/null");
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};
        int minimum = minimum(numbers);
        System.out.println("Min value is " + minimum);
    }
}
