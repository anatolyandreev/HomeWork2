import java.util.concurrent.ThreadLocalRandom;

public class Task5 {
	public static void main(String[] args) {
		int arr[] = new int[100];
		for (int i = 0; i < 100; i++) {
			arr[i] = ThreadLocalRandom.current().nextInt(1, 1000);
		}
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "-й элемент " + " " + arr[i]);
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Максимальный элемент массива = " + max);
	}
}