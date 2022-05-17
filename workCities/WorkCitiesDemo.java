package workCities;


import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTable;


public class WorkCitiesDemo extends JFrame {
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WorkCitiesDemo frame = new WorkCitiesDemo();
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
	public WorkCitiesDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 450);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lbId = new JLabel("Id");
		GridBagConstraints gbc_lbId = new GridBagConstraints();
		gbc_lbId.anchor = GridBagConstraints.NORTH;
		gbc_lbId.insets = new Insets(0, 0, 5, 5);
		gbc_lbId.gridx = 1;
		gbc_lbId.gridy = 1;
		getContentPane().add(lbId, gbc_lbId);
		
		JLabel lblName = new JLabel("Name");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.anchor = GridBagConstraints.NORTH;
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 2;
		gbc_lblName.gridy = 1;
		getContentPane().add(lblName, gbc_lblName);
		
		JLabel lblCountryCode = new JLabel("CountryCode");
		GridBagConstraints gbc_lblCountryCode = new GridBagConstraints();
		gbc_lblCountryCode.anchor = GridBagConstraints.NORTH;
		gbc_lblCountryCode.insets = new Insets(0, 0, 5, 5);
		gbc_lblCountryCode.gridx = 3;
		gbc_lblCountryCode.gridy = 1;
		getContentPane().add(lblCountryCode, gbc_lblCountryCode);
		
		JLabel lblDistrict = new JLabel("District");
		GridBagConstraints gbc_lblDistrict = new GridBagConstraints();
		gbc_lblDistrict.insets = new Insets(0, 0, 5, 5);
		gbc_lblDistrict.gridx = 4;
		gbc_lblDistrict.gridy = 1;
		getContentPane().add(lblDistrict, gbc_lblDistrict);
		
		JLabel lblPopulation = new JLabel("Population");
		GridBagConstraints gbc_lblPopulation = new GridBagConstraints();
		gbc_lblPopulation.insets = new Insets(0, 0, 5, 0);
		gbc_lblPopulation.gridx = 5;
		gbc_lblPopulation.gridy = 1;
		getContentPane().add(lblPopulation, gbc_lblPopulation);
		
		table = new JTable();
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.insets = new Insets(0, 0, 0, 5);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 1;
		gbc_table.gridy = 2;
		getContentPane().add(table, gbc_table);
		
		table_1 = new JTable();
		GridBagConstraints gbc_table_1 = new GridBagConstraints();
		gbc_table_1.insets = new Insets(0, 0, 0, 5);
		gbc_table_1.fill = GridBagConstraints.BOTH;
		gbc_table_1.gridx = 2;
		gbc_table_1.gridy = 2;
		getContentPane().add(table_1, gbc_table_1);
		
		table_2 = new JTable();
		GridBagConstraints gbc_table_2 = new GridBagConstraints();
		gbc_table_2.insets = new Insets(0, 0, 0, 5);
		gbc_table_2.fill = GridBagConstraints.BOTH;
		gbc_table_2.gridx = 3;
		gbc_table_2.gridy = 2;
		getContentPane().add(table_2, gbc_table_2);
		
		table_3 = new JTable();
		GridBagConstraints gbc_table_3 = new GridBagConstraints();
		gbc_table_3.insets = new Insets(0, 0, 0, 5);
		gbc_table_3.fill = GridBagConstraints.BOTH;
		gbc_table_3.gridx = 4;
		gbc_table_3.gridy = 2;
		getContentPane().add(table_3, gbc_table_3);
		
		table_4 = new JTable();
		GridBagConstraints gbc_table_4 = new GridBagConstraints();
		gbc_table_4.fill = GridBagConstraints.BOTH;
		gbc_table_4.gridx = 5;
		gbc_table_4.gridy = 2;
		getContentPane().add(table_4, gbc_table_4);
		
	}

}
