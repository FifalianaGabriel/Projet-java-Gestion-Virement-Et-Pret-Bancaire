package com.bancaire;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class InterfaceVirement extends JPanel {

	/**
	 * Create the panel.
	 */
	public InterfaceVirement() {
		setBounds(297, 10, 793, 641);
		setLayout(null);
		
		JLabel lblInterfaceVirement = new JLabel("INTERFACE VIREMENT");
		lblInterfaceVirement.setFont(new Font("Rockwell", Font.BOLD, 29));
		lblInterfaceVirement.setBounds(187, 244, 358, 77);
		add(lblInterfaceVirement);
	}

}
