import java.awt.*;
import javax.swing.*;


public class Practice04 extends JFrame {
	Color [] color = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN,
			Color.BLUE, Color.MAGENTA, Color.PINK, Color.WHITE, Color.GRAY };
	
	Practice04(){
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.setLayout(new GridLayout());
		
		JButton[] bt = new JButton[10];
		for(int i = 0; i < 10; i++) {
			bt[i] = new JButton(Integer.toString(i));
			bt[i].setBackground(color[i]);
			bt[i].setOpaque(true);						// opaque: 불투명한 안료. 필름에서, 화상의 일부나 필요한 부분에 칠하여 빛의 투과를 막음.
			
			c.add(bt[i]);
		}
		
		/*
		for(int i = 0; i < 10; i++) {
			String l = Integer.valueOf(i).toString();
			JLabel label = new JLabel(l);
			label.setBackground(color[i]);
			label.setOpaque(true);
			c.add(label);
		}
		*/
		
		setSize(1000, 500);
		setVisible(true);
	
	
	}
	
	public static void main(String[] args) {
		Practice04 frame = new Practice04();
		
	}

}
