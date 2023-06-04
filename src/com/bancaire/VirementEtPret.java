package com.bancaire;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JButton;
import com.bancaire.ConnectionToDatabase;

public class VirementEtPret {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VirementEtPret window = new VirementEtPret();
					window.frame.setVisible(true);
					ConnectionToDatabase connection = new ConnectionToDatabase();
					connection.connect();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VirementEtPret() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 896, 718);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
