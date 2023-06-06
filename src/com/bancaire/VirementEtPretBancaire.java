package com.bancaire;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import com.bancaire.ConnectionToDatabase;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JPasswordField;

public class VirementEtPretBancaire extends JFrame {

	private JPanel contentPane;
	private JTextField ChampUtilisateur;
	private JTextField ChampNotification;
	private JPasswordField ChampMotDePasse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		ConnectionToDatabase connection = new ConnectionToDatabase();
		connection.connect();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VirementEtPretBancaire frame = new VirementEtPretBancaire();
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
	public VirementEtPretBancaire() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1114, 698);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UTILISATEUR");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel.setBounds(292, 267, 124, 30);
		contentPane.add(lblNewLabel);
		
		ChampUtilisateur = new JTextField();
		ChampUtilisateur.setBounds(436, 266, 249, 33);
		contentPane.add(ChampUtilisateur);
		ChampUtilisateur.setColumns(10);
		
		JLabel lblMotDePasse = new JLabel("MOT DE PASSE");
		lblMotDePasse.setFont(new Font("Verdana", Font.BOLD, 16));
		lblMotDePasse.setBounds(282, 338, 134, 30);
		contentPane.add(lblMotDePasse);
		
		/*
		 * DEBUT CONDITIONS POUR LOG IN
		*/
		
		JButton BoutonEntrer = new JButton("ENTRER");
		BoutonEntrer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (ChampUtilisateur.getText().equals("Gabriel") && ChampMotDePasse.getText().equals("248651379")) {
					JOptionPane.showMessageDialog(null, "Acces autorisé! BIENVENUE");
				}else if(ChampUtilisateur.getText().equals("") || ChampMotDePasse.getText().equals("")) {
					
					ChampNotification.setText("Veuiller renseigner tous les champs");
				}else ChampNotification.setText("Mot de passe ou Nom d'utilisateur incorrecte");
			}
		});
		BoutonEntrer.setFont(new Font("Century", Font.BOLD, 16));
		BoutonEntrer.setBounds(485, 430, 155, 41);
		contentPane.add(BoutonEntrer);
		
		ChampNotification = new JTextField();
		ChampNotification.setBorder(null);
		ChampNotification.setBackground(new Color(240, 240, 240));
		ChampNotification.setBounds(436, 393, 249, 19);
		contentPane.add(ChampNotification);
		ChampNotification.setColumns(10);
		
		ChampMotDePasse = new JPasswordField();
		
		/*
		 * AJOUT FOCUS SOUS FORME DE POINT
		 */
		ChampMotDePasse.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				ChampMotDePasse.setEchoChar('*');
			}
		});
		
		/*
		 * 
		 * FIN AJOUT FOCUS SOUS FORME DE POINT
		 */
		ChampMotDePasse.setBounds(437, 338, 248, 30);
		contentPane.add(ChampMotDePasse);
	}
}
