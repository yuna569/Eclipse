import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 몇 개? ");
		int num = scanner.nextInt();
		
		int array [] = new int [num];
		
		for (int i = 0 ; i < array.length ; i++) {
			int x = (int)(Math.random()*100 + 1);
			boolean flag = true;
			
			for (int j = 0 ; j < array.length ; j++) {
				if (x == array[j])
					flag = false;
			}
			
			if (flag == true) {
				array[i] = x;
			}
			else
				i--;
		}
		
		for (int k: array) {
			System.out.print(k + " ");
		
		}
	}
}
