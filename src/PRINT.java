import java.awt.BorderLayout;


import java.awt.EventQueue;
import java.awt.print.PrinterException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableModel;
import javax.swing.JTextArea ;
import javax.swing.JTextField;

public class PRINT extends JFrame {
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PRINT frame = new PRINT();
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
	public PRINT() {
		setUndecorated(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 325, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 325, 518);
		contentPane.add(textArea);
		
		
		
		
	}
	
	
	
	 String lsub;
	 String lPay;
	 String lbala;
	 
	
	 public PRINT(String sub, String Pay, String bala, TableModel tableModel) {
		 
		 
		 setUndecorated(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 268, 489);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JTextArea textArea = new JTextArea();
			textArea.setBounds(0, 0, 252, 450);
			contentPane.add(textArea); 
		 
		 
			this.lsub=sub;
			this.lPay=Pay;
			this.lbala= bala;
		
		
		textArea.setText(textArea.getText() + "************SUPERPOS***********\n");
		
		textArea.setText(textArea.getText() + "\n");
		
		textArea.setText(textArea.getText()+"Product"+ "\t"+ "Price " +"  Total "+ " Quantity");
		
		textArea.setText(textArea.getText() + "\n");
		
		for(int p = 0;p<tableModel.getRowCount();p++) {
			String product= (String) tableModel.getValueAt(p, 1);
			String price= (String) tableModel.getValueAt(p, 2);
			String qty= (String) tableModel.getValueAt(p, 3);
			double total= (Double) tableModel.getValueAt(p, 4);
			
	  textArea.setText(textArea.getText()+"\n"+product+"\t"+price+  total+"\t"+ qty);
			
		}
		
		textArea.setText(textArea.getText()+"\n");
		textArea.setText(textArea.getText()+"\n");
		//textArea.setText(textArea.getText()+"\n");
		
		textArea.setText(textArea.getText()+"Subtotal:R"+ sub +"\n");
		textArea.setText(textArea.getText()+"Payment: R"+ Pay +"\n");
		textArea.setText(textArea.getText()+"Change:  R"+ bala +"\n");
		
		
		
		textArea.setText(textArea.getText() + "\n");
		textArea.setText(textArea.getText() + "***THANK YOU FOR SHOPPING WITH US***\n");
		
		try {
			textArea.print();
		} catch (PrinterException e) {
			
			e.printStackTrace();
		} 
	}

	
	
}
