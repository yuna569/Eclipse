import java.util.Scanner;

public class intSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 두 개를 공백으로 구분해 입력하시오.");
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		scanner.close();
		
		int sum = x + y;
		
		System.out.print("두 정수의 합은: "+ (x+y));		
	}
}
