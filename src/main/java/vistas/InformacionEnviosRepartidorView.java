package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;

public class InformacionEnviosRepartidorView {

	private JFrame frame;
	private JTable table;
	private JLabel lblDireccion;
	private JLabel lblNombre;
	private JLabel lblCiudad; 
	private JLabel lblProvincia; 
	private JLabel lblPeso; 
	private JButton btnConfirmar;
	private JButton btnInfo;
	private JLabel lblNewLabel_2;
	private JLabel lblPrecio;
	private JButton btnAceptar;
	private JButton btnRechazar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InformacionEnviosRepartidorView window = new InformacionEnviosRepartidorView();
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
	public InformacionEnviosRepartidorView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 394, 435);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 193, 272);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(213, 24, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Direccion");
		lblNewLabel_1.setBounds(213, 49, 58, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblDireccion = new JLabel("");
		lblDireccion.setBounds(213, 74, 155, 57);
		frame.getContentPane().add(lblDireccion);
		
		JLabel lblNewLabel_3 = new JLabel("Ciudad");
		lblNewLabel_3.setBounds(213, 142, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Provincia");
		lblNewLabel_4.setBounds(213, 167, 52, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Peso");
		lblNewLabel_5.setBounds(213, 192, 33, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNombre = new JLabel("");
		lblNombre.setBounds(269, 24, 99, 14);
		frame.getContentPane().add(lblNombre);
		
		lblCiudad = new JLabel("");
		lblCiudad.setBounds(256, 142, 112, 14);
		frame.getContentPane().add(lblCiudad);
		
		lblProvincia = new JLabel("");
		lblProvincia.setBounds(275, 167, 93, 14);
		frame.getContentPane().add(lblProvincia);
		
		lblPeso = new JLabel("");
		lblPeso.setBounds(256, 192, 72, 14);
		frame.getContentPane().add(lblPeso);
		
		btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(279, 362, 89, 23);
		frame.getContentPane().add(btnConfirmar);
		
		btnInfo = new JButton("Mas info");
		btnInfo.setBounds(211, 260, 89, 23);
		frame.getContentPane().add(btnInfo);
		
		lblNewLabel_2 = new JLabel("Precio");
		lblNewLabel_2.setBounds(213, 217, 33, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblPrecio = new JLabel("");
		lblPrecio.setBounds(266, 217, 81, 14);
		frame.getContentPane().add(lblPrecio);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(10, 300, 89, 23);
		frame.getContentPane().add(btnAceptar);
		
		btnRechazar = new JButton("Rechazar");
		btnRechazar.setBounds(170, 300, 89, 23);
		frame.getContentPane().add(btnRechazar);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JLabel getLblDireccion() {
		return lblDireccion;
	}

	public void setLblDireccion(JLabel lblDireccion) {
		this.lblDireccion = lblDireccion;
	}

	public JLabel getLblNombre() {
		return lblNombre;
	}

	public void setLblNombre(JLabel lblNombre) {
		this.lblNombre = lblNombre;
	}

	public JLabel getLblCiudad() {
		return lblCiudad;
	}

	public void setLblCiudad(JLabel lblCiudad) {
		this.lblCiudad = lblCiudad;
	}

	public JLabel getLblProvincia() {
		return lblProvincia;
	}

	public void setLblProvincia(JLabel lblProvincia) {
		this.lblProvincia = lblProvincia;
	}

	public JLabel getLblPeso() {
		return lblPeso;
	}

	public void setLblPeso(JLabel lblPeso) {
		this.lblPeso = lblPeso;
	}

	public JButton getBtnConfirmar() {
		return btnConfirmar;
	}

	public void setBtnConfirmar(JButton btnConfirmar) {
		this.btnConfirmar = btnConfirmar;
	}

	public JButton getBtnInfo() {
		return btnInfo;
	}

	public void setBtnInfo(JButton btnInfo) {
		this.btnInfo = btnInfo;
	}

	public JLabel getLblPrecio() {
		return lblPrecio;
	}

	public void setLblPrecio(JLabel lblPrecio) {
		this.lblPrecio = lblPrecio;
	}

	public JButton getBtnAceptar() {
		return btnAceptar;
	}

	public void setBtnAceptar(JButton btnAceptar) {
		this.btnAceptar = btnAceptar;
	}

	public JButton getBtnRechazar() {
		return btnRechazar;
	}

	public void setBtnRechazar(JButton btnRechazar) {
		this.btnRechazar = btnRechazar;
	}
	
	
}
