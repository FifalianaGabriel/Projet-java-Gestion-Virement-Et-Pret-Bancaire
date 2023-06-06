package com.bancaire;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class InterfacePret extends JPanel {

	/**
	 * Create the panel.
	 */
	public InterfacePret() {
		setBounds(297, 10, 793, 641);
		setLayout(null);
		
		JLabel lblInterfacePret = new JLabel("INTERFACE PRET");
		lblInterfacePret.setFont(new Font("Rockwell", Font.BOLD, 29));
		lblInterfacePret.setBounds(203, 252, 358, 77);
		add(lblInterfacePret);
	}

}
