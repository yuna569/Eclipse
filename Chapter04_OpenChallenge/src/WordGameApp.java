import java.util.Scanner;

public class WordGameApp {
	int num;
	String start;
	
	public WordGameApp(int num, String start) {
		this.num = num;
		this.start = start;
	}
	
	public String run() {
		
		Scanner scanner = new Scanner(System.in);
		
		Player [] players = new Player[this.num];
		
		for (int i = 0 ; i < this.num ; i++) {
			System.out.print("참가자의 이름을 입력하세요 >> ");
			
			players[i] = new Player();
			players[i].name = scanner.next();
		}
		
		String loser;
		boolean flag = true;
		int index = 0;
		
		System.out.println("시작하는 단어는 " + start + "입니다.");
		
		while(flag) {
			
			for (index = 0 ; index < this.num; index++) {
				
				if (players[0].word == null) {
					System.out.print(players[0].name + " >> ");
					players[0].getWordFromUser();
					flag = (start.charAt( start.length() - 1 ) == players[0].word.charAt(0));
				}
				else {
					System.out.print(players[index].name + " >> ");
					players[index].getWordFromUser();
					
					if(index != 0) {
						flag = players[index].checkSuccess(players[index-1].word);
					}
					else {
						flag = players[index].checkSuccess(players[this.num - 1].word);
					}
				}
				
				if (flag == false)
					break;
				
			}
		}	
		
		loser = players[index].name;
		
		return loser;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("게임에 참가하는 인원은 몇 명입니까 >> ");
		int numberOfPlayers = scanner.nextInt();
		
		String startWord = "아버지";
		
		WordGameApp game = new WordGameApp(numberOfPlayers, startWord);
		
		String loser;
		
		loser = game.run();
		
		System.out.print(loser + "이 졌습니다.");
	}

}

