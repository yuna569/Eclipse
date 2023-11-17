import java.util.Scanner;

public class Bear extends GameObject {
	Scanner scanner = new Scanner(System.in);	
	int moved;
	int preX, preY;
	
	Bear(int startX, int startY, int distance){
		super(startX, startY, distance);
		this.moved = 0;
	}
	
	@Override
	public void move(){
		System.out.print("왼쪽(a), 위(w), 아래(s), 오른쪽(d) >> ");
		String direction = scanner.next();
		System.out.println();
		
		this.preX = this.x;
		this.preY = this.y;
		
		if (direction.equals("a")) {
			this.y -= distance;
		}
		else if (direction.equals("d")) {
			this.y += distance;
		}
		else if (direction.equals("s")) {
			this.x += distance;
		}
		else if (direction.equals("w")) {
			this.x -= distance;
		}
		else {
			System.out.println("잘못된 입력");
			moved --;
		}
		
		moved ++;
	}
	
	protected char getShape() {
		return 'B';
	}
	
}
