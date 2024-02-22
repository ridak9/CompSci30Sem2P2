package ClassDemos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class ClassDemo {

	private JFrame frame;
	private JTextField Fn;
	private JTextField Ln;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClassDemo window = new ClassDemo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ClassDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 568, 439);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 554, 373);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Fn = new JTextField();
		Fn.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				
				Fn.setText("");
				
				
			}
		});
		Fn.setForeground(Color.DARK_GRAY);
		Fn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Fn.setText("First Name");
		Fn.setBounds(29, 48, 159, 34);
		panel.add(Fn);
		Fn.setColumns(10);
		
		Ln = new JTextField();
		Ln.setForeground(Color.DARK_GRAY);
		Ln.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Ln.setText("Last Name");
		Ln.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				Ln.setText("");
				
			}
		});
		Ln.setColumns(10);
		Ln.setBounds(240, 48, 159, 34);
		panel.add(Ln);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.RED);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Grade:", "10", "11", "12"}));
		comboBox.setBounds(32, 120, 156, 39);
		panel.add(comboBox);
		
		
		JLabel disp = new JLabel("");
		disp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		disp.setBounds(28, 269, 474, 94);
		panel.add(disp);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String grade = " ";
				String school = " ";
				
				String firstN = Fn.getText();
				String lastN = Ln.getText();
				
				if(comboBox.getSelectedItem().equals("10"))
				{
					grade = "10";
				}
				if(comboBox.getSelectedItem().equals("11"))
				{
					grade = "11";
				}
				else
				{
					grade = "12";
				}
				
				disp.setText(firstN + " " +
							   lastN + " is in grade: "+
								 grade
								);
				
				
				
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(409, 34, 123, 200);
		panel.add(btnNewButton);
		
		
	}
}
