package controladores;

import java.util.ArrayList;
import java.util.List;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import giis.demo.util.SwingMain;
import giis.demo.util.SwingUtil;
import modelos.Informacion_envioModel;
import vistas.Informacion_envioView;
import entity.AlmacenEntity;
import entity.ClienteEntity;
import entity.EntregaEntity;
import entity.RecogeEntity;

public class Informacion_envioController {
	private Informacion_envioModel model;
	private Informacion_envioView view;
	
	private boolean sel;
	private boolean tempsel;
	private String cliente;
	
	public Informacion_envioController(Informacion_envioModel m,
			Informacion_envioView v) {
		this.model = m;
		this.view = v;
		//this.initController();
		this.initView();
	}
	
	public void initController() {
		view.getChckbxCasa().addActionListener(e -> SwingUtil.exceptionWrapper(() -> switchCheck()));
		view.getChckbxOficina().addActionListener(e -> SwingUtil.exceptionWrapper(() -> switchCheck()));
		view.getBtnEnvio().addActionListener(e -> SwingUtil.exceptionWrapper(() -> enviaPaquete()));
		view.getBtnBuscar().addActionListener(e -> SwingUtil.exceptionWrapper(() -> buscarPaquete()));
		view.getBtnModificar().addActionListener(e -> SwingUtil.exceptionWrapper(() -> modificar()));
	}

	public void initView() {
		// TODO Auto-generated method stub
		view.getFrame().setVisible(true);
		getAlmacenes();

	}
	
	
	private void switchCheck() {
		if(view.getChckbxCasa().isFocusOwner()) {
			view.getChckbxOficina().setSelected(false);
			sel = true;
		}
		else if(view.getChckbxOficina().isFocusOwner()) {
			view.getChckbxCasa().setSelected(false);
			sel = false;
		}
	}
	
	private void getAlmacenes() {
		List<AlmacenEntity> almacenes = model.getAlmacen();
		
		for(AlmacenEntity a : almacenes) {
			view.getComboBoxOficina().addItem((Object) a.getNombre());
		}
		
	}
	
	private void enviaPaquete() {
		if(view.getChckbxCasa().isSelected()) {
			model.creapaqueteYcliente(view.getTxtDestinatario().getText(), view.getTxtDireccion().getText(), view.getTxtCiudad().getText(), view.getTxtProvincia().getText(),Integer.parseInt(view.getTextFieldPeso().getText()));
			model.formalizarEnvioCasa(view.getTxtDestinatario().getText(), Integer.parseInt(view.getTextFieldPeso().getText()));
		} else {
			model.creapaqueteYcliente(view.getTxtDestinatario().getText(), view.getTxtDireccion().getText(), view.getTxtCiudad().getText(), view.getTxtProvincia().getText(),Integer.parseInt(view.getTextFieldPeso().getText()));
			String nombreAlmacen = view.getComboBoxOficina().getSelectedItem().toString();
			System.out.println(nombreAlmacen);
			model.formalizarEnvioAlmacen(view.getTxtDestinatario().getText(), Integer.parseInt(view.getTextFieldPeso().getText()), nombreAlmacen);
		}
		
		System.out.println("Paquete enviado");
		this.initController();
		this.initView();
		view.getFrame().setVisible(false);
	}
	
	private void buscarPaquete() {
		tempsel = sel;
		if(sel) {
			List<EntregaEntity> entrega = model.buscarPaqueteCasa(view.getTxtIdpaquete().getText());
			cliente = Integer.toString(entrega.get(0).getIdCliente());

		} else {
			List<RecogeEntity> recogida = model.buscarPaqueteOficina(view.getTxtIdpaquete().getText());
			cliente = Integer.toString(recogida.get(0).getIdCliente());
		}
		
		ClienteEntity info = model.buscarCliente(cliente).get(0);
		
		
		view.getTxtDestinatario().setText(info.getNombre());
		view.getTxtCiudad().setText(info.getCiudad());
		view.getTxtDireccion().setText(info.getDireccion());
		view.getTxtProvincia().setText(info.getProvincia());
	}
	
	private void modificar() {
			model.updateCliente(view.getTxtDestinatario().getText(), view.getTxtDireccion().getText(), view.getTxtCiudad().getText(), view.getTxtProvincia().getText(), cliente);
			if(tempsel == false) {
				model.borraDeposito(view.getTxtIdpaquete().getText());
				model.formalizaEnvioCasaActualiza(view.getTxtIdpaquete().getText(), view.getTxtDestinatario().getText());
			} else {
				String nombreAlmacen = view.getComboBoxOficina().getSelectedItem().toString();
				model.borraEntregaCreaDeposito(view.getTxtIdpaquete().getText(), view.getTxtDestinatario().getText(),  nombreAlmacen);
			}
		}
	
}
