
public class Game {

	public static void main(String[] args) {
		Bear bear = new Bear(0,0,1);
		Fish fish = new Fish(5,5,2);
		
		char [][] board = new char[10][20];
		
		int i = 0, j = 0;
		
		for(i = 0; i < board.length ; i++) {
			for (j = 0; j < board[0].length ; j++) {
				board[i][j] = '-';
			}
		}
		
		boolean hungry = !(bear.collide(fish));
		boolean flag = true;
		
		while(flag) {
			
			board[fish.x][fish.y] = fish.getShape();
			board[bear.x][bear.y] = bear.getShape();
			
			for (char[] k : board) {
				for (char l : k) {
					System.out.print(l);
				}
				System.out.println();
			}			
			
			if(bear.collide(fish)) {
				System.out.println("잡았다 물고기 !");
				System.out.println(bear.moved+"번만에 승리");
				break;
			}			
			
			bear.move();
			if( bear.checkOver(bear.x, bear.y, board.length, board[0].length )) {
				System.out.println("Out of range");
				bear.moved -= 1;
				continue;
			}
			
			if(( bear.moved % 5 == 4 )||( bear.moved % 5 == 0 )) {
				fish.move();
				if( fish.checkOver(fish.x, fish.y, board.length, board[0].length )) {
					System.out.println("물고기가 탈출했다 !");
					System.out.println("패배");
					flag = false;
				}
			}
			
			board[bear.preX][bear.preY] = '-';
			board[fish.preX][fish.preY] = '-';	
			
		}
		
	}
	
}
