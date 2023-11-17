import java.util.Scanner;

public class Player {
	String name;
	String word;
	
	public Player() {
	}
	
	Scanner scanner = new Scanner(System.in);
	
	public void getWordFromUser() {
		this.word = scanner.next();
	}
	
	public boolean checkSuccess(String pre) {
		char pres = word.charAt(0);
		
		return (pre.charAt(pre.length() - 1) == pres);
	}
	
}
