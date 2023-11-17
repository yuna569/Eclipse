import java.util.Scanner;

public class Practice3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("금액을 입력하시오 >> ");
		
		int price = scanner.nextInt();
		
		int five10000 = price / 50000;
		int temp1 = price % 50000;
		System.out.print("오만원권: ");
		System.out.println(five10000);
				
		int one10000 = temp1 / 10000;
		int temp2 = temp1 % 10000;
		System.out.print("만원권: ");
		System.out.println(one10000);
		
		int five1000 = temp2 / 5000;
		int temp3 = temp2 % 5000;
		System.out.print("오천원궘: ");
		System.out.println(five1000);
		
		int one1000 = temp3 / 1000;
		int temp4 = temp3 % 1000;
		System.out.print("천원권: ");
		System.out.println(one1000);
		
		int five100 = temp4 / 500;
		int temp5 = temp4 % 500;
		System.out.print("오백원: ");
		System.out.println(five100);
		
		int one100 = temp5 / 100;
		int temp6 = temp5 % 100;
		System.out.print("백원: ");
		System.out.println(one100);
		
		int five10 = temp6 / 50;
		int temp7 = temp6 % 50;
		System.out.print("오십원: ");
		System.out.println(five10);
		
		int one10 = temp7 / 10;
		int one1 = temp7 % 10;
		System.out.print("십원: ");
		System.out.println(one10);
		System.out.print("일원: ");
		System.out.println(one1);
				
		System.out.println();
	}

}


//함수와 배열로 다시 풀어보기