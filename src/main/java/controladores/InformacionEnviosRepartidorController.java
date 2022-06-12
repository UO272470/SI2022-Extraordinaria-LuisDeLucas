package controladores;

import javax.swing.table.TableModel;

import giis.demo.util.SwingUtil;
import modelos.InformacionEnviosRepartidorModel;
import modelos.Informacion_envioModel;
import vistas.InformacionEnviosRepartidorView;
import vistas.Informacion_envioView;
import entity.PaqueteEntity;
import entity.ClienteEntity;
import java.util.List;

public class InformacionEnviosRepartidorController {
	private InformacionEnviosRepartidorModel model;
	private InformacionEnviosRepartidorView view;
	private String repartidor;
	
	private boolean sel;
	
	public InformacionEnviosRepartidorController(InformacionEnviosRepartidorModel m,
			InformacionEnviosRepartidorView v, String repartidor) {
		this.model = m;
		this.view = v;
		this.repartidor = repartidor;
		//this.initController();
		this.initView();
	}
	
	public void initController() {
		view.getBtnInfo().addActionListener(e -> SwingUtil.exceptionWrapper(() -> getInfo()));
		
		view.getBtnConfirmar().addActionListener(e -> SwingUtil.exceptionWrapper(() -> cerrar()));
	}

	public void initView() {
		// TODO Auto-generated method stub
		view.getFrame().setVisible(true);
		getRepartos();
	}
	
	public void getRepartos() {
		TableModel tmodel = SwingUtil.getTableModelFromPojos(model.getEntregas(repartidor), new String[] {"idCliente", "idPaquete"});
		view.getTable().setModel(tmodel);
		SwingUtil.autoAdjustColumns(view.getTable());
	}
	
	public void getInfo() {
		String cliente = view.getTable().getModel().getValueAt(0, view.getTable().getSelectedRow()).toString();
		String paquete = view.getTable().getModel().getValueAt(1, view.getTable().getSelectedRow()).toString();
		
		PaqueteEntity InfoPaquete = model.getPaquete(paquete).get(0);
		ClienteEntity InfoCliente = model.getCliente(cliente).get(0);
		
		view.getLblNombre().setText(InfoCliente.getNombre());
		view.getLblDireccion().setText(InfoCliente.getDireccion());
		view.getLblCiudad().setText(InfoCliente.getCiudad());
		view.getLblProvincia().setText(InfoCliente.getProvincia());
		view.getLblPeso().setText(Integer.toString(InfoPaquete.getPeso()));
		view.getLblPrecio().setText(Integer.toString(InfoPaquete.getPrecio()));
	}
	
	public void cerrar() {
		this.initController();
		this.initView();
		view.getFrame().setVisible(false);
	}
}
