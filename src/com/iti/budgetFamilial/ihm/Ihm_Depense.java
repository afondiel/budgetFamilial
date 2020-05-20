package com.iti.budgetFamilial.ihm;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.JTabbedPane;
import javax.swing.Icon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

//Importation de toutes les classes METIERS

import com.iti.budgetFamilial.classesMetier.*;

public class Ihm_Depense extends JFrame {

		
	private JPanel contentPane;
	//public Component values;
	int values1;
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
					Ihm_Depense frame = new Ihm_Depense();
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
	
	public Ihm_Depense() {
		setTitle("----Depense----");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 580, 275);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		
		//LISTE POSTE DEPENSE
		
		JLabel label = new JLabel("Poste Depense");
		label.setBounds(409, 13, 91, 16);
		layeredPane.add(label);
		
				JComboBox comboBox = new JComboBox();
				comboBox.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						//System.out.println(comboBox.getSelectedItem() ); // SETTER DANS LE TABLEAU LISTE ORIGINE! !!!!! 
					}
				});
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"loyer", "achat de nourriture", "achat de vêtements","achat réparation", "achat de matériel meubles", "argent de poche pour les enfants", "voyages"}));
				comboBox.setBounds(395, 41, 126, 27);
				layeredPane.add(comboBox);
				
		//BOUTTON OK	
		JButton button = new JButton("OK");
		button.addActionListener(new ActionListener(){
			
									public void actionPerformed(ActionEvent arg0) {
										if((textField_1.getText().isEmpty()==false)&&(textField.getText().isEmpty()==true)){
											
											PosteDepense posteDepense1 = new PosteDepense((String)comboBox.getSelectedItem());
											
											String d=textField_1.getText();
											float i=Float.valueOf(d);
											Depense dep   = new Depense(i); //(float)(String)textField_1.getText()
					
											//System.out.println(posteDepense1);
										//	System.out.println(dep);
											
										}
										else if((textField_1.getText().isEmpty()==false)&&(textField.getText().isEmpty()==false)){
											
											PosteDepense posteDepense1 = new PosteDepense(textField.getText());
											
											String d=textField_1.getText();
											float i=Float.valueOf(d);
											Depense dep   = new Depense(i); //(float)(String)textField_1.getText()
					
											System.out.println(posteDepense1);
											System.out.println(dep);
											
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
		
		JLabel lblOrigine = new JLabel("Personne");
		lblOrigine.setBounds(281, 12, 91, 16);
		layeredPane.add(lblOrigine);
		
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
		
		//SAISIEBOX NOUVEL DEPENSE 
		JLabel lblSaisieDuneNouveau = new JLabel("NOUVEAU POSTE :");
		lblSaisieDuneNouveau.setBounds(6, 78, 202, 16);
		layeredPane.add(lblSaisieDuneNouveau);
	
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(6, 106, 202, 27);
		layeredPane.add(textField);
		
		
		
	}
}