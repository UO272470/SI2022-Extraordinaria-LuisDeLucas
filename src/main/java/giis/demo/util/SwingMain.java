package giis.demo.util;

import java.awt.EventQueue;
import javax.swing.JFrame;

import controladores.*;
import controladores.Informacion_envioController;
import modelos.*;
import vistas.ConfirmarEntregasView;
import vistas.Informacion_envioView;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

/**
 * Punto de entrada principal que incluye botones para la ejecucion de las pantallas 
 * de las aplicaciones de ejemplo
 * y acciones de inicializacion de la base de datos.
 * No sigue MVC pues es solamente temporal para que durante el desarrollo se tenga posibilidad
 * de realizar acciones de inicializacion
 */
public class SwingMain {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private JSpinner spinnerRepartidor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { //NOSONAR codigo autogenerado
			public void run() {
				try {
					SwingMain window = new SwingMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace(); //NOSONAR codigo autogenerado
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Main");
		frame.setBounds(0, 0, 451, 245);
		frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		
			
		JButton btnInicializarBaseDeDatos = new JButton("Inicializar Base de Datos en Blanco");
		btnInicializarBaseDeDatos.addActionListener(new ActionListener() { //NOSONAR codigo autogenerado
			public void actionPerformed(ActionEvent e) {
				Database db=new Database();
				db.createDatabase(false);
			}
		});
		frame.getContentPane().add(btnInicializarBaseDeDatos);
			
		JButton btnCargarDatosIniciales = new JButton("Cargar Datos Iniciales para Pruebas");
		btnCargarDatosIniciales.addActionListener(new ActionListener() { //NOSONAR codigo autogenerado
			public void actionPerformed(ActionEvent e) {
				Database db=new Database();
				db.createDatabase(false);
				db.loadDatabase();
			}
		});
		frame.getContentPane().add(btnCargarDatosIniciales);
		
		JButton btnInfoEnvio = new JButton("Informacion envio");
		btnInfoEnvio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Informacion_envioController controller = 
						new Informacion_envioController(new Informacion_envioModel(), new Informacion_envioView());
				controller.initController();
			}
		});
		frame.getContentPane().add(btnInfoEnvio);
		
		JButton btnConfirmarEntregas = new JButton("Confirmar entregas");
		btnConfirmarEntregas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConfirmarEntregasController controller = 
						new ConfirmarEntregasController(new ConfirmarEntregasModel(), new ConfirmarEntregasView(), spinnerRepartidor.getValue().toString());
				controller.initController();
			}
		});
		frame.getContentPane().add(btnConfirmarEntregas);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		spinnerRepartidor = new JSpinner();
		spinnerRepartidor.setBounds(370, 11, 55, 20);
		panel.add(spinnerRepartidor);
		
		JLabel IdRepartidor = new JLabel("Id Repartidor");
		IdRepartidor.setBounds(296, 14, 69, 14);
		panel.add(IdRepartidor);
	}

	public JFrame getFrame() { return this.frame; }
}
