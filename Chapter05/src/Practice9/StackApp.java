package Practice9;
import java.util.Scanner;

public class StackApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int c = scanner.nextInt();
		
		StringStack s = new StringStack(c);
		
		while(true) {
			System.out.print("문자열 입력 >> ");
			 String val = scanner.next();
			 if(val.equals("그만")){
				 break;
			 }
			 else {
				 s.push(val);
			 }
		}
		
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		int l = s.length();
		for(int i = 0; i < l; i++) {
			System.out.print(s.pop()+" ");
		}
	}
}
