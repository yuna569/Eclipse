import java.util.Random;

public class Fish extends GameObject{
	Random random = new Random();
	
	int preX, preY;
	
	Fish(int startX, int startY, int distance){
		super(startX, startY, distance);
	}
	
	@Override
	public void move(){
		int direction = random.nextInt(4);
		
		preX = this.x;
		preY = this.y;
		
		if (direction == 0) {
			this.x -= distance;
		}
		else if (direction == 1) {
			this.x += distance;
		}
		else if (direction == 2) {
			this.y -= distance;
		}
		else if (direction == 3) {
			this.y += distance;
		}
		
		
	}
	
	protected char getShape() {
		return '@';
	}
}
