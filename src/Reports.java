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
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

public class Reports extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reports frame = new Reports();
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
	public Reports() {
		this.setExtendedState(Reports.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(false);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1385, 800);
	
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		lblPos.setBounds(38, 398, 141, 39);
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
				/*setVisible(false);
				new Reports().setVisible(true);*/
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
		panel.setLayout(null);
		panel.setBackground(Color.BLUE);
		panel.setBounds(335, 31, 904, 101);
		contentPane.add(panel);
		
		JLabel lblReportsSelectionMenu = new JLabel("REPORTS SELECTION MENU");
		lblReportsSelectionMenu.setForeground(Color.WHITE);
		lblReportsSelectionMenu.setFont(new Font("Tahoma", Font.BOLD, 38));
		lblReportsSelectionMenu.setBounds(212, 21, 618, 47);
		panel.add(lblReportsSelectionMenu);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Reports", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBackground(new Color(173, 255, 47));
		panel_2.setBounds(356, 227, 871, 425);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("ZAR REPORTS");
		lblNewLabel.setBounds(320, 169, 327, 62);
		panel_2.add(lblNewLabel);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new ZAR().setVisible(true);
			}
		});
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JLabel lblZwlReports = new JLabel("ZWL REPORTS");
		lblZwlReports.setBounds(320, 23, 327, 62);
		panel_2.add(lblZwlReports);
		lblZwlReports.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new ZWL().setVisible(true);
			}
		});
		lblZwlReports.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JLabel lblUsdReports = new JLabel("USD REPORTS");
		lblUsdReports.setBounds(320, 335, 327, 62);
		panel_2.add(lblUsdReports);
		lblUsdReports.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				new USD().setVisible(true);
			}
		});
		lblUsdReports.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		
	}
}
