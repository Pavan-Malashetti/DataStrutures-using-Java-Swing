import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField tfsize;
	private JTextField tfele;
	private int q[];
	private int size;
	private int r = -1;
	private int f = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(32, 178, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("QUEUE DATASTRUCTURE");
		heading.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		heading.setForeground(new Color(255, 0, 0));
		heading.setBounds(116, 6, 192, 19);
		contentPane.add(heading);
		
		JLabel lblNewLabel = new JLabel("ENTER QUEUE SIZE:");
		lblNewLabel.setForeground(new Color(65, 105, 225));
		lblNewLabel.setBounds(23, 54, 120, 16);
		contentPane.add(lblNewLabel);
		
		tfsize = new JTextField();
		tfsize.setBounds(172, 49, 130, 26);
		contentPane.add(tfsize);
		tfsize.setColumns(10);
		
		JButton createqueue = new JButton("CREATE QUEUE");
		createqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic for Queue creation
				size = Integer.valueOf(tfsize.getText());
				
				q = new int[size];
				
				String message = "Queue of size "+size+" is created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		createqueue.setForeground(new Color(205, 133, 63));
		createqueue.setBounds(125, 82, 138, 29);
		contentPane.add(createqueue);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT:");
		lblEnterAnElement.setForeground(new Color(0, 0, 0));
		lblEnterAnElement.setBounds(23, 123, 128, 16);
		contentPane.add(lblEnterAnElement);
		
		tfele = new JTextField();
		tfele.setColumns(10);
		tfele.setBounds(172, 118, 130, 26);
		contentPane.add(tfele);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Logic for insertion
				int elem;
				if(r == size-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible");
				}
				else {
					elem = Integer.valueOf(tfele.getText());
					++r;
					q[r] = elem;
					JOptionPane.showMessageDialog(contentPane, "Element "+elem+" is inserted");
					tfele.setText("");
				}
			}
		});
		insert.setForeground(new Color(255, 0, 255));
		insert.setBounds(314, 118, 117, 29);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Logic for deletion
				if(r == -1 || f>r)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Element deleted is: "+q[f]);
					++f;
				}
			}
		});
		delete.setForeground(Color.MAGENTA);
		delete.setBounds(172, 156, 117, 29);
		contentPane.add(delete);
		
		JTextArea tadisp = new JTextArea();
		tadisp.setBackground(new Color(230, 230, 250));
		tadisp.setBounds(57, 223, 358, 26);
		contentPane.add(tadisp);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Display logic
				String msg = "";
				if(r == -1 || f>r)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
					tadisp.setText("");
				}
				else {
					for(int i = f; i<=r; i++)
					{
						msg = msg + q[i]+" ";
					}
					tadisp.setText(msg);
				}
			}
		});
		display.setForeground(Color.MAGENTA);
		display.setBounds(172, 188, 117, 29);
		contentPane.add(display);
		
	}
}
