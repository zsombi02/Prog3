package guialapok;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

public class GUI implements ActionListener {
	
	int count = 0;
	JLabel label;
	public GUI()
	{
		
		JFrame frame  = new JFrame();
		
		JButton button = new JButton("xddddd");
		button.addActionListener(this);
		
		 label = new JLabel("Kattintasok szama: 0");
		
		
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button); 
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("OUR GUI");
		frame.pack();
		frame.setVisible(true);		
	}
	
	public static void main(String[] args) {
		new GUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count++;
		label.setText("kattintasok szama: " + count );
	}
	
}
