
public abstract class GameObject {
	int distance;
	int x, y;
	int preX, preY;
	
	public GameObject(int startX, int startY, int distance){
		this.x = startX;
		this.y = startY;
		this.distance = distance;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public boolean collide(GameObject p) {
		if( (this.x == p.getX()) && (this.y == p.getY()) )
			return true;
		else
			return false;
	}
	
	public boolean checkOver(int x, int y, int lstX, int lstY) {
		if ( x < 0 ||  x >= lstX) {
			this.x = this.preX;
			
			return true;
		}
		else if ( y < 0 || y >= lstY) {
			this.y = this.preY;
			
			return true;
		}
		else
			return false;
	}
	
	protected abstract void move();
	protected abstract char getShape();
	
}
