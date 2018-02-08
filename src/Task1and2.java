import java.util.concurrent.ThreadLocalRandom;

public class Task1and2 {
	public static void main(String[] args) {
		int arr[] = new int[100];
		for (int i = 0; i < 100; i++) {
			arr[i] = ThreadLocalRandom.current().nextInt(1, 1000);
			if (arr[i] % 2 == 0) {
				System.out.println(i + " элемент массива €вл€етс€ четным числом и равен " + arr[i]);
			}
		}
	}
}
