package PA9;
import java.util.Arrays;
public class Test {
	private final static void testUselessStuff() {
		System.out.println("*** nth Tribonacci number ***\n");
		int[] tribonacci = { 0, 1, 2, 3, 6, 10 };
		for (int t : tribonacci)
			System.out.printf("Term %2d of Tribonacci series is %3d%n", t, Recursion.tribonacci(t));
		System.out.println("\n*** Power of 2 checker ***\n");
		int[] numbers = { 1, 2, 3, 4, 7, 11, 16, 27, 32, 49, 64 };
		for (int n : numbers)
			System.out.printf("Is %2d is a power of 2? %s%n", n, Recursion.isPowerOf2(n) ? "Yes" : "No");
		System.out.println("\n*** Number of even digits ***\n");
		int[] numEvenDigits = { 0, 7, 30, 56, 21400 };
		for (int e : numEvenDigits)
			System.out.printf("Number of even digits in %5d is %d%n", e, Recursion.countEvenDigits(e));
		System.out.println("\n*** Sum of integers upto n that are divisible by k ***\n");
		int[] integers = { 10, 11, 10, 11, 12, 10, 14 };
		int[] divisors = { 2, 2, 3, 3, 3, 5, 5 };
		for (int i = 0; i < integers.length; i++)
			System.out.printf("n = %d, k = %d; Sum = %d%n", integers[i], divisors[i],
					Recursion.sumPosIntegersDivk(integers[i], divisors[i]));
		System.out.println("\n*** Linear Search an array ***\n");
		int A[] = { 5, 4, 1, 3, 4, 2, 10 };
		System.out.println("Array is " + Arrays.toString(A));
		int keys[] = { -1, 5, 10, 4, 15 };
		for (int key : keys)
			System.out.printf("Searching for key %2d: %b%n", key, Recursion.searchArray(A, key));
	}
	private static void printMatrix(int[][] matrix) {
		for (int[] row : matrix)
			System.out.println(Arrays.toString(row));
	}
	private static void testDeterminant() {
		int[][] oneByOne = { { 8 } };
		int[][] twoByTwo = { { 4, 7 }, { 1, 2 } };
		int[][] threeByThree = { { 4, 7, 0 }, { 1, 2, 3 }, { 4, 1, 6 } };
		int[][] fourByFour = { { 5, 6, 1, 4 }, { -8, 7, 0, 6 }, { 1, -8, -4, 2 }, { 6, 0, 3, 1 } };

		int[][][] matrices = { oneByOne, twoByTwo, threeByThree, fourByFour };
		System.out.println("\n*** Matrix Determinant ***");
		for (int[][] matrix : matrices) {
			System.out.println("\nDeterminant of the matrix\n");
			printMatrix(matrix);
			System.out.println("\nis " + Recursion.determinant(matrix));
		}
	}
	public static void main(String[] args) {
		testUselessStuff();
		testDeterminant();
	}
}