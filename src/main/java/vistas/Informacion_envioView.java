package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class Informacion_envioView {

	private JFrame frame;
	private JTextField txtDestinatario;
	private JTextField txtDireccion;
	private JTextField txtCiudad;
	private JTextField txtProvincia;
	private JComboBox comboBoxOficina;
	private JButton btnEnvio;
	private JCheckBox chckbxOficina;
	private JCheckBox chckbxCasa;
	private JTextField textFieldPeso;
	private JTextField txtIdpaquete;
	private JButton btnBuscar;
	private JButton btnModificar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Informacion_envioView window = new Informacion_envioView();
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
	public Informacion_envioView() {
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
		
		chckbxOficina = new JCheckBox("Oficina");
		chckbxOficina.setBounds(6, 7, 97, 23);
		frame.getContentPane().add(chckbxOficina);
		
		chckbxCasa = new JCheckBox("Casa");
		chckbxCasa.setBounds(6, 33, 97, 23);
		frame.getContentPane().add(chckbxCasa);
		
		txtDestinatario = new JTextField();
		txtDestinatario.setText("Destinatario");
		txtDestinatario.setBounds(109, 8, 315, 20);
		frame.getContentPane().add(txtDestinatario);
		txtDestinatario.setColumns(10);
		
		comboBoxOficina = new JComboBox();
		comboBoxOficina.setModel(new DefaultComboBoxModel(new String[] {"Oficina"}));
		comboBoxOficina.setBounds(109, 33, 315, 22);
		frame.getContentPane().add(comboBoxOficina);
		
		txtDireccion = new JTextField();
		txtDireccion.setText("Direccion");
		txtDireccion.setBounds(6, 78, 418, 20);
		frame.getContentPane().add(txtDireccion);
		txtDireccion.setColumns(10);
		
		txtCiudad = new JTextField();
		txtCiudad.setText("Ciudad");
		txtCiudad.setBounds(6, 123, 169, 20);
		frame.getContentPane().add(txtCiudad);
		txtCiudad.setColumns(10);
		
		txtProvincia = new JTextField();
		txtProvincia.setText("Provincia");
		txtProvincia.setBounds(185, 123, 239, 20);
		frame.getContentPane().add(txtProvincia);
		txtProvincia.setColumns(10);
		
		btnEnvio = new JButton("Confirmar envio");
		btnEnvio.setBounds(291, 200, 133, 50);
		frame.getContentPane().add(btnEnvio);
		
		textFieldPeso = new JTextField();
		textFieldPeso.setText("Peso en kg");
		textFieldPeso.setBounds(185, 154, 86, 20);
		frame.getContentPane().add(textFieldPeso);
		textFieldPeso.setColumns(10);
		
		txtIdpaquete = new JTextField();
		txtIdpaquete.setText("IdPaquete");
		txtIdpaquete.setBounds(6, 230, 86, 20);
		frame.getContentPane().add(txtIdpaquete);
		txtIdpaquete.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(102, 229, 89, 23);
		frame.getContentPane().add(btnBuscar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(102, 200, 89, 23);
		frame.getContentPane().add(btnModificar);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTxtDestinatario() {
		return txtDestinatario;
	}

	public void setTxtDestinatario(JTextField txtDestinatario) {
		this.txtDestinatario = txtDestinatario;
	}

	public JTextField getTxtDireccion() {
		return txtDireccion;
	}

	public void setTxtDireccion(JTextField txtDireccion) {
		this.txtDireccion = txtDireccion;
	}

	public JTextField getTxtCiudad() {
		return txtCiudad;
	}

	public void setTxtCiudad(JTextField txtCiudad) {
		this.txtCiudad = txtCiudad;
	}

	public JTextField getTxtProvincia() {
		return txtProvincia;
	}

	public void setTxtProvincia(JTextField txtProvincia) {
		this.txtProvincia = txtProvincia;
	}

	public JComboBox getComboBoxOficina() {
		return comboBoxOficina;
	}

	public void setComboBoxOficina(JComboBox comboBoxOficina) {
		this.comboBoxOficina = comboBoxOficina;
	}

	public JButton getBtnEnvio() {
		return btnEnvio;
	}

	public void setBtnEnvio(JButton btnEnvio) {
		this.btnEnvio = btnEnvio;
	}

	public JCheckBox getChckbxOficina() {
		return chckbxOficina;
	}

	public void setChckbxOficina(JCheckBox chckbxOficina) {
		this.chckbxOficina = chckbxOficina;
	}

	public JCheckBox getChckbxCasa() {
		return chckbxCasa;
	}

	public void setChckbxCasa(JCheckBox chckbxCasa) {
		this.chckbxCasa = chckbxCasa;
	}

	public JTextField getTextFieldPeso() {
		return textFieldPeso;
	}

	public void setTextFieldPeso(JTextField textFieldPeso) {
		this.textFieldPeso = textFieldPeso;
	}

	public JTextField getTxtIdpaquete() {
		return txtIdpaquete;
	}

	public void setTxtIdpaquete(JTextField txtIdpaquete) {
		this.txtIdpaquete = txtIdpaquete;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(JButton btnModificar) {
		this.btnModificar = btnModificar;
	}
}
