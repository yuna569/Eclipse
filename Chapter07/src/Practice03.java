import java.util.*;

public class Practice03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<>();
		
		System.out.println("나라 이름과 인구를 입력하세요.");
		
		while(true) {
			System.out.print("나라 이름, 인구 >> ");
			
			String nation = scanner.next();
			
			if(nation.equals("그만")) {
				break;
			}
			
			int population = scanner.nextInt();
			
			nations.put(nation, population);
		}
		
		while(true) {
			System.out.print("인구 검색 >> ");
			
			String nation = scanner.next();
			
			if(nation.equals("그만")) {
				break;
			}
			
			Integer population = nations.get(nation);
			
			if(population == null) {
				System.out.println(nation+" 나라는 없습니다.");
			}
			else {
				System.out.println(population);
			}
		}

	}

}
