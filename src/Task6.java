import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����������� �������");
		int num = sc.nextInt();

		int arr[] = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = ThreadLocalRandom.current().nextInt(1, 1000);
		}

		System.out.println("�������� ������ ����� ��� \n" + Arrays.toString(arr) + "\n");

		ArrayList<Integer> listEven = new ArrayList<Integer>();
		ArrayList<Integer> listOdd = new ArrayList<Integer>();

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				listEven.add(i);
			} else {
				listOdd.add(i);
			}
		}
		System.out.println("���������� ������ ��������� ������� = " + listEven.toArray().length);
		System.out.println("���������� �������� ��������� ������� = " + listOdd.toArray().length + "\n");

		System.out.println("������ �������� ������� ����� �������: \n" + listEven + "\n");
		System.out.println("�������� �������� ������� ����� �������: \n" + listOdd);

		if (listEven.toArray().length >= listOdd.toArray().length) {
			for (int i = 0; i < listOdd.toArray().length; i++) {
				temp = arr[listEven.get(i)];
				arr[listEven.get(i)] = arr[listOdd.get(i)];
				arr[listOdd.get(i)] = temp;
			}
		} else {
			for (int i = 0; i < listEven.toArray().length; i++) {
				temp = arr[listEven.get(i)];
				arr[listEven.get(i)] = arr[listOdd.get(i)];
				arr[listOdd.get(i)] = temp;
			}
		}
		System.out.println("\n������������ ������ ����� ��� \n" + Arrays.toString(arr));

	}
}