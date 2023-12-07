import java.util.*;

public class Practice02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Character> al = new ArrayList<>();
		
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> ");
		
		for ( int i = 0; i < 6; i++ ) {
			char grade = scanner.next().charAt(0);
			al.add(grade);
		}
		
		Iterator<Character> it = al.iterator();
		
		double sum = 0;
		
		while(it.hasNext()) {
			char grade = it.next();
			switch(grade) {
			case 'A':
				sum += 4.0;
				break;
			case 'B':
				sum += 3.0;
				break;
			case 'C':
				sum += 2.0;
				break;	
			case 'D':
				sum += 1.0;
				break;
			case 'F':
				sum += 0;
				break;
			default:
				break;
			}
			
		}

		double average = (sum / al.size());
			
		System.out.print("평점: " + average);
		
		

	}

}
