import java.util.Scanner;
import java.util.StringTokenizer;

public class Silseop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수식 입력: ");
		String input = scanner.nextLine();

		StringTokenizer st1 = new StringTokenizer(input, " ");
		
		String str = "";
		
		while(st1.hasMoreTokens()) {
			String part = st1.nextToken();
			str = str + part;
		}
		
		StringTokenizer st2 = new StringTokenizer(str, "+-*/", true);
		
		String x = st2.nextToken();
		String token = st2.nextToken();
		String y = st2.nextToken();
		
		
		int a = Integer.parseInt(x);
		int b = Integer.parseInt(y);
		
		switch(token) {
			case "+":
				System.out.println(x+token+y+" = "+(a+b));
				break;
			case "-":
				System.out.println(x+token+y+" = "+(a-b));
				break;
			case "*":
				System.out.println(x+token+y+" = "+(a*b));
				break;
			case "/":
				if (b == 0)
					System.out.println("나눗셈 불가");
				else
					System.out.println(x+token+y+" = "+(a/b));
				break;
		
		}
		
		System.out.println("202312377 정윤아");
		
	}

}
