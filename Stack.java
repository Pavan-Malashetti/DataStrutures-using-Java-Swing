import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField tfsize;
	private JTextField tfele;
	private int s[];
	private int size;
	private int top = -1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("STACK DATASTRUCTURE");
		heading.setForeground(new Color(255, 0, 0));
		heading.setBounds(143, 6, 154, 16);
		contentPane.add(heading);
		
		JLabel lblsize = new JLabel("ENTER THE STACK SIZE :");
		lblsize.setBounds(39, 51, 152, 16);
		contentPane.add(lblsize);
		
		tfsize = new JTextField();
		tfsize.setBounds(202, 46, 130, 26);
		contentPane.add(tfsize);
		tfsize.setColumns(10);
		
		JButton createstack = new JButton("CREATE STACK");
		createstack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Stack creation code
				size = Integer.valueOf(tfsize.getText());
				s = new int[size];
				
				String message = "Stack of size "+ size +" is created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		createstack.setForeground(new Color(0, 0, 255));
		createstack.setBounds(143, 84, 117, 29);
		contentPane.add(createstack);
		
		JLabel lblele = new JLabel("ENTER AN ELEMENT:");
		lblele.setBounds(39, 125, 128, 16);
		contentPane.add(lblele);
		
		tfele = new JTextField();
		tfele.setColumns(10);
		tfele.setBounds(179, 120, 130, 26);
		contentPane.add(tfele);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Push Code
				int elem;
				if(top == size-1)
				{
					JOptionPane.showMessageDialog(contentPane,"Push is not possible");
				}
				else
				{
					elem = Integer.valueOf(tfele.getText());
					s[++top] = elem;
					String message = "Push successful";
					JOptionPane.showMessageDialog(contentPane,message);
					tfele.setText("");
				}
			}
		});
		push.setForeground(new Color(30, 144, 255));
		push.setBounds(312, 120, 117, 29);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Pop code
				if(top == -1)
				{
					JOptionPane.showMessageDialog(contentPane, "Pop is not possible");
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is: "+s[top]);
					--top;
				}
			}
		});
		pop.setForeground(new Color(30, 144, 255));
		pop.setBounds(175, 153, 117, 29);
		contentPane.add(pop);
		
		JTextArea tadis = new JTextArea();
		tadis.setBackground(new Color(175, 238, 238));
		tadis.setForeground(Color.WHITE);
		tadis.setBounds(77, 219, 316, 26);
		contentPane.add(tadis);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Display code
				String msg = "";
				if(top == -1)
				{
					tadis.setText("");// Extra line added by me.
					JOptionPane.showMessageDialog(contentPane, "Display is not possible");
				}
				else {
					for(int i = top ; i>=0; i--)
					{
						msg = msg + s[i] +" ";
					}
					tadis.setText(msg);
					
				}
			}
		});
		display.setForeground(new Color(153, 50, 204));
		display.setBounds(175, 186, 117, 29);
		contentPane.add(display);
	}
}
