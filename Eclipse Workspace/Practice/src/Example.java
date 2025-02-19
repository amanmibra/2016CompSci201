import java.util.Arrays;

public class Example {
	public static void arrayModify(int[][] a) {
		int[] x = {2, 4, 3, 8, 5, 6};
		a[1] = x;
		a[2][0] = 4;
		a[2][1] = 9;
		a[2][2] = 3;
		a[2][3] = a[1][2];
		a[1][3] = a[0][1];
	}
	public static void main(String[] args) {
		int[] a = {2, 5, 5, 6, 3};
		int[] b = {7, 8, 1, 3, 7};
		int[] c = {2, 5, 7, 1, 6};
		int[][] d = {a, b, c};
		arrayModify(d);
		System.out.println(Arrays.toString(d));
		}
}