package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class ConfirmarEntregasView {

	private JFrame frame;
	private JComboBox comboBox;
	private JCheckBox chckbxFallida;
	private JCheckBox chckbxConfirmada;
	private JButton btnConfirmar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfirmarEntregasView window = new ConfirmarEntregasView();
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
	public ConfirmarEntregasView() {
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
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Paquetes a repartir"}));
		comboBox.setBounds(10, 11, 172, 22);
		frame.getContentPane().add(comboBox);
		
		chckbxFallida = new JCheckBox("Entrega fallida");
		chckbxFallida.setBounds(10, 65, 97, 23);
		frame.getContentPane().add(chckbxFallida);
		
		chckbxConfirmada = new JCheckBox("Entrega confirmada");
		chckbxConfirmada.setBounds(10, 119, 119, 23);
		frame.getContentPane().add(chckbxConfirmada);
		
		btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(315, 227, 109, 23);
		frame.getContentPane().add(btnConfirmar);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}



	public JCheckBox getChckbxFallida() {
		return chckbxFallida;
	}

	public void setChckbxFallida(JCheckBox chckbxFallida) {
		this.chckbxFallida = chckbxFallida;
	}

	public JCheckBox getChckbxConfirmada() {
		return chckbxConfirmada;
	}

	public void setChckbxConfirmada(JCheckBox chckbxConfirmada) {
		this.chckbxConfirmada = chckbxConfirmada;
	}

	public JButton getBtnConfirmar() {
		return btnConfirmar;
	}

	public void setBtnConfirmar(JButton btnConfirmar) {
		this.btnConfirmar = btnConfirmar;
	}
	
	
}
