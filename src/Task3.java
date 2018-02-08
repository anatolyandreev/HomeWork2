
public class Task3 {
	public static void main(String[] args) {
		System.out.println("Массив чисел от 1 до 100");
		int arr100[] = new int[100];
		int ind = 0;
		for (int i = 1; i <= 100; i++) {
			arr100[ind] = i;
			System.out.print(" " + arr100[ind]);
			ind++;
		}
		System.out.println(" ");
		System.out.println("Массив чисел с перестановкой");
		int temp;
		for (int i = 0; i < arr100.length - 1; i = i + 2) {
			if (arr100[i] % 2 == 1) {
				temp = arr100[i];
				arr100[i] = arr100[i + 1];
				arr100[i + 1] = temp;
			}
		}
		for (int i = 0; i < arr100.length; i++) {
			System.out.print(" " + arr100[i]);
		}
	}
}
