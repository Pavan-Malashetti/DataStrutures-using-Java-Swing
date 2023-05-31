import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("CHOOSE A DATASTRUCTURE");
		heading.setForeground(Color.BLUE);
		heading.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		heading.setBounds(108, 16, 221, 19);
		contentPane.add(heading);
		
		JButton array = new JButton("ARRAY");
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE ARRAY WINDOW OPENING CODE HERE
//				Array a = new Array();
//				a.setVisible(true);
				
				//Anonymous Object
				new Array().setVisible(true);
			}
		});
		array.setForeground(Color.RED);
		array.setBounds(155, 47, 117, 29);
		contentPane.add(array);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE STACK WINDOW OPENING CODE HERE
				new Stack().setVisible(true);//Anonymous object
			}
		});
		stack.setForeground(Color.MAGENTA);
		stack.setBounds(52, 94, 117, 29);
		contentPane.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE QUEUE WINDOW OPENING CODE HERE
				new Queue().setVisible(true);//Anonymous object
			}
		});
		queue.setForeground(Color.MAGENTA);
		queue.setBounds(266, 94, 117, 29);
		contentPane.add(queue);
		
		JButton cqueue = new JButton("CIRCULAR QUEUE");
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE CIRCULAR QUEUE WINDOW OPENING CODE HERE
				new CircularQueue().setVisible(true);//Anonymous object
			}
		});
		cqueue.setForeground(Color.BLUE);
		cqueue.setBounds(52, 161, 153, 29);
		contentPane.add(cqueue);
		
		JButton sll = new JButton("SINGLY LINKED LIST");
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE SINGLY LINKED LIST WINDOW OPENING CODE HERE
				new SinglyLinkedList().setVisible(true);//Anonymous object
			}
		});
		sll.setForeground(Color.BLUE);
		sll.setBounds(230, 161, 153, 29);
		contentPane.add(sll);
		
		JButton dll = new JButton("DOUBLY LINKED LIST");
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE DOUBLY LINKED LIST WINDOW OPENING CODE HERE
				new DoublyLinkedList().setVisible(true);//Anonymous object
			}
		});
		dll.setForeground(Color.CYAN);
		dll.setBounds(127, 218, 175, 29);
		contentPane.add(dll);
	}
}
