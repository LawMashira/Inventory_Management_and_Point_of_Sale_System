import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class About extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
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
	public About() {
		this.setExtendedState(About.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(false);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1385, 800);
	
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Developed By: Law Mashira");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(517, 513, 390, 76);
		contentPane.add(lblNewLabel);
		
		JLabel lblLawMashira = new JLabel("+263 772 608 332");
		lblLawMashira.setForeground(new Color(0, 0, 255));
		lblLawMashira.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblLawMashira.setBounds(570, 560, 303, 76);
		contentPane.add(lblLawMashira);
		
		JLabel lblOr = new JLabel("OR");
		lblOr.setForeground(new Color(0, 0, 255));
		lblOr.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblOr.setBounds(656, 592, 71, 76);
		contentPane.add(lblOr);
		
		JLabel lblNewLabel_1 = new JLabel("+263 713 355 308");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(570, 623, 303, 76);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\LMC\\law.jpg"));
		lblNewLabel_3.setBounds(542, 0, 448, 432);
		contentPane.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.BLUE);
		panel_1.setBounds(0, 0, 212, 760);
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
		lblPos.setBounds(38, 390, 131, 39);
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
				new LogOut().setVisible(true);
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
		lblAbout.setForeground(Color.WHITE);
		lblAbout.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblAbout.setBounds(38, 636, 106, 33);
		panel_1.add(lblAbout);
		
		JLabel lblInventoryManagementAnd = new JLabel("Inventory Management and Point of Sale System");
		lblInventoryManagementAnd.setForeground(new Color(0, 0, 255));
		lblInventoryManagementAnd.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblInventoryManagementAnd.setBounds(364, 443, 774, 76);
		contentPane.add(lblInventoryManagementAnd);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\super.jpg"));
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1_1.setBounds(209, 0, 1160, 738);
		contentPane.add(lblNewLabel_1_1_1);
		
		
	}
}
