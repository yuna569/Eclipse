
public class Sum10 {
	int x1, y1;
	int x2, y2;
	MakeBoard made;
	
	Sum10(int x1, int y1, int x2, int y2, MakeBoard board){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		
		this.made = board;
	}
	
	boolean checkAdjacent() {
		int x = x1 - x2; // = 0, 1, -1
		int y = y1 - y2; // = 0, 1, -1
		
		if( (x*x <= 1) && (y*y <= 1) && ((x+y)*(x+y) == 1) ) {
			return true;
		}
		else
			return false;
	}
	
	boolean checkSum() {
		if ((made.Board[x1][y1] + made.Board[x2][y2]) == 10) {
			return true;
		}
		else
			return false;
	}
	
	void erase() {
		made.Board[x1][y1] = 0;
		made.Board[x2][y2] = 0;
	}

}
