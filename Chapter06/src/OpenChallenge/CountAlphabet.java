package OpenChallenge;
import java.util.*;
import java.lang.*;

public class CountAlphabet {
	private int [] count = new int[26];
	
	void count() {
		StringTokenizer st = new StringTokenizer(readString());
		
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				
				if (c >= 97 && c <= 122) {
					count[c-97] += 1;
				}
				else if (c >= 65 && c <= 90) {
					count[c-65] += 1;
				}
			}
		}
	}
	
	String readString() {
		System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
		
		StringBuffer sb = new StringBuffer();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String line = scanner.nextLine();
			if( line.equals(";") )
				break;
			sb.append(line);
		}
		return sb.toString();
	}
	
	void drawHistogram() {
		System.out.println("히스토그램을 그립니다.");
		for (int i = 0; i < count.length; i++) {
			System.out.print((char)(i+65)+" ");
			for (int j = 0; j < count[i]; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}
}
