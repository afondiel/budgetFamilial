package com.iti.budgetFamilial.ihm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.JComboBox;

public class AjoutBudget extends JFrame {

	private JPanel contentPane;
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
					AjoutBudget frame = new AjoutBudget();
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
	public AjoutBudget() {
		setTitle("------ Ajout d'un Budget------");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 566, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		JButton button = new JButton("OK");
		button.setForeground(Color.GREEN);
		button.setBounds(118, 188, 126, 59);
		layeredPane.add(button);
		
		JButton button_1 = new JButton("ANNULER");
		button_1.setForeground(Color.RED);
		button_1.setBounds(265, 188, 126, 59);
		layeredPane.add(button_1);
		
		JLabel lblBudget = new JLabel("BUDGET");
		lblBudget.setBounds(10, 45, 57, 16);
		layeredPane.add(lblBudget);
		
		JLabel lblSaisieDuNouveau = new JLabel("SAISIE DU NOUVEAU BUDGET :");
		lblSaisieDuNouveau.setBounds(311, 45, 202, 16);
		layeredPane.add(lblSaisieDuNouveau);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(311, 73, 202, 27);
		layeredPane.add(textField);
		
		JLabel label_2 = new JLabel("MONTANT :");
		label_2.setBounds(311, 112, 202, 16);
		layeredPane.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(311, 129, 202, 27);
		layeredPane.add(textField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 73, 126, 27);
		layeredPane.add(comboBox);
	}
}
