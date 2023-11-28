import java.util.*;
public class MaximumNumber {
	private static <T extends Comparable> void getMaximum(T x, T y, T z) {

		T max = x;
		if (y.compareTo(x) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}

		System.out.println("Maximum ::" + max);
	}

	public static <T extends Comparable<T>> T checkMaximum_With_MoreThan_ThreeParameters(T... elements) {
		T max = elements[0];
		for (T maximumParametereter : elements) {
			if (maximumParametereter.compareTo(max) > 0) {
				max = maximumParametereter;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Generic Program.");
		System.out.println("Show Maximum Value:");
		Integer x = 10, y = 23, z = 15;
		Float d = 12.5f, e = 13.4f, f = 22.0f;
		String s1 = "Apple", s2 = "Peach", s3 = "Banana";
		Integer i = checkMaximum_With_MoreThan_ThreeParameters(10, 23, 15, 20, 24);
		Float c = checkMaximum_With_MoreThan_ThreeParameters(12.5f, 13.4f, 22.0f, 24.0f, 20.8f);
		String s = checkMaximum_With_MoreThan_ThreeParameters("Apple", "Peach", "Banana", "Mango", "Orange");

		MaximumNumber max = new MaximumNumber();
		max.getMaximum(x, y, z);
		max.getMaximum(d, e, f);
		max.getMaximum(s1, s2, s3);

		System.out.println("The maximum integer value is : " + i);
		System.out.println("The maximum float value is : " + c);
		System.out.println("The maximum string value is : " + s);

	}
}