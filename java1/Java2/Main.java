//MAIN CLASS
import javax.swing.JFrame;

public class Main {
	public static void main(String args[]){
		JFrame frame = new JFrame("My GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Display());
		frame.pack();
		frame.setVisible(true);
	}
}


//DISPLAY CLASS
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Display extends JPanel{
	private JButton print;
	private JLabel label;
	
	public Display(){
		print = new JButton("Print");
		label = new JLabel("Hit this button to print to the console");
		
		setPreferredSize(new Dimension(245, 136));
		setLayout(null);
		
		add(print);
		add(label);
		
		print.setBounds(70, 10, 100, 25);
		label.setBounds(20, 45, 210, 35);
	}
}
