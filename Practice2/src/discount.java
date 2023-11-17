//202312377 정윤아

import java.util.Scanner;

public class discount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가격과 할인율(%)를 입력하세요.");
		
		double price = scanner.nextDouble();
		int dis_rate = scanner.nextInt();
		
		double price2 = (price * (1-dis_rate*0.01));
		int one = price2 % 10;
		int price3 = price2 - one;
		
		System.out.println("할인 가격은 " + price3 + "입니다.");
		
		scanner.close();

	}

}
