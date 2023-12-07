import java.util.*;

public class Practice01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		
		System.out.print("정수 >> ");
		while(true) {
			int i = scanner.nextInt();
			
			if(i == -1) {
				break;
			}
			
			v.add(Integer.valueOf(i));
			
		}
		
		Iterator<Integer> it = v.iterator();
		
		int max = 0;
		
		while(it.hasNext()) {
			int n = it.next();
			
			if(n > max) {
				max = n;
			}
			
		}
		
		System.out.print("최댓값: "+ max);

	}

}
