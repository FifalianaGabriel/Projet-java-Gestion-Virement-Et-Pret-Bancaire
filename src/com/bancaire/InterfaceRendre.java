package com.bancaire;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class InterfaceRendre extends JPanel {

	/**
	 * Create the panel.
	 */
	public InterfaceRendre() {
		setBounds(297, 10, 793, 641);
		setLayout(null);
		
		JLabel lblInterfaceRendre = new JLabel("INTERFACE RENDRE");
		lblInterfaceRendre.setFont(new Font("Rockwell", Font.BOLD, 29));
		lblInterfaceRendre.setBounds(194, 254, 358, 77);
		add(lblInterfaceRendre);
	}

}
