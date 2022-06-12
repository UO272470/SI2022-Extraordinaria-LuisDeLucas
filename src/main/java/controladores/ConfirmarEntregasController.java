package controladores;

import java.util.List;

import entity.DepositadoEntity;
import entity.EntregaEntity;
import giis.demo.util.SwingUtil;
import modelos.ConfirmarEntregasModel;
import modelos.Informacion_envioModel;
import vistas.ConfirmarEntregasView;
import vistas.Informacion_envioView;

public class ConfirmarEntregasController {
	private ConfirmarEntregasModel model;
	private ConfirmarEntregasView view;
	
	private String repartidor;
	private int nEntregas = 0;
	
	public ConfirmarEntregasController(ConfirmarEntregasModel m,
			ConfirmarEntregasView v, String repartidor) {
		this.model = m;
		this.view = v;
		this.repartidor = repartidor;
		//this.initController();
		this.initView();
	}
	
	public void initController() {
		view.getChckbxFallida().addActionListener(e -> SwingUtil.exceptionWrapper(() -> switchCheck()));
		view.getChckbxConfirmada().addActionListener(e -> SwingUtil.exceptionWrapper(() -> switchCheck()));
		view.getBtnConfirmar().addActionListener(e -> SwingUtil.exceptionWrapper(() -> Confirmar()));
	}

	public void initView() {
		// TODO Auto-generated method stub
		view.getFrame().setVisible(true);
		setRepartos();

	}
	
	
	private void switchCheck() {
		if(view.getChckbxFallida().isFocusOwner()) {
			view.getChckbxConfirmada().setSelected(false);
		}
		else if(view.getChckbxConfirmada().isFocusOwner()) {
			view.getChckbxFallida().setSelected(false);
		}
	}
	
	private void setRepartos() {
		List<EntregaEntity> entregas = model.getEntregas(repartidor);
		List<DepositadoEntity> depositos = model.getDepositos(repartidor);
		for (EntregaEntity e: entregas) {
			view.getComboBox().addItem((Object) e.getIdPaquete());
			nEntregas++;
		}
		for (DepositadoEntity e: depositos) {
			view.getComboBox().addItem((Object) e.getIdPaquete());
		}
	}
	
	
	private void Confirmar() {
		int seleccionado = view.getComboBox().getSelectedIndex();
		
		System.out.println(view.getComboBox().getSelectedItem().toString());
		if(view.getChckbxConfirmada().isSelected()) {
			if(nEntregas - seleccionado >= 0) {
				model.entregadoExito(view.getComboBox().getSelectedItem().toString());
			} else {
				model.depositoExito(view.getComboBox().getSelectedItem().toString());
			}
			
		} else if(view.getChckbxFallida().isSelected()) {
			if(nEntregas - seleccionado >= 0) {
				model.entregadoFallido(view.getComboBox().getSelectedItem().toString());
			} 
		}
		
		this.initController();
		this.initView();
		view.getFrame().setVisible(false);
	}
	
}
