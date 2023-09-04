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

import conversor_modelo.ConvertirAColones;
import conversor_modelo.ConvertirAOtrasMonedas;

public class VistaconversorMonedas extends JFrame{

	private JPanel contentPane;
	private JTextField textField;
	protected JTextArea textArea;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaconversorMonedas frame = new VistaconversorMonedas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VistaconversorMonedas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 664, 320);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Conversor de Divisas");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setBounds(223, 11, 188, 39);
		contentPane.add(lblNewLabel);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Colones (₡) a Dólar Estadounidense ($)","Colones (₡) a Euros (€)", "Colones (₡) a Yen Japonés (¥)", "Colones (₡) a Franco Suizo (CHF)", "Colones (₡) a Libra Esterlina (£)", "Colones (₡) a Won Surcoreano (₩)", "Colones (₡) a Peso Mexicano ($)", "Dólar Estadounidense ($) a Colones (₡)", "Euros (€) a Colones (₡)", "Yen Japonés (¥) a Colones (₡)", "Franco Suizo (CHF) a Colones (₡)", "Libra Esterlina (£) a Colones (₡)", "Won Surcoreano (₩) a Colones (₡)", "Peso Mexicano ($) a Colones (₡)"}));
		comboBox.setBounds(265, 94, 283, 22);
		contentPane.add(comboBox);

		textField = new JTextField();
		textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		textField.setBounds(131, 94, 124, 22);
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
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese la cantidad");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 94, 115, 14);
		contentPane.add(lblNewLabel_1);
		

		JLabel lblNewLabel_2 = new JLabel("Elija la moneda desea convertir");
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(280, 72, 188, 14);
		contentPane.add(lblNewLabel_2);

		JButton btnNewButton = new JButton("Volver al menu principal");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal principal = new Principal();
				principal.setVisible(true);
			}
		});
		btnNewButton.setBounds(148, 219, 176, 23);
		contentPane.add(btnNewButton);

		JButton btnSalir = new JButton("Salir ");
		btnSalir.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Programa terminado");
				System.exit(0);
			}
		});
		btnSalir.setBounds(361, 219, 150, 23);
		contentPane.add(btnSalir);

		JButton btnConvertir = new JButton("Convertir ");
		btnConvertir.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

		        textArea.setText("");

				double valor = Double.parseDouble(textField.getText());

				ConvertirAColones convertor = new ConvertirAColones();
				ConvertirAOtrasMonedas convertir = new ConvertirAOtrasMonedas();

				String opcion = (String) comboBox.getSelectedItem();

				switch (opcion) {
				case "Colones (₡) a Dólar Estadounidense ($)":
					convertor.ConvertirColonesADolares(valor, textArea);
					break;
				case "Colones (₡) a Euros (€)":
					convertor.ConvertirColonesAEuros(valor, textArea);
					break;
				case "Colones (₡) a Franco Suizo (CHF)":
					convertor.ConvertirColonesAFrancoZuizo(valor, textArea);
					break;
				case "Colones (₡) a Libra Esterlina (£)":
					convertor.ConvertirColonesALibraEsterlina(valor, textArea);
					break;
				case "Colones (₡) a Peso Mexicano ($)":
					convertor.ConvertirColonesAPesoMexicano(valor, textArea);
					break;
				case "Colones (₡) a Won Surcoreano (₩)":
					convertor.ConvertirColonesAWonSurCoreano(valor, textArea);
					break;
				case "Colones (₡) a Yen Japonés (¥)":
					convertor.ConvertirColonesAYenJapones(valor, textArea);
					break;
				case "Dólar Estadounidense ($) a Colones (₡)":
					convertir.ConvertirDolaresAColones(valor, textArea);
					break;
				case "Euros (€) a Colones (₡)":
					convertir.ConvertirEurosAColones(valor, textArea);
					break;
				case "Franco Suizo (CHF) a Colones (₡)":
					convertir.ConvertirFrancoZuizoAColones(valor, textArea);
					break;
				case "	Libra Esterlina (£) a Colones (₡)":
					convertir.ConvertirLibraEsterlinaAColones(valor, textArea);
					break;
				case "Peso Mexicano ($) a Colones (₡)":
					convertir.ConvertirPesoMexicanoAColones(valor, textArea);
					break;
				case "Won Surcoreano (₩) a Colones (₡)":
					convertir.ConvertirWonSurCoreanoAColones(valor, textArea);
					break;
				case "Yen Japonés (¥) a Colones (₡)":
					convertir.ConvertirYenJaponesAColones(valor, textArea);
					break;		
				}
			}
		});
		btnConvertir.setBounds(387, 127, 105, 23);
		contentPane.add(btnConvertir);

		JLabel lblNewLabel_3 = new JLabel("Valor de la Divisa convertida:\r\n");
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(10, 139, 172, 14);
		contentPane.add(lblNewLabel_3);

		textArea = new JTextArea();
		textArea.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		textArea.setBounds(192, 134, 132, 19);
		contentPane.add(textArea);

	}
	
}
