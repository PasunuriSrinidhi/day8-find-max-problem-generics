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

	public static void main(String[] args) {
		System.out.println("Welcome to Generic Program.");
		Integer x = 10, y = 23, z = 15;
		Float d = 12.5f, e = 13.4f, f = 22.0f;
		String s1 = "Apple", s2 = "Peach", s3 = "Banana";

		MaximumNumber max = new MaximumNumber();
		max.getMaximum(x, y, z);
		max.getMaximum(d, e, f);
		max.getMaximum(s1, s2, s3);
	}
}