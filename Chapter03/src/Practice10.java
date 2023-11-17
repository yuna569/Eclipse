
public class Practice10 {

	public static void main(String[] args) {
		int [][] array = new int [4][4];
		
		for (int i = 0 ; i < 10 ; i++) {
			int x = (int)(Math.random()*10+1);
			
			int a = (int)(Math.random()*4);
			int b = (int)(Math.random()*4);
			
			if (array[a][b] != 0) {
				i--;
			}
			else
				array[a][b] = x;
		}
		
		for (int i = 0 ; i < array.length ; i++) {
			for (int j = 0 ; j < array[0].length ; j++) {/
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
