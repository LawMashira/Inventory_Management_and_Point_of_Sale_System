import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.SystemColor;

public class Supplier extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textContact;
	private JTextField textProduct;
	private JTable table;
	private JTextField textSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Supplier frame = new Supplier();
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
	public Supplier() {
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
try {
					
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
					PreparedStatement pst = con.prepareStatement("select * from supplier");
					
					ResultSet rst = pst.executeQuery();
					
	
					table.setModel(DbUtils.resultSetToTableModel(rst));
		
					
				}catch(Exception e1) {
					System.out.println(e1);
				}
		
			}
		});
		this.setExtendedState(Supplier.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1385, 800);
	
		
		contentPane = new JPanel();
		contentPane.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				
	}
		});
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, -22, 212, 760);
		panel_1.setLayout(null);
		panel_1.setBackground(Color.BLUE);
		contentPane.add(panel_1);
		
		JLabel lblProduct = new JLabel("Product");
		lblProduct.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new Product().setVisible(true);
			}
		});
		lblProduct.setForeground(Color.WHITE);
		lblProduct.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblProduct.setBounds(38, 228, 131, 39);
		panel_1.add(lblProduct);
		
		JLabel lblPos = new JLabel("Payment");
		lblPos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new XXXX().setVisible(true);
			}
		});
		lblPos.setForeground(Color.WHITE);
		lblPos.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblPos.setBounds(38, 390, 137, 39);
		panel_1.add(lblPos);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(60, 414, 81, 22);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblExit = new JLabel("Log Out");
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				//new LogOut().setVisible(true);
			}
		});
		lblExit.setForeground(Color.WHITE);
		lblExit.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblExit.setBounds(38, 549, 103, 44);
		panel_1.add(lblExit);
		
		JLabel lblBrand = new JLabel("Brand");
		lblBrand.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new Brand_Co().setVisible(true);
			}
		});
		lblBrand.setForeground(Color.WHITE);
		lblBrand.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblBrand.setBounds(38, 157, 81, 31);
		panel_1.add(lblBrand);
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new Category().setVisible(true);
			}
			
		});
		lblCategory.setForeground(Color.WHITE);
		lblCategory.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblCategory.setBounds(38, 81, 131, 39);
		panel_1.add(lblCategory);
		
		JLabel lblSupplier = new JLabel("Supplier");
		lblSupplier.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new Supplier().setVisible(true);
			}
		});
		lblSupplier.setForeground(Color.WHITE);
		lblSupplier.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblSupplier.setBounds(38, 312, 106, 33);
		panel_1.add(lblSupplier);
		
		JLabel lblReports = new JLabel("Reports");
		lblReports.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new Reports().setVisible(true);
			}
		});
		lblReports.setForeground(Color.WHITE);
		lblReports.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblReports.setBounds(35, 470, 106, 33);
		panel_1.add(lblReports);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new About().setVisible(true);
			}
		});
		lblAbout.setForeground(Color.WHITE);
		lblAbout.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblAbout.setBounds(38, 636, 106, 33);
		panel_1.add(lblAbout);
		
		JPanel panel = new JPanel();
		panel.setBounds(243, 209, 519, 430);
		panel.setLayout(null);
		panel.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Supplier", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(new Color(255, 192, 203));
		contentPane.add(panel);
		
		textName = new JTextField();
		textName.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textName.setColumns(10);
		textName.setBounds(238, 57, 254, 39);
		panel.add(textName);
		
		JLabel lblNewLabel_3 = new JLabel("Supplier Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBounds(10, 56, 192, 41);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_2 = new JLabel("Contact No");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2_2.setBounds(10, 127, 156, 47);
		panel.add(lblNewLabel_2_2);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name=textName.getText();
				String contact=textContact.getText();
				String product=textProduct.getText();
				try {
					
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
					PreparedStatement pst = con.prepareStatement("insert into supplier(Supplier_Name,Contact_No,	Products) values(?,?,?);");
					pst.setString(1, name);
					pst.setString(2,contact);
					pst.setString(3,product);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null,"Record successfully added");
					ResultSet rst = pst.executeQuery("select * from supplier");
					table.setModel(DbUtils.resultSetToTableModel(rst));
					
	       textName.setText("");
	       textContact.setText("");
	       textProduct.setText("");
					
				}catch(Exception e1) {
					System.out.println(e1);
				}
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBackground(new Color(34, 139, 34));
		btnNewButton.setBounds(10, 321, 132, 76);
		panel.add(btnNewButton);
		
		JButton btnUpdate = new JButton("DELETE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedIndex = table.getSelectedRow();
				int ID = Integer .parseInt(table.getValueAt(selectedIndex, 0).toString());
				int dialogueResult =JOptionPane.showConfirmDialog(null, "Do you want to delete the record","Warning" ,JOptionPane.YES_NO_OPTION);
				
				if(dialogueResult==JOptionPane.YES_OPTION) {
					
				try {
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
					PreparedStatement pst = con.prepareStatement("delete from supplier where ID =?");
					pst.setInt(1,ID);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null,"Record successfully deleted");
					ResultSet rst = pst.executeQuery("select * from supplier");
					table.setModel(DbUtils.resultSetToTableModel(rst));
					
					
				}catch(Exception e1) {
					System.out.println(e1);
				}
				
				}
			}
		});
		btnUpdate.setForeground(Color.BLACK);
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnUpdate.setBackground(Color.RED);
		btnUpdate.setBounds(341, 321, 168, 77);
		panel.add(btnUpdate);
		
		JButton btnDelete = new JButton("UPDATE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedIndex = table.getSelectedRow();
				int ID = Integer .parseInt(table.getValueAt(selectedIndex, 0).toString());
				String name=textName.getText();
				String contact=textContact.getText();
				String product=textProduct.getText();
				try {
					
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
					PreparedStatement pst = con.prepareStatement("update supplier SET Supplier_Name =?,Contact_No =?,	Products=? WHERE ID =?");
					pst.setString(1, name);
					pst.setString(2,contact);
					pst.setString(3,product);
					pst.setInt(4,ID);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null,"Record successfully updated");
					ResultSet rst = pst.executeQuery("select * from supplier");
					table.setModel(DbUtils.resultSetToTableModel(rst));
					
					
					textName.setText("");
				    textContact.setText("");
				    textProduct.setText("");
	
					
				}catch(Exception e1) {
					System.out.println(e1);
				}
			}
		});
		btnDelete.setForeground(Color.BLACK);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnDelete.setBackground(new Color(34, 139, 34));
		btnDelete.setBounds(163, 320, 168, 79);
		panel.add(btnDelete);
		
		textContact = new JTextField();
		textContact.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textContact.setColumns(10);
		textContact.setBounds(238, 135, 254, 39);
		panel.add(textContact);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Product Name");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2_2_1.setBounds(10, 195, 192, 47);
		panel.add(lblNewLabel_2_2_1);
		
		textProduct = new JTextField();
		textProduct.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textProduct.setColumns(10);
		textProduct.setBounds(238, 203, 254, 39);
		panel.add(textProduct);
		
		JLabel lblNewLabel_2 = new JLabel("Supplier");
		lblNewLabel_2.setBounds(222, 100, 132, 51);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedIndex = table.getSelectedRow();
				textName.setText(table.getValueAt(selectedIndex, 1).toString());
				textContact.setText(table.getValueAt(selectedIndex, 2).toString());
				textProduct.setText(table.getValueAt(selectedIndex, 3).toString());
				
			}
		});
		scrollPane.setBounds(792, 209, 529, 112);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Contact No", "Product"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Enter Full Name");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1_1.setBounds(758, 117, 120, 30);
		contentPane.add(lblNewLabel_3_1_1);
		
		textSearch = new JTextField();
		textSearch.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textSearch.setColumns(10);
		textSearch.setBounds(875, 116, 273, 30);
		contentPane.add(textSearch);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				
					String name =textSearch.getText();
				try {
					

					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
				String querry ="select* from supplier where Supplier_Name =?";
				
					PreparedStatement pst = con.prepareStatement(querry);
				pst.setString(1,name);
				ResultSet rst = pst.executeQuery();
				
				table.setModel(DbUtils.resultSetToTableModel(rst));
				/*if(rst.next()) {
					textSearch.setText(rst.getString("Supplier_Name"));
					
				}
					
						else {
							JOptionPane.showMessageDialog(null, "The supplier does not exist");
							
					}*/
	
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			      	
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSearch.setBackground(Color.MAGENTA);
		btnSearch.setBounds(1187, 113, 107, 37);
		contentPane.add(btnSearch);
		
		
	}
}
