import java.awt.*;
import javax.swing.*;

public class Practice07 extends JFrame {
	Practice07() {
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		c.add(new SouthPanel(), BorderLayout.SOUTH);
		
		setSize(300, 250);
		setVisible(true);
	}
	
	private class NorthPanel extends JPanel{
		NorthPanel(){
			setBackground(Color.GRAY);
			setOpaque(true);
			setLayout(new FlowLayout(FlowLayout.LEFT));
			add(new JLabel("수식입력"));
			add(new JTextField(16));
		}
	}
	
	private class CenterPanel extends JPanel{
		CenterPanel(){
			setLayout(new GridLayout(4, 4));
			for (int i = 0; i < 10; i++) {
				add(new JButton(Integer.toString(i)));
			}
			add(new JButton("CE"));
			add(new JButton("계산"));
			
			JButton[] operator = { new JButton("+"), new JButton("-"), new JButton("X"), new JButton("/")};
			
			for(int i = 0; i < 4; i++) {
				operator[i].setBackground(Color.CYAN);
				operator[i].setOpaque(true);
				add(operator[i]);
			}
		}
	}
	
	private class SouthPanel extends JPanel{
		SouthPanel(){
			setBackground(Color.YELLOW);
			setOpaque(true);
			setLayout(new FlowLayout(FlowLayout.LEFT));
			add(new JLabel("계산 결과"));
			add(new JTextField(16));
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Practice07 Cal = new Practice07();
	}

}
