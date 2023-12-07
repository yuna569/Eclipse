import java.util.Scanner;

public class RunGame {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int [][] pan = new int[10][10];
		MakeBoard board = new MakeBoard(pan);

		int score = 0;
		
		do {
			board.printBoard();
			System.out.println("Board[0][0]: "+ board.Board[0][0]);
			System.out.println("Board[9][9]: "+ board.Board[9][9]);
			
			int x1, y1, x2, y2;
			
			System.out.println("(x1, y1), (x2, y2)의 좌표: ");
			
			x1 = scanner.nextInt();
			y1 = scanner.nextInt();
			x2 = scanner.nextInt();
			y2 = scanner.nextInt();
			
			Sum10 process = new Sum10(x1 ,y1, x2, y2, board);

			if (process.checkAdjacent() && process.checkSum()) {
				process.erase();
				score++;
			}
			else {
				System.out.println(board.Board[x1][y1] + board.Board[x2][y2]);
				break;
			}
			
		}while(true);
		
		System.out.print("게임이 끝났습니다.\n점수는 "+score+"점입니다.");
	}
}
