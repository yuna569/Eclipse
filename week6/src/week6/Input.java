//202312377 정윤아

package week6;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int array [];
		System.out.print("# input: ");
		int num = scanner.nextInt();
		
		array = new int [num];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("input["+i+"]: ");
			array[i] = scanner.nextInt();
		}
		
		System.out.print("search word: ");
		int search = scanner.nextInt();
		
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == search)
				count++;
		}
		
		if (count == 0)
			System.out.println("\"" + search + "\" not found!");
		else
			System.out.println("\"" + search + "\" found " + count + " times.");
		
	}
}
