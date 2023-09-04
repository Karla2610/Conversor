package Vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import conversor_modelo.ConversorTemperatura;

public class VistaConversorTemperatura extends JFrame{

	private JPanel contentPane;
	private JTextField textField;
	protected JTextArea textArea;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaConversorTemperatura frame = new VistaConversorTemperatura();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VistaConversorTemperatura() {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 553, 346);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(192, 192, 192));
		comboBox.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Grados Celsius a Grados Fahrenheit", "Grados Celsius a Grados Kelvin", "Grados Celsius a Grados Rankine", "Grados Fahrenheit a Grados Celsius", "Grados Fahrenheit a Grados Kelvin", "Grados Fahrenheit a Grados Rankine", "Grados Kelvin a Grados Celsius", "Grados Kelvin a Grados Fahrenheit ", "Grados Kelvin a Grados Rankine", "Grados Rankine a Grados Celsius", "Grados Rankine a Grados Kelvin", "Grados Rankine a Grados Fahrenheit"}));
		comboBox.setBounds(116, 144, 234, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Conversor de Temperaturas\r\n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(118, 23, 234, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese la cantidad  a convertir");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(126, 61, 226, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		textField.setBounds(160, 88, 136, 20);
		contentPane.add(textField);
		textField.setColumns(10);
				textField.addKeyListener(new KeyAdapter() {
				    @Override
				    public void keyTyped(KeyEvent e) {
				        char c = e.getKeyChar();
				        if (!Character.isDigit(c)) {
				            JOptionPane.showMessageDialog(null, "Solo se aceptan números");
				            e.consume();
				        }
				    }
				});
		
		JLabel lblNewLabel_2 = new JLabel("Elija la escala a la que desea convertir \r\n");
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(124, 119, 226, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("La temperatura es:");
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(161, 189, 125, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Volver al menú principal");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal principal = new Principal();
				principal.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(89, 264, 167, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salir\r\n");
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Programa terminado");
				System.exit(0);
			}
		});
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.setBounds(318, 264, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        textArea.setText("");
		        
				double valor = Double.parseDouble(textField.getText());

				ConversorTemperatura temperatura = new ConversorTemperatura();
				
				String opcion = (String) comboBox.getSelectedItem();
				
				switch(opcion){
					case "Grados Celsius a Grados Fahrenheit":
						temperatura.GradosCelsiusAGradosFahrenheit(valor, textArea);
					break;
					case "Grados Celsius a Grados Kelvin":
						temperatura.GradosCelsiusAGradosKelvin(valor, textArea);
					break;
					case "Grados Celsius a Grados Rankine":
						temperatura.GradosCelsiusAGradosRankine(valor, textArea);
					break;
					case "Grados Fahrenheit a Grados Celsius":
						temperatura.GradosFahrenheitAGradosCelsius(valor, textArea);
					break;
					case "Grados Fahrenheit a Grados Kelvin":
						temperatura.GradosFahrenheitAGradosKelvin(valor, textArea);
					break;
					case "Grados Fahrenheit a Grados Rankine":
						temperatura.GradosFahrenheitAGradosRankine(valor, textArea);
					break;
					case "Grados Kelvin a Grados Celsius":
						temperatura.GradosKelvinAGradosCelsius(valor, textArea);
					break;
					case "Grados Kelvin a Grados Fahrenheit ":
						temperatura.GradosKelvinAGradosFahrenheit(valor, textArea);
					break;
					case "Grados Kelvin a Grados Rankine":
						temperatura.GradosKelvinAGradosRankine(valor, textArea);
					break;
					case "Grados Rankine a Grados Celsius":
						temperatura.GradosRankineAGradosCelsius(valor, textArea);
					break;
					case "Grados Rankine a Grados Kelvin":
						temperatura.GradosRankineAGradosKelvin(valor, textArea);
					break;
					case "Grados Rankine a Grados Fahrenheit":
						temperatura.GradosRankineAGradosFahrenheit(valor, textArea);
						break;		
				}
				}
		});
		btnConvertir.setBounds(381, 144, 89, 23);
		contentPane.add(btnConvertir);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		textArea.setBounds(161, 214, 132, 22);
		contentPane.add(textArea);
	}
	
}
