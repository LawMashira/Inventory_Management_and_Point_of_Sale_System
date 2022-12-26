import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class ZWL extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnViewReportsUsd;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZWL frame = new ZWL();
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
	public ZWL() {
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				try {
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
					PreparedStatement pst = con.prepareStatement("select * from sales_zwl");
					
					ResultSet rst = pst.executeQuery();
					ResultSetMetaData rsmd =rst.getMetaData();
					DefaultTableModel model=(DefaultTableModel) table.getModel();
					int cols=rsmd.getColumnCount();
					String[] colname =new String[cols];
					for(int p = 0;p<cols;p++) {
						
						colname[p]=rsmd.getColumnName(p+1);
						model.setColumnIdentifiers(colname);
						String date,subtotal,pay,change;
						while(rst.next()) {
							date=rst.getString(1);
							subtotal=rst.getString(2);	
							pay=rst.getString(3);
							change=rst.getString(4);
							String[] row= {date,subtotal,pay,change};
							model.addRow(row);
				
							
						}
						
						
					}
					
					
					
					}catch(Exception e1) {
						System.out.println(e1);
					}
	
			}
		});
		this.setExtendedState(ZWL.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1385, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 104, 1320, 620);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Date", "Subtotal", "Payment", "change"
			}
		));
		
		btnViewReportsUsd = new JButton("VIEW REPORTS ZWL");
		btnViewReportsUsd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
					PreparedStatement pst = con.prepareStatement("select * from sales_zwl");
					
					ResultSet rst = pst.executeQuery();
					ResultSetMetaData rsmd =rst.getMetaData();
					DefaultTableModel model=(DefaultTableModel) table.getModel();
					int cols=rsmd.getColumnCount();
					String[] colname =new String[cols];
					for(int p = 0;p<cols;p++) {
						
						colname[p]=rsmd.getColumnName(p+1);
						model.setColumnIdentifiers(colname);
						String date,subtotal,pay,change;
						while(rst.next()) {
							date=rst.getString(1);
							subtotal=rst.getString(2);	
							pay=rst.getString(3);
							change=rst.getString(4);
							String[] row= {date,subtotal,pay,change};
							model.addRow(row);
				
							
						}
						
						
					}
					
					
					
					}catch(Exception e1) {
						System.out.println(e1);
					}
				
			}
		});
		btnViewReportsUsd.setBounds(581, 15, 185, 34);
		contentPane.add(btnViewReportsUsd);
		
		lblNewLabel = new JLabel("Back");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new Reports().setVisible(true);
			}
			
		});
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(1196, 15, 116, 50);
		contentPane.add(lblNewLabel);
	}
}
