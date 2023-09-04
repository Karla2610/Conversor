package Vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame{

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Principal() {
		setForeground(new Color(0, 0, 0));
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBackground(new Color(0, 0, 0));
		setType(Type.UTILITY);
		setTitle("Conversor");
		setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		setBounds(100, 100, 550, 337);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menú Principal");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setLabelFor(this);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(183, 26, 131, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Conversor de Monedas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VistaconversorMonedas convertirC = new VistaconversorMonedas();
				convertirC.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(128, 128, 128));
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.setBounds(172, 72, 175, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Conversor de Temperaturas");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VistaConversorTemperatura pantallaTem = new VistaConversorTemperatura();
				pantallaTem.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(128, 128, 128));
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_1.setBounds(158, 141, 201, 37);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Salir");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Programa terminado");
				 System.exit(0);
			}
		});
		btnNewButton_3.setBackground(new Color(128, 128, 128));
		btnNewButton_3.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_3.setBounds(172, 217, 175, 37);
		contentPane.add(btnNewButton_3);
		
	}	
}
