import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlyingTextEx extends JFrame {
	private JPanel contentPane = new JPanel();
	private JLabel la = new JLabel("HELLO");
	private JTextField txt = new JTextField();
	
	public FlyingTextEx() {
		super("상, 하, 좌, 우 키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new MyKeyListener());
		
		txt.setLocation(50, 20);
		txt.setSize(100, 20);
		c.add(txt);
		txt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent action) {
				String text = txt.getText();
				la.setText(text);
				txt.setText("");
				c.requestFocus();
			}
		} );
		
		la.setLocation(50, 50);
		la.setSize(100, 20);
		c.add(la);
		
		setSize(200, 200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		
	}
	
	public class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			switch(keyCode) {
				case KeyEvent.VK_UP:
					la.setLocation(la.getX(), la.getY()-10);
					break;
				case KeyEvent.VK_DOWN:
					la.setLocation(la.getX(), la.getY()+10);
					break;
				case KeyEvent.VK_LEFT:
					la.setLocation(la.getX()-10, la.getY());
					break;
				case KeyEvent.VK_RIGHT:
					la.setLocation(la.getX()+10, la.getY());
					break;
					
			}
		}
		
		
	}

	
	
	public static void main(String [] args) {
		new FlyingTextEx();
	}

}
