package CurrencyConerter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.HashMap;
import java.util.Map;
import javax.swing.SwingConstants;

public class currencyConverter extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jtxtAmount;
	private JTextField jtxtAmountConverted;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					currencyConverter frame = new currencyConverter();
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
	public currencyConverter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 927, 507);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new LineBorder(new Color(192, 192, 192), 5));
		panel_2_1.setBounds(10, 317, 891, 70);
		contentPane.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("Amount Converted");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(40, 11, 239, 33);
		panel_2_1.add(lblNewLabel_1_3);
		
		jtxtAmountConverted = new JTextField();
		jtxtAmountConverted.setFont(new Font("Tahoma", Font.BOLD, 15));
		jtxtAmountConverted.setColumns(10);
		jtxtAmountConverted.setBounds(326, 11, 538, 33);
		panel_2_1.add(jtxtAmountConverted);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBorder(new LineBorder(new Color(192, 192, 192), 15));
		panel_2_1_1.setBounds(10, 11, 891, 105);
		contentPane.add(panel_2_1_1);
		panel_2_1_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Currency Converter");
		lblNewLabel.setBackground(new Color(128, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(242, 23, 393, 60);
		panel_2_1_1.add(lblNewLabel);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setBorder(new LineBorder(new Color(192, 192, 192), 9));
		panel_2_1_2.setBounds(10, 127, 891, 179);
		contentPane.add(panel_2_1_2);
		panel_2_1_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Amount");
		lblNewLabel_1.setBounds(42, 29, 86, 19);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2_1_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("From Currency");
		lblNewLabel_1_1.setBounds(42, 75, 165, 19);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2_1_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("To Currency");
		lblNewLabel_1_2.setBounds(42, 110, 133, 26);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2_1_2.add(lblNewLabel_1_2);
		
		jtxtAmount = new JTextField();
		jtxtAmount.setFont(new Font("Tahoma", Font.BOLD, 15));
		jtxtAmount.setColumns(10);
		jtxtAmount.setBounds(327, 29, 536, 31);
		panel_2_1_2.add(jtxtAmount);
		
		JComboBox jcmbFromCurrency = new JComboBox();
		jcmbFromCurrency.setModel(new DefaultComboBoxModel(new String[] {"GBP - BRITAIN", "CAD - CANADIAN", "USD - UNITED STATES DOLLAR", "NGN - NIGERIAN NARIA", "MXN - MEXCAN PESO", "EUR - EURO", "CHF - SWISS FRANC", "AUD - AUSTRALIAN", "CNY - CHINESE YUAN", "INR - INDIAN RUPEE", "NPR - NEPALI RUPEE"}));
		jcmbFromCurrency.setFont(new Font("Tahoma", Font.BOLD, 15));
		jcmbFromCurrency.setBounds(327, 71, 536, 26);
		panel_2_1_2.add(jcmbFromCurrency);
		
		JComboBox jcmbToCurrency = new JComboBox();
		jcmbToCurrency.setModel(new DefaultComboBoxModel(new String[] {"GBP - BRITAIN", "CAD - CANADIAN", "USD - UNITED STATES DOLLAR", "NGN - NIGERIAN NARIA", "MXN - MEXCAN PESO", "EUR - EURO", "CHF - SWISS FRANC", "AUD - AUSTRALIAN", "CNY - CHINESE YUAN", "INR - INDIAN RUPEE", "NPR - NEPALI RUPEE"}));
		jcmbToCurrency.setFont(new Font("Tahoma", Font.BOLD, 15));
		jcmbToCurrency.setBounds(327, 110, 536, 26);
		panel_2_1_2.add(jcmbToCurrency);
		
		JPanel panel_2_1_3 = new JPanel();
		panel_2_1_3.setBorder(new LineBorder(new Color(192, 192, 192), 5));
		panel_2_1_3.setBounds(10, 398, 891, 70);
		contentPane.add(panel_2_1_3);
		panel_2_1_3.setLayout(null);
		
		JButton btnConverter = new JButton("Converter");
		btnConverter.setBackground(new Color(128, 255, 255));
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double amount, convertAmount;
				String fromCurrency, toCurrency;
				
				try 
				{
					amount = Double.parseDouble(jtxtAmount.getText());
				}
				catch(NumberFormatException ex) 
				{
					JOptionPane.showMessageDialog(null, "please enter valid number", "Exclamation",
							JOptionPane.ERROR_MESSAGE);
					jtxtAmount.setText("");
					jtxtAmount.requestFocus();
					return;
				}
				fromCurrency = jcmbFromCurrency.getSelectedItem().toString().substring(0, 3);
				toCurrency = jcmbToCurrency.getSelectedItem().toString().substring(0, 3);
				
				convertAmount = convertCurrency(amount, fromCurrency, toCurrency);
				
				jtxtAmountConverted.setText(String.format("%.2f %s = %.2f %s", amount, fromCurrency, convertAmount, toCurrency));
			}
		});
		btnConverter.setBounds(24, 22, 209, 30);
		btnConverter.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_2_1_3.add(btnConverter);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(128, 255, 255));
		btnReset.addActionListener(new ActionListener() {
//			Reset:
			public void actionPerformed(ActionEvent e) {
				jtxtAmount.setText("");
				jtxtAmountConverted.setText("");
				jcmbFromCurrency.setSelectedIndex(-1);
				jcmbToCurrency.setSelectedIndex(-1);
				
			}
		});
		btnReset.setBounds(342, 22, 209, 30);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_2_1_3.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(128, 255, 255));
		btnExit.addActionListener(new ActionListener() {
			private JFrame frame;
			public void actionPerformed(ActionEvent e) {
//				Exit:
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Currency Converter",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
				
			}
		});
		btnExit.setBounds(654, 22, 209, 30);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_2_1_3.add(btnExit);
	}
//	conversion
	public double convertCurrency(double amount, String fromCurrency, String toCurrency)
	{
		Map<String, Double> conversionRate = new HashMap<>();
		conversionRate.put("GBP", 1.0);
		conversionRate.put("CAD", 1.87);
		conversionRate.put("USD", 1.89);
		conversionRate.put("NGN", 1674.76);
		conversionRate.put("MXN", 30.54);
		conversionRate.put("EUR", 1.45);
		conversionRate.put("CHF", 1.37);
		conversionRate.put("AUS", 1.97);
		conversionRate.put("CNY", 9.93);
		conversionRate.put("INR", 108.86);
		conversionRate.put("NPR", 171.73);
		
		if(!conversionRate.containsKey(fromCurrency) || !conversionRate.containsKey(toCurrency))
		{
			throw new IllegalArgumentException("Invalid Currency code.");
			
		}
		return amount * conversionRate.get(toCurrency) / conversionRate.get(fromCurrency);
	}
}
