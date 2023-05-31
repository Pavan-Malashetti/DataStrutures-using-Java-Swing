import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.lang.model.element.Element;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField elementrear;
	private JTextField insertfront;
	private JTextField result;
	
	class Node{
		int data;
		Node link;
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 18));
		lblNewLabel.setBounds(140, 10, 348, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(61, 79, 173, 33);
		contentPane.add(lblNewLabel_1);
		
		elementrear = new JTextField();
		elementrear.setBounds(281, 84, 96, 19);
		contentPane.add(elementrear);
		elementrear.setColumns(10);
		
		JButton insertrearbtn = new JButton("INSERT REAR");
		insertrearbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertRear
				int ele=Integer.valueOf(elementrear.getText());
				
					Node newnode=new Node();
					newnode.data=ele;
					newnode.link=null;
					
				
				if(first==null)
				{
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Element inserted at RearEnd");
					elementrear.setText("");
				}
				else
				{
					Node temp;
					temp=first;
					while(temp.link!=null)
					{
						temp=temp.link;
					}
					temp.link=newnode;
					JOptionPane.showMessageDialog(contentPane, "Element inserted at RearEnd");
					elementrear.setText("");
				}
				
			}
		});
		insertrearbtn.setFont(new Font("Constantia", Font.BOLD, 16));
		insertrearbtn.setBounds(423, 83, 155, 33);
		contentPane.add(insertrearbtn);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(61, 151, 173, 33);
		contentPane.add(lblNewLabel_1_1);
		
		insertfront = new JTextField();
		insertfront.setColumns(10);
		insertfront.setBounds(281, 156, 96, 19);
		contentPane.add(insertfront);
		
		JButton insertfrontbtn = new JButton("INSERT FRONT");
		insertfrontbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertFront
				int ele=Integer.valueOf(insertfront.getText());
				Node newnode=new Node();
				newnode.data=ele;
				newnode.link=null;
				
				if(first==null)
				{
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Element inserted at FrontEnd");
					insertfront.setText("");
				}
				else
				{
					newnode.link=first;
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Element inserted at FrontEnd");
					insertfront.setText("");
				}
			}
		});
		insertfrontbtn.setFont(new Font("Constantia", Font.BOLD, 16));
		insertfrontbtn.setBounds(423, 155, 155, 33);
		contentPane.add(insertfrontbtn);
		
		JButton deleterear = new JButton("DELETTE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deleteRear
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				
				else if(first.link==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first=null;
				}
				else
				{
					temp=first;
					while(temp.link.link!=null)
					{
						temp=temp.link;
					}
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+temp.link.data);
					temp.link=null;
				}
			}
		});
		deleterear.setFont(new Font("Constantia", Font.BOLD, 16));
		deleterear.setBounds(248, 226, 173, 33);
		contentPane.add(deleterear);
		
		JButton deletefront = new JButton("DELETTE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deleteFront
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.link==null)
				{
					first=null;
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first=first.link;
					
				}
			}
		});
		deletefront.setFont(new Font("Constantia", Font.BOLD, 16));
		deletefront.setBounds(248, 288, 173, 29);
		contentPane.add(deletefront);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String message="";
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else if(first.link==null)
				{
					message=message+first.data;
					result.setText(message);
				}
				else
				{
					String res="";
					Node temp;
					temp=first;
					while(temp!=null)
					{
						res=res+" "+temp.data;
						temp=temp.link;
					}
					result.setText(res);
				}
				
			}
		});
		btnDisplay.setFont(new Font("Constantia", Font.BOLD, 16));
		btnDisplay.setBounds(248, 348, 173, 29);
		contentPane.add(btnDisplay);
		
		result = new JTextField();
		result.setBounds(140, 400, 366, 29);
		contentPane.add(result);
		result.setColumns(10);
	}
}






















/*
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import SinglyLinkedList.Node;

//import SinglyLinkedList.Node;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField tfele1;
	private JTextField tfele2;
	class Node
	{
		int data;
		Node link;
	}
	private Node first;

//	
//	  Launch the application.
//	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	  Create the frame.
	 
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("SINGLY LINKED LIST DATASTRUCTURE");
		heading.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		heading.setForeground(new Color(255, 0, 0));
		heading.setBounds(76, 6, 297, 19);
		contentPane.add(heading);
		
		JLabel lblNewLabel = new JLabel("ENTER AN ELEMENT:");
		lblNewLabel.setForeground(new Color(255, 0, 255));
		lblNewLabel.setBounds(30, 47, 128, 16);
		contentPane.add(lblNewLabel);
		
		tfele1 = new JTextField();
		tfele1.setBounds(172, 42, 130, 26);
		contentPane.add(tfele1);
		tfele1.setColumns(10);
		
		JButton btnNewButton = new JButton("INSERT REAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//InsertRear Logic
				Node temp;
				
				int elem = Integer.valueOf(tfele1.getText());
				
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link = null;
				
				if(first == null)
				{
					first = newnode;
				}
				else
				{
					temp = first;
					while(temp.link != null)
					{
						temp = temp.link;
					}
					temp.link = newnode;
					JOptionPane.showMessageDialog(contentPane, "Element "+elem+" is inserted at rear");
				}
				
			}
		});
		btnNewButton.setBounds(314, 42, 117, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER AN ELEMENT:");
		lblNewLabel_1.setForeground(Color.MAGENTA);
		lblNewLabel_1.setBounds(30, 87, 128, 16);
		contentPane.add(lblNewLabel_1);
		
		tfele2 = new JTextField();
		tfele2.setColumns(10);
		tfele2.setBounds(172, 80, 130, 26);
		contentPane.add(tfele2);
		
		JButton btnInsertFront = new JButton("INSERT FRONT");
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Logic for insert front
				int elem = Integer.valueOf(tfele2.getText());
				
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link = null;
				
				if(first == null)
				{
					first = newnode;
				}
				else
				{
					newnode.link = first;
					first = newnode;
					JOptionPane.showMessageDialog(contentPane, "Element "+elem+" inserted at front");
				}
			}
		});
		btnInsertFront.setBounds(314, 80, 117, 29);
		contentPane.add(btnInsertFront);
		
		JButton btnNewButton_1 = new JButton("DELETE REAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Logic for deleteRear
				Node temp;
				
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				if(first.link == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first = null;
				}
				else
				{
					temp = first;
					while(temp.link.link != null)
					{
						temp = temp.link;
					}
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+temp.link.data);
					temp.link = null;
				}
				
			}
		});
		btnNewButton_1.setBounds(182, 113, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("DELETE FRONT");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Logic for deleteFront
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.link == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first = null;
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first = first.link;
				}
			}
		});
		btnNewButton_1_1.setBounds(185, 146, 117, 29);
		contentPane.add(btnNewButton_1_1);

		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(175, 238, 238));
		textArea.setBounds(43, 225, 361, 26);
		contentPane.add(textArea);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else if(first.link == null)
				{
					JOptionPane.showMessageDialog(contentPane, first.data);
				}
				else
				{
					String msg = "";
					temp = first;
					while(temp != null)
					{
						msg = msg + temp.data+" ";
						temp = temp.link;
					}
					textArea.setText(msg);
				}
			}
		});
		btnDisplay.setBounds(160, 184, 117, 29);
		contentPane.add(btnDisplay);
		
	}
}
*/