package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class CalculoTarifasView {

	private JFrame frame;
	private JTextField textFieldPeso;
	private JTextField txtProvinciaOrigen;
	private JTextField txtProvinciaDestino;
	private JButton btnConfirmar;
	private JButton btnCalcular;
	private JLabel lblNewLabel_1;
	private JCheckBox chckbxMisma;
	private JCheckBox chckbxDistinta;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculoTarifasView window = new CalculoTarifasView();
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
	public CalculoTarifasView() {
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
		
		chckbxMisma = new JCheckBox("Misma provincia");
		chckbxMisma.setBounds(6, 7, 130, 23);
		frame.getContentPane().add(chckbxMisma);
		
		chckbxDistinta = new JCheckBox("Distinta provincia");
		chckbxDistinta.setBounds(6, 45, 130, 23);
		frame.getContentPane().add(chckbxDistinta);
		
		textFieldPeso = new JTextField();
		textFieldPeso.setText("Peso en kg");
		textFieldPeso.setBounds(338, 8, 86, 20);
		frame.getContentPane().add(textFieldPeso);
		textFieldPeso.setColumns(10);
		
		txtProvinciaOrigen = new JTextField();
		txtProvinciaOrigen.setText("Provincia Origen");
		txtProvinciaOrigen.setBounds(6, 94, 186, 20);
		frame.getContentPane().add(txtProvinciaOrigen);
		txtProvinciaOrigen.setColumns(10);
		
		txtProvinciaDestino = new JTextField();
		txtProvinciaDestino.setText("Provincia Destino");
		txtProvinciaDestino.setColumns(10);
		txtProvinciaDestino.setBounds(6, 135, 186, 20);
		frame.getContentPane().add(txtProvinciaDestino);
		
		JLabel lblNewLabel = new JLabel("Precio: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 181, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(66, 177, 70, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(6, 227, 89, 23);
		frame.getContentPane().add(btnCalcular);
		
		btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnConfirmar);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTextFieldPeso() {
		return textFieldPeso;
	}

	public void setTextFieldPeso(JTextField textFieldPeso) {
		this.textFieldPeso = textFieldPeso;
	}

	public JTextField getTxtProvinciaOrigen() {
		return txtProvinciaOrigen;
	}

	public void setTxtProvinciaOrigen(JTextField txtProvinciaOrigen) {
		this.txtProvinciaOrigen = txtProvinciaOrigen;
	}

	public JTextField getTxtProvinciaDestino() {
		return txtProvinciaDestino;
	}

	public void setTxtProvinciaDestino(JTextField txtProvinciaDestino) {
		this.txtProvinciaDestino = txtProvinciaDestino;
	}

	public JButton getBtnConfirmar() {
		return btnConfirmar;
	}

	public void setBtnConfirmar(JButton btnConfirmar) {
		this.btnConfirmar = btnConfirmar;
	}

	public JButton getBtnCalcular() {
		return btnCalcular;
	}

	public void setBtnCalcular(JButton btnCalcular) {
		this.btnCalcular = btnCalcular;
	}

	public JLabel getLblNewLabel_1() {
		return lblNewLabel_1;
	}

	public void setLblNewLabel_1(JLabel lblNewLabel_1) {
		this.lblNewLabel_1 = lblNewLabel_1;
	}

	public JCheckBox getChckbxMisma() {
		return chckbxMisma;
	}

	public void setChckbxMisma(JCheckBox chckbxMisma) {
		this.chckbxMisma = chckbxMisma;
	}

	public JCheckBox getChckbxDistinta() {
		return chckbxDistinta;
	}

	public void setChckbxDistinta(JCheckBox chckbxDistinta) {
		this.chckbxDistinta = chckbxDistinta;
	}

	
}
