import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class Task7 {
	public static void main(String[] args) {
		int arr[] = new int[100];
		for (int i = 0; i < 100; i++) {
			arr[i] = ThreadLocalRandom.current().nextInt(1, 1000);
		}
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "-й элемент " + " " + arr[i]);
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Минимальный элемент массива = " + min);
		double[] arrDouble = new double[100];
		for (int i = 0; i < arr.length; i++) {
			arrDouble[i] = arr[i] / (double)min;
		}
		System.out.println(Arrays.toString(arrDouble));
	}
}