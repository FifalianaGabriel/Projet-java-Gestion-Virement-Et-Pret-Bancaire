package com.bancaire;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;


public class InterfacePrincipale extends JFrame {

	private JPanel contentPane;
	
	
	
	/*
	 * Gabriel
	 * AJOUT DES ATTRIBUTS i.e LA CLASSE DE CHAQUE FICHIERS CREES COMME INTERFACECLIENT, INTERFACEVIREMENT, etc
	 */
	
	private InterfaceClient interfaceClient;
	private InterfaceVirement interfaceVirement;
	private InterfacePret interfacePret;
	private InterfaceRendre interfaceRendre;
	
	
	/*
	 * FIN AJOUT DES ATTRIBUTS 
	 */
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfacePrincipale frame = new InterfacePrincipale();
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
	public InterfacePrincipale() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1114, 698);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*
		 * Gabriel
		 * DECLARATION DES OBJETS DE LA CLASSE
		 */
		
		interfaceClient = new InterfaceClient();
		interfaceVirement = new InterfaceVirement();
		interfacePret = new InterfacePret();
		interfaceRendre = new InterfaceRendre();
		
		
		/*
		 * FIN DECLARATION DES OBJETS
		 */
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(192, 192, 192));
		panelMenu.setBounds(10, 10, 277, 641);
		contentPane.add(panelMenu);
		panelMenu.setLayout(null);
		
		
		JPanel panelMenuClient = new JPanel();
		panelMenuClient.setBackground(new Color(128, 128, 128));
		panelMenuClient.setBounds(10, 251, 257, 73);
		panelMenu.add(panelMenuClient);
		panelMenuClient.setLayout(null);
		
		JLabel LabelClient = new JLabel("CLIENT");
		LabelClient.setFont(new Font("Arial", Font.BOLD, 20));
		LabelClient.setBounds(91, 10, 77, 42);
		panelMenuClient.add(LabelClient);
		
		JPanel panelMenuVirement = new JPanel();
		panelMenuVirement.setBackground(new Color(128, 128, 128));
		panelMenuVirement.setLayout(null);
		panelMenuVirement.setBounds(10, 354, 257, 73);
		panelMenu.add(panelMenuVirement);
		
		JLabel LabelVirement = new JLabel("VIREMENT");
		LabelVirement.setFont(new Font("Arial", Font.BOLD, 20));
		LabelVirement.setBounds(71, 10, 114, 42);
		panelMenuVirement.add(LabelVirement);
		
		JPanel panelMenuPret = new JPanel();
		panelMenuPret.setBackground(new Color(128, 128, 128));
		panelMenuPret.setLayout(null);
		panelMenuPret.setBounds(10, 458, 257, 73);
		panelMenu.add(panelMenuPret);
		
		JLabel LabelPret = new JLabel("PRET");
		LabelPret.setFont(new Font("Arial", Font.BOLD, 20));
		LabelPret.setBounds(91, 10, 77, 42);
		panelMenuPret.add(LabelPret);
		
		JPanel panelMenuRendre = new JPanel();
		panelMenuRendre.setBackground(new Color(128, 128, 128));
		panelMenuRendre.setLayout(null);
		panelMenuRendre.setBounds(10, 558, 257, 73);
		panelMenu.add(panelMenuRendre);
		
		JLabel LabelRendre = new JLabel("RENDRE");
		LabelRendre.setFont(new Font("Arial", Font.BOLD, 20));
		LabelRendre.setBounds(78, 10, 108, 42);
		panelMenuRendre.add(LabelRendre);
		
		JPanel panelAffichagePrincipale = new JPanel();
		panelAffichagePrincipale.setBackground(new Color(192, 192, 192));
		panelAffichagePrincipale.setBounds(297, 10, 793, 641);
		contentPane.add(panelAffichagePrincipale);
		
		/*
		 * 
		 * CES DECLARATIONS PERMETTENT D'AJOUTER CES COMPOSANT DANS LE COMPOSANTS panelAffichagePrincipale;
		 */
		panelAffichagePrincipale.add(interfaceClient);
		panelAffichagePrincipale.add(interfaceVirement);
		panelAffichagePrincipale.add(interfacePret);
		panelAffichagePrincipale.add(interfaceRendre);
		
		/*
		 * 
		 * FIN AJOUT DES COMPOSANTS
		 */
		
		menuClique(interfaceClient);
	}
	
	/*
	 * AJOUT DE LA FONCTION menuClique QUI REND LA VISIBILITE DES COMPOSANTS JPANEL FAUSSE
	 */
	public void menuClique(JPanel Interface) {
		interfaceClient.setVisible(false);
		interfaceVirement.setVisible(false);
		interfacePret.setVisible(false);
		interfaceRendre.setVisible(false);
		
		Interface.setVisible(true);
		
	}
	/*
	 * FIN DE LA FONCTION
	 */
	
	
}
