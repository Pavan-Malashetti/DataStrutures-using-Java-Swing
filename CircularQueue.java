import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField tfsize;
	private JTextField tfele;
	private int cq[];
	private int size;
	private int r = -1;
	private int f = 0;
	private int count = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(50, 205, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("CIRCULAR QUEUE DATASTRUCTURE");
		heading.setForeground(new Color(255, 69, 0));
		heading.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		heading.setBounds(93, 6, 275, 19);
		contentPane.add(heading);
		
		JLabel lblsize = new JLabel("ENTER C-QUEUE SIZE:");
		lblsize.setForeground(new Color(0, 0, 255));
		lblsize.setBounds(37, 49, 137, 16);
		contentPane.add(lblsize);
		
		tfsize = new JTextField();
		tfsize.setBounds(198, 44, 130, 26);
		contentPane.add(tfsize);
		tfsize.setColumns(10);
		
		JButton btncreateCqueue = new JButton("CREATE C-QUEUE");
		btncreateCqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Circular Queue creation logic
				size = Integer.valueOf(tfsize.getText());
				
				cq = new int[size];
				
				String message = "Circular Queue of size "+size+" is created";
				JOptionPane.showMessageDialog(contentPane, message);
				
			}
		});
		btncreateCqueue.setForeground(new Color(160, 82, 45));
		btncreateCqueue.setBounds(141, 77, 155, 29);
		contentPane.add(btncreateCqueue);
		
		JLabel lblele = new JLabel("ENTER AN ELEMENT:");
		lblele.setForeground(Color.BLUE);
		lblele.setBounds(37, 122, 137, 16);
		contentPane.add(lblele);
		
		tfele = new JTextField();
		tfele.setColumns(10);
		tfele.setBounds(179, 117, 130, 26);
		contentPane.add(tfele);
		
		JButton btnNewButton = new JButton("INSERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Insertion logic
				int elem;
				if(count == size) {
					tfele.setText("");//Extra Line added by me
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible");
				}
				else {
					elem = Integer.valueOf(tfele.getText());
					r = (r+1) % size;
					cq[r] = elem;
					++count;
					JOptionPane.showMessageDialog(contentPane, "Element "+elem+" is inserted");
					tfele.setText("");
				}
			}
		});
		btnNewButton.setBounds(321, 117, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Logic for deletion
				if(count == 0) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+cq[f]);
					f = (f+1)%size;
					--count;
				}
			}
		});
		btnDelete.setBounds(179, 143, 117, 29);
		contentPane.add(btnDelete);
		
		JTextArea tadisp = new JTextArea();
		tadisp.setBounds(65, 215, 352, 29);
		contentPane.add(tadisp);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Logic for Display
				int f1 = f;
				String msg = "";
				if(count == 0) {
					tadisp.setText("");//Extra Line added by me
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else {
					for(int i = 1; i<=count; i++) {
						msg = msg + cq[i]+" ";
						f1 = (f1 + 1) % size;
					}
					tadisp.setText(msg);
				}
			}
		});
		btnDisplay.setBounds(179, 179, 117, 29);
		contentPane.add(btnDisplay);
		
	}

}
