package Practice06;
import java.util.*;

public class CheckTime {
	Scanner scanner = new Scanner(System.in);
	int start;
	int end;
	
	int getTime() {
		Calendar now = Calendar.getInstance();
		int sec = 0;
		if (scanner.nextLine() == "") {
			sec = (now.get(Calendar.SECOND));
		}
		
		return sec;
	}
	
	int measureTime() {
		
	}
	
	
}
