import java.util.*;

public class MaximumNumber<T extends Comparable<T>> {
    private T x, y, z;

    public MaximumNumber(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    private T getMaximum() {
        T max = x;
        if (y.compareTo(x) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public void testMaximum() {
        T max = getMaximum();
        System.out.println("Maximum :: " + max);
    }

    public static <T extends Comparable<T>> void testMaximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(x) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        System.out.println("Maximum :: " + max);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Generic Program.");

        // Integer test
        MaximumNumber<Integer> intMax = new MaximumNumber<>(10, 23, 15);
        intMax.testMaximum();

        // Float test
        MaximumNumber<Float> floatMax = new MaximumNumber<>(12.5f, 13.4f, 22.0f);
        floatMax.testMaximum();

        // String test
        MaximumNumber<String> stringMax = new MaximumNumber<>("Apple", "Peach", "Banana");
        stringMax.testMaximum();
    }
}
