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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField insertrear;
	private JTextField insertfront;
	private JTextField result;
	
	class Node
	{
		Node prelink;
		int data;
		Node nextlink;
	}
	
	Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 17));
		lblNewLabel.setBounds(155, 10, 330, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(64, 79, 173, 38);
		contentPane.add(lblNewLabel_1);
		
		insertrear = new JTextField();
		insertrear.setBounds(288, 87, 96, 21);
		contentPane.add(insertrear);
		insertrear.setColumns(10);
		
		JButton insertrearbtn = new JButton("INSERT REAR");
		insertrearbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertRear
				Node temp;
				int ele=Integer.valueOf(insertrear.getText());
				Node newnode=new Node();
				newnode.prelink=null;
				newnode.data=ele;
				newnode.nextlink=null;
				
				if(first==null)
				{
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Element "+ele+" Inserted at RearEnd");
					insertrear.setText("");
				}
				else
				{
					temp=first;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					temp.nextlink=newnode;
					newnode.prelink=temp;
					JOptionPane.showMessageDialog(contentPane, "Element "+ele+" inserted at RearEnd");
					insertrear.setText("");
				}
				
				 
				
				
			}
		});
		insertrearbtn.setFont(new Font("Constantia", Font.BOLD, 16));
		insertrearbtn.setBounds(424, 79, 162, 38);
		contentPane.add(insertrearbtn);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(64, 148, 173, 38);
		contentPane.add(lblNewLabel_1_1);
		
		insertfront = new JTextField();
		insertfront.setColumns(10);
		insertfront.setBounds(288, 156, 96, 21);
		contentPane.add(insertfront);
		
		JButton insertfrontbtn = new JButton("INSERT FRONT");
		insertfrontbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertFront
				int ele=Integer.valueOf(insertfront.getText());
				Node newnode=new Node();
				newnode.data=ele;
				newnode.prelink=null;
				newnode.nextlink=null;
				
				if(first==null)
				{
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Element "+ele+" inserted at frontend");
					insertfront.setText("");
				}
				else
				{
					newnode.nextlink=first;
					first.prelink=newnode;
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Element "+ele+" inserted at frontend");
					insertfront.setText("");
					
				}
			}
		});
		insertfrontbtn.setFont(new Font("Constantia", Font.BOLD, 16));
		insertfrontbtn.setBounds(424, 148, 161, 38);
		contentPane.add(insertfrontbtn);
		
		JButton deleterearbtn = new JButton("DELETE REAR");
		deleterearbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deleteRear
				
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion is not Possible");
				}
				else if(first.nextlink==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is"+first.data);
					first=null;
					
				}
				else
				{
					Node temp;
					temp=first;
					while(temp.nextlink.nextlink!=null)
					{
						temp=temp.nextlink;
						
					}
					JOptionPane.showMessageDialog(contentPane, "Element deleted is"+temp.nextlink.data);
					temp.nextlink=null;
				}
				
			}
		});
		deleterearbtn.setFont(new Font("Constantia", Font.BOLD, 16));
		deleterearbtn.setBounds(261, 213, 153, 38);
		contentPane.add(deleterearbtn);
		
		JButton deletefrontbtn = new JButton("DELETE FRONT");
		deletefrontbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deleteFront
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion is not Possible");
				}
				else if(first.nextlink==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element Deleted is "+first.data);
					first=null;
					
					
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Element Deleted is "+first.data);
					first=first.nextlink;
					first.prelink=null;
					
				}
				
			}
		});
		deletefrontbtn.setFont(new Font("Constantia", Font.BOLD, 16));
		deletefrontbtn.setBounds(261, 280, 164, 38);
		contentPane.add(deletefrontbtn);
		
		JButton displayforwardbtn = new JButton("DISPLAY FORWARD");
		displayforwardbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for displayForward
				String messsage="";
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display is not Possible");
				}
				else if(first.nextlink==null)
				{
					
					messsage=messsage+first.data;
					result.setText(messsage);
					
				}
				else
				{
					String res="";
					Node temp;
					temp=first;
					while(temp!=null)
					{
						res=res+" "+temp.data;
						temp=temp.nextlink;
					}
					result.setText(res);
				}
				
			}
		});
		displayforwardbtn.setFont(new Font("Constantia", Font.BOLD, 16));
		displayforwardbtn.setBounds(125, 337, 201, 31);
		contentPane.add(displayforwardbtn);
		
		JButton displaybackwordbtn = new JButton("DISPLAY BACKWORD");
		displaybackwordbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for displayBackword
				String messsage="";
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display is not Possible");
				}
				else if(first.nextlink==null)
				{
					messsage=messsage+first.data;
					result.setText(messsage);
				}
				else
				{
					String res="";
					Node temp;
					temp=first;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
						
						
					}
					while(temp!=null)
					{
						res=res+" "+temp.data;
						temp=temp.prelink;
					}
					result.setText(res);
				}
				
			}
		});
		displaybackwordbtn.setFont(new Font("Constantia", Font.BOLD, 16));
		displaybackwordbtn.setBounds(377, 339, 208, 38);
		contentPane.add(displaybackwordbtn);
		
		result = new JTextField();
		result.setBounds(155, 385, 397, 29);
		contentPane.add(result);
		result.setColumns(10);
	}

}

























/*import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 *
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 *
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
*/
