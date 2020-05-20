package com.iti.budgetFamilial.ihm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class IhmLogin {

	private JFrame frmGestionDeBudget;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				/**
				 *Set Nimbus as Default Feel n Look  
				 */
				try {
				    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				        if ("Nimbus".equals(info.getName())) {
				            UIManager.setLookAndFeel(info.getClassName());
				            break;
				        }
				    }
				}
				
				catch (Exception e) {
				    // If Nimbus is not available, you can set the GUI to another look and feel.
				}
				
				try {
					IhmLogin window = new IhmLogin();
					window.frmGestionDeBudget.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IhmLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGestionDeBudget = new JFrame();
		frmGestionDeBudget.setTitle("Gestion de budget familial");
		frmGestionDeBudget.setBounds(100, 100, 490, 349);
		frmGestionDeBudget.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBackground(Color.BLUE);
		frmGestionDeBudget.getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		JLabel lblIdentifiant = new JLabel("Identifiant ");
		lblIdentifiant.setBounds(51, 128, 72, 16);
		layeredPane.add(lblIdentifiant);
		
		JLabel lblMotDePass = new JLabel("Mot de passe");
		lblMotDePass.setBounds(212, 128, 82, 16);
		layeredPane.add(lblMotDePass);
		
		//Box de saisie mot de passe
		textField = new JTextField();
		textField.setBounds(190, 147, 122, 28);
		layeredPane.add(textField);
		textField.setColumns(10);
		
		//Boutton Quitter 
		JButton btnOk = new JButton("Quitter");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmGestionDeBudget.setVisible(false);				
			}
		});
		btnOk.setBounds(179, 264, 109, 28);
		layeredPane.add(btnOk);
		
		//Boutton connexion
		JButton btnConnexion = new JButton("Connexion");
		btnConnexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().isEmpty()==false){
					IhmMAIN window = new IhmMAIN();
					window.frame.setVisible(true);
				}
				else{
					//Boîte du message d'information
					JOptionPane jop1 = new JOptionPane();
					jop1.showMessageDialog(null, "Veuillez rentrer le mot de passe", "### ERRROR ###", JOptionPane.INFORMATION_MESSAGE);
				
				}
			}
		});
		btnConnexion.setBounds(343, 147, 109, 28);
		layeredPane.add(btnConnexion);
		
		JList list = new JList();
		list.setBounds(325, 127, -77, 17);
		layeredPane.add(list);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Pere ", "Mere"}));
		comboBox.setBounds(35, 148, 122, 26);
		layeredPane.add(comboBox);
		
		JLabel lblBudgetFamilial = new JLabel("SE CONNECTER ...");
		lblBudgetFamilial.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		lblBudgetFamilial.setForeground(new Color(100, 149, 237));
		lblBudgetFamilial.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBudgetFamilial.setBounds(141, 67, 268, 41);
		layeredPane.add(lblBudgetFamilial);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Se souvenir de moi");
		chckbxNewCheckBox.setBounds(38, 207, 138, 18);
		layeredPane.add(chckbxNewCheckBox);
		
		
	}
}
