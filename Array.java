import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField tflen;
	private JTextField tfele;
	private JTextField tfpos;
	private JTextField tfdelpos;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("ARRAY DATA STRUCTURE");
		heading.setForeground(new Color(147, 112, 219));
		heading.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		heading.setBounds(135, 6, 197, 19);
		contentPane.add(heading);
		
		JLabel arrlen = new JLabel("ENTER ARRAY LENGTH : ");
		arrlen.setForeground(new Color(255, 0, 0));
		arrlen.setBounds(44, 47, 153, 16);
		contentPane.add(arrlen);
		
		tflen = new JTextField();
		tflen.setBounds(209, 42, 130, 26);
		contentPane.add(tflen);
		tflen.setColumns(10);
		
		JButton createarray = new JButton("CREATE ARRAY");
		createarray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Code for creating array.
				
				/* 2 line in 1 line.
				String len = tflen.getText();
				int l = Integer.valueOf(len);
				*/
				
				int len = Integer.valueOf(tflen.getText());//1st get the data from tflen & convert it into integer.
				
				//creating array
				arr = new int[len];
				
				String message = "Array of length "+len+" created.";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		createarray.setBackground(new Color(34, 139, 34));
		createarray.setForeground(new Color(255, 140, 0));
		createarray.setBounds(159, 75, 138, 29);
		contentPane.add(createarray);
		
		JLabel element = new JLabel("ENTER AN INTEGER ELEMENT");
		element.setForeground(Color.RED);
		element.setBounds(6, 117, 181, 16);
		contentPane.add(element);
		
		tfele = new JTextField();
		tfele.setColumns(10);
		tfele.setBounds(191, 112, 50, 26);
		contentPane.add(tfele);
		
		JLabel pos = new JLabel("POSITION");
		pos.setForeground(Color.RED);
		pos.setBounds(247, 116, 60, 16);
		contentPane.add(pos);
		
		tfpos = new JTextField();
		tfpos.setColumns(10);
		tfpos.setBounds(309, 112, 50, 26);
		contentPane.add(tfpos);
		
		JButton btninsert = new JButton("INSERT");
		btninsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Code for insertion.
				int element = Integer.valueOf(tfele.getText());
				int position = Integer.valueOf(tfpos.getText());
				//Now we have element & position which user entered in JFrame.
				
				arr[position] = element;
				
				String message = "Element "+element+" inserted at position "+position;
				JOptionPane.showMessageDialog(contentPane, message);
				tfele.setText("");//Set Nothing to that textField.
				tfpos.setText("");
			}
		});
		btninsert.setForeground(new Color(30, 144, 255));
		btninsert.setBackground(new Color(34, 139, 34));
		btninsert.setBounds(359, 111, 88, 29);
		contentPane.add(btninsert);
		
		JLabel delpos = new JLabel("ENTER THE POSITION TO DELETE THE ELEMENT");
		delpos.setForeground(Color.RED);
		delpos.setBounds(6, 160, 295, 16);
		contentPane.add(delpos);
		
		tfdelpos = new JTextField();
		tfdelpos.setColumns(10);
		tfdelpos.setBounds(309, 155, 50, 26);
		contentPane.add(tfdelpos);
		
		JButton btndelete = new JButton("DELETE");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code for deletion.
				int del = Integer.valueOf(tfdelpos.getText());
				arr[del]=0;
				String message = "Element deleted at the position "+del;
				JOptionPane.showMessageDialog(contentPane, message);
				tfdelpos.setText("");//Set text to nothing of deleteposition Textbox.
			}
		});
		btndelete.setForeground(new Color(30, 144, 255));
		btndelete.setBackground(new Color(34, 139, 34));
		btndelete.setBounds(359, 155, 88, 29);
		contentPane.add(btndelete);
		
		//First this should come, after that logic for Display.
		JTextArea dp = new JTextArea(); 
		dp.setBackground(new Color(255, 245, 238));
		dp.setBounds(44, 229, 355, 26);
		contentPane.add(dp);
		
		JButton btndisplay = new JButton("DISPLAY");
		btndisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code for display.
				String msg ="";
				for(int i = 0; i<=arr.length-1; i++) {
					msg = msg+arr[i]+" ";
				}
				dp.setText(msg);
			}
		});
		btndisplay.setForeground(new Color(30, 144, 255));
		btndisplay.setBackground(new Color(34, 139, 34));
		btndisplay.setBounds(171, 197, 88, 29);
		contentPane.add(btndisplay);
	}
}
