package com.iti.budgetFamilial.ihm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JCheckBox;
import javax.swing.Box;
import javax.swing.JList;
import javax.swing.JSlider;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JProgressBar;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import java.awt.ScrollPane;
import java.awt.Panel;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenu;
import java.awt.List;
import javax.swing.JMenuItem;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;

public class IhmMAIN {

	JFrame frame;
	private JTable table;
	
	/**
	 * 
	 */
	//public void someNonStandardEntryPoint() {
		//JFrame frame = new JFrame();
		//...;
	//}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//IhmMAIN window = new IhmMAIN();
					//.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 * 
	 */
	public IhmMAIN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 */
	
	private void initialize() {
		frame = new JFrame("-----Budget Familial - V1 -----");
		frame.setBounds(100, 100, 767, 466);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JLayeredPane layeredPane = 	new JLayeredPane();
		layeredPane.setForeground(Color.LIGHT_GRAY);
		frame.getContentPane().add(layeredPane);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"P\u00E8re", "M\u00E8re", "Enfant_1", "Enfant_2", "Enfant_3"}));
		
		JLabel lblChoisirLaPersonne = new JLabel("Status budget familial");
		lblChoisirLaPersonne.setForeground(Color.BLUE);
		lblChoisirLaPersonne.setFont(new Font("SansSerif", Font.BOLD, 12));
		
		//Boutton event Depense
		JButton btnDpense = new JButton("D\u00E9pense");
		btnDpense.setForeground(Color.RED);
		btnDpense.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDpense.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Ihm_Depense frame = new Ihm_Depense();
				frame.setVisible(true);
			}
		});
		
		//Boutton event Apport
		JButton btnApport = new JButton("Apport");
		btnApport.setBackground(UIManager.getColor("scrollbar"));
		btnApport.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnApport.setForeground(new Color(50, 205, 50));
		btnApport.addMouseListener(new MouseAdapter() {
			// ajouter une action à chanque passage de la souris
			@Override
			public void mouseEntered(MouseEvent arg0) {
				
			}
		});
		btnApport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ihm_Apport frame = new Ihm_Apport();
				frame.setVisible(true);
				
			}
		});
		
		JButton btnNewButton = new JButton("Budget");
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AjoutBudget frame = new AjoutBudget();
				frame.setVisible(true);
				
			}
		});
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		//Tableau d'afffichage de Revenus 
		
		table = new JTable();
		table.setSurrendersFocusOnKeystroke(true);
		table.setShowVerticalLines(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		table.setShowHorizontalLines(true);
		table.setToolTipText("");
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Apport (+)", null},
				{"D\u00E9pense (-)", null},
				{"Budget Perso (+/-)", null},
				{"", null},
				{"Solde", null},
			},
			new String[] {
				"Cat\u00E9gories", "Op\u00E9ration"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Float.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(128);
		table.getColumnModel().getColumn(1).setPreferredWidth(149);
		
		JLabel lblRevenus = new JLabel("Revenus");
		lblRevenus.setFont(new Font("SansSerif", Font.BOLD, 14));
		
		JLabel lblOpratio = new JLabel("Op\u00E9ration");
		lblOpratio.setFont(new Font("SansSerif", Font.BOLD, 14));
		GroupLayout gl_layeredPane = new GroupLayout(layeredPane);
		gl_layeredPane.setHorizontalGroup(
			gl_layeredPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane.createSequentialGroup()
					.addGap(40)
					.addGroup(gl_layeredPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_layeredPane.createSequentialGroup()
							.addGroup(gl_layeredPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_layeredPane.createSequentialGroup()
									.addGap(58)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_layeredPane.createSequentialGroup()
									.addGap(79)
									.addComponent(btnApport, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)))
							.addGap(18))
						.addComponent(lblChoisirLaPersonne, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_layeredPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_layeredPane.createSequentialGroup()
							.addGap(38)
							.addGroup(gl_layeredPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_layeredPane.createSequentialGroup()
									.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
									.addGap(426))
								.addGroup(gl_layeredPane.createSequentialGroup()
									.addComponent(lblRevenus, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
									.addGap(89)
									.addComponent(lblOpratio, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
									.addGap(297))))
						.addGroup(gl_layeredPane.createSequentialGroup()
							.addGap(68)
							.addComponent(btnDpense, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
							.addGap(78)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_layeredPane.createSequentialGroup()
							.addGap(29)
							.addComponent(table, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(61, Short.MAX_VALUE))
		);
		gl_layeredPane.setVerticalGroup(
			gl_layeredPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane.createSequentialGroup()
					.addContainerGap(98, Short.MAX_VALUE)
					.addGroup(gl_layeredPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_layeredPane.createSequentialGroup()
							.addGroup(gl_layeredPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_layeredPane.createSequentialGroup()
									.addGap(81)
									.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_layeredPane.createSequentialGroup()
									.addGap(83)
									.addGroup(gl_layeredPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblOpratio)
										.addComponent(lblRevenus))))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(table, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(63))
						.addGroup(gl_layeredPane.createSequentialGroup()
							.addGroup(gl_layeredPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnApport, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnDpense, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
							.addGap(63)
							.addComponent(lblChoisirLaPersonne)
							.addGap(18)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(97))))
		);
		layeredPane.setLayout(gl_layeredPane);
		
		
	}
}
