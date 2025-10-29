import java.util.ArrayList;

public class PracticeProblem {

	public static void main(String args[]) {
		for (int i : recaman(17)) {
			System.out.println(i);
		}
	}

	public static int[] recaman(int n) {
		if (n <= 0) {
			return new int[]{};
		}

		ArrayList<Integer> nums = new ArrayList<Integer>();

		a(n, nums);

		return nums.stream().mapToInt(i -> i).toArray();
	}

	public static int a(int n, ArrayList<Integer> arr) {
		if (n == 0) {
			return 0;
		}

		int prev = a(n - 1, arr);

		if (arr.contains(prev - n) || prev - n <= 0) {
			arr.add(prev + n);
			return prev + n;
		}
		arr.add(prev - n);
		return prev - n;
	}

}
