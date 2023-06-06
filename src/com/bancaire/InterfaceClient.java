package com.bancaire;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class InterfaceClient extends JPanel {

	/**
	 * Create the panel.
	 */
	public InterfaceClient() {
		
		setBounds(297, 10, 793, 641);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INTERFACE CLIENT");
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 29));
		lblNewLabel.setBounds(218, 253, 316, 77);
		add(lblNewLabel);
		

	}

}
