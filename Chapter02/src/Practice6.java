import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1~99 사이의 정수를 입력하시오 >> ");
		int x = scanner.nextInt();
		
		int ten = x / 10;
		int one = x % 10;
		
		if (ten%3==0 && one%3==0) {
			System.out.println("박수짝짝");
		}
		else if (ten%3!=0 && one%3!=0) {
			System.out.println();
		}
		else
			System.out.println("박수짝");

	}

}
