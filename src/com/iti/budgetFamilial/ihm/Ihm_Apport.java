package com.iti.budgetFamilial.ihm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

//Importation de toutes les classes METIERS

import com.iti.budgetFamilial.classesMetier.Rentree;
import com.iti.budgetFamilial.classesMetier.Origine;
import com.iti.budgetFamilial.classesMetier.Depense;

public class Ihm_Apport extends JFrame {

	private JPanel     contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	

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
					Ihm_Apport frame = new Ihm_Apport();
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
	public Ihm_Apport() {
		setTitle("----Apport----");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 565, 285);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, "name_1+511192819805");
		
		
		//LISTE RENTREE==APPORT

		
		JLabel label = new JLabel("Liste d'apport");
		label.setBounds(409, 13, 91, 16);
		layeredPane.add(label);
		
				JComboBox comboBox = new JComboBox();
				comboBox.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						//System.out.println(comboBox.getSelectedItem() ); // SETTER DANS LE TABLEAU LISTE ORIGINE! !!!!! 
					}
				});
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"Loyer", "Salaire", "Gain de jeu", "H\u00E9ritage"}));
				comboBox.setBounds(395, 41, 126, 27);
				layeredPane.add(comboBox);
				
		//BOUTTON OK	
		JButton button = new JButton("OK");
		button.addActionListener(new ActionListener(){
			
									public void actionPerformed(ActionEvent arg0) {
										if((textField_1.getText().isEmpty()==false)&&(textField.getText().isEmpty()==true)){
											
											
											Origine origine1 = new Origine((String)comboBox.getSelectedItem());
											
											String d=textField_1.getText();
											float i=Float.valueOf(d);
											Rentree apport   = new Rentree(i); //(float)(String)textField_1.getText()
					
											System.out.println(origine1);
											System.out.println(apport);
											
										}
										else if((textField_1.getText().isEmpty()==false)&&(textField.getText().isEmpty()==false)){
											
											Origine origine1 = new Origine(textField.getText());
											
											String d=textField_1.getText();
											float i=Float.valueOf(d);
											Rentree apport   = new Rentree(i); //(float)(String)textField_1.getText()
					
											System.out.println(origine1);
											System.out.println(apport);
											
										}
										else{// message d'erreur si le montant n'est pas rempli
											if(textField_1.getText().isEmpty()==true) { // message 
												JOptionPane jop3 = new JOptionPane();
												jop3.showMessageDialog(null, " Remplir le montant !", "Erreur", JOptionPane.ERROR_MESSAGE);
											}
										}
										
									}
								});
		
		
		button.setForeground(Color.GREEN);
		button.setBounds(109, 165, 116, 49);
		layeredPane.add(button);
		
		JButton button_1 = new JButton("ANNULER");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setForeground(Color.RED);
		button_1.setBounds(267, 165, 111, 49);
		layeredPane.add(button_1);
		
		JLabel lblApport = new JLabel("Personne");
		lblApport.setBounds(281, 12, 91, 16);
		layeredPane.add(lblApport);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"P\u00E8re", "M\u00E8re", "Enfant_1", "Enfant_2", "Enfant_3"}));
		comboBox_1.setBounds(252, 41, 116, 27);
		layeredPane.add(comboBox_1);
		
		//SAISIEBOX MONTANT 
		JLabel label_2 = new JLabel("MONTANT :");
		label_2.setBounds(6, 12, 91, 16);
		layeredPane.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(6, 40, 202, 27);
		layeredPane.add(textField_1);
		
		//SAISIEBOX NOUVEL APPORT 
		JLabel lblSaisieDuneNouveau = new JLabel("SAISIE D'UN NOUVEL APPORT :");
		lblSaisieDuneNouveau.setBounds(6, 78, 202, 16);
		layeredPane.add(lblSaisieDuneNouveau);
	
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(6, 106, 202, 27);
		layeredPane.add(textField);
		
		
		
		
	}
}
