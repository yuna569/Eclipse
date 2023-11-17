import java.util.Random;

public class MakeBoard {
	Random ran = new Random();
	int [][] Board;
	
	MakeBoard(int [][] Board){
		int i, j;
		this.Board = Board;
		
		for ( i = 0; i < Board.length ; i++ ) {
			for ( j = 0 ; j < Board[0].length ; j++ ) {
				this.Board[i][j] = ran.nextInt(9)+1;
			}
		}
	}
	
	void printBoard() {
		System.out.print("  | ");
		for(int y=0;y<10;y++) {
			System.out.print(y+" ");
		}
		
		System.out.println();
		System.out.print("------------------------");
		System.out.println();
		
		int x = 0;
		
		for(int[] k : Board) {
			System.out.print(x+" | ");
			
			for(int l : k) {
				System.out.print(l+" ");
			}
			System.out.println();
			x++;
		}
	}
}