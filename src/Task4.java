import java.util.concurrent.ThreadLocalRandom;

public class Task4 {
	public static void main(String[] args) {

		int kolOdd=0;
		int kolEven=0;
		
		int arr[] = new int[100];
		for (int i = 0; i < 100; i++) {
			arr[i] = ThreadLocalRandom.current().nextInt(1, 1000);
			if (arr[i] % 2 == 0) {
				kolEven++;
			} else {
				kolOdd++;
			}
		}
		System.out.println("Количество четных элементов = " + kolEven);
		System.out.println("Количество нечетных элементов = " + kolOdd);
	}
}