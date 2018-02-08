import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите размерность массива");
		int num = sc.nextInt();

		int arr1[] = new int[num];
		int arr2[] = new int[num];
		for (int i = 0; i < num; i++) {
			arr1[i] = ThreadLocalRandom.current().nextInt(1, 1000);
			arr2[i] = ThreadLocalRandom.current().nextInt(1, 1000);
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		int temp = 0;
		int last = 0;
		if (arr1.length % 2 == 1) {
			last = arr1[arr1.length - 1];
			arr1[arr1.length - 1] = arr2[0];
			arr2[0] = last;
			for (int i = 0; i < num - 2; i = i + 2) {
				temp = arr1[i];
				arr1[i] = arr2[i + 1];
				arr2[i + 1] = temp;
			}
		} else {
			for (int i = 0; i < num; i = i + 2) {
				temp = arr1[i];
				arr1[i] = arr2[i + 1];
				arr2[i + 1] = temp;
			}
		}
		System.out.println("\n");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

}
