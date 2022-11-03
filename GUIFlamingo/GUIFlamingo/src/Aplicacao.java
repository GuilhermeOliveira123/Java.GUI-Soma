import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Aplicacao {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aplicacao window = new Aplicacao();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Aplicacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int n1 = Integer.parseInt(textField_1.getText());
				int n2 = Integer.parseInt(textField.getText());
				
				int soma = n1  + n2 ;
				
				textField_2.setText(String.valueOf(soma));
				
			}
		});
		btnNewButton.setBounds(139, 205, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblDigiteUmNmero = new JLabel("Digite um n\u00FAmero :");
		lblDigiteUmNmero.setBounds(33, 108, 134, 14);
		frame.getContentPane().add(lblDigiteUmNmero);
		
		JLabel lblDigiteUmNmero_1 = new JLabel("Digite um n\u00FAmero :");
		lblDigiteUmNmero_1.setBounds(33, 38, 97, 14);
		frame.getContentPane().add(lblDigiteUmNmero_1);
		
		textField = new JTextField();
		textField.setBounds(139, 105, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(139, 35, 86, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel label = new JLabel("+");
		label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label.setBounds(170, 66, 55, 14);
		frame.getContentPane().add(label);
		
		JLabel lblResultado = new JLabel("Resultado :");
		lblResultado.setBounds(48, 164, 82, 14);
		frame.getContentPane().add(lblResultado);
		
		textField_2 = new JTextField();
		textField_2.setBounds(142, 161, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}
