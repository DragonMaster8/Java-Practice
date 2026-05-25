public class SumNumbers {

	public static void sum(int[] a) {
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		System.out.println("sum:" + sum);
		System.out.println("length:" + a.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 5 };

		sum(arr);

		int[][] arr1 = { { 1, 2 }, { 3, 4 }, { 3, 4 } };

		System.out.println("size of arr1 : " + arr1.length);

	}

}
