package controladores;

import javax.swing.JCheckBox;

import giis.demo.util.SwingUtil;
import modelos.CalculoTarifasModel;
import modelos.ConfirmarEntregasModel;
import vistas.CalculoTarifasView;
import vistas.ConfirmarEntregasView;

public class CalculoTarifasController {
	private CalculoTarifasModel model;
	private CalculoTarifasView view;
	
	private int precio;
	

	
	public CalculoTarifasController(CalculoTarifasView v) {
		//this.model = m;
		this.view = v;
		//this.initController();
		this.initView();
		precio = 0;
	}
	
	public void initController() {
		view.getChckbxMisma().addActionListener(e -> SwingUtil.exceptionWrapper(() -> switchCheck()));
		view.getChckbxDistinta().addActionListener(e -> SwingUtil.exceptionWrapper(() -> switchCheck()));
		view.getBtnCalcular().addActionListener(e -> SwingUtil.exceptionWrapper(() -> calculaPrecio()));
	}

	public void initView() {
		// TODO Auto-generated method stub
		view.getFrame().setVisible(true);


	}
	
	
	private void switchCheck() {
		if(view.getChckbxMisma().isFocusOwner()) {
			view.getChckbxDistinta().setSelected(false);
		}
		else if(view.getChckbxDistinta().isFocusOwner()) {
			view.getChckbxMisma().setSelected(false);
		}
	}
	
	private void calculaPrecio() {
		int peso = Integer.parseInt(view.getTextFieldPeso().getText());
		if(view.getChckbxMisma().isSelected()) {
			if(peso <= 10) {
				precio = (peso * 2) + 3;
			} else {
				precio = peso * 2;
			}
		} else {
			if (view.getTxtProvinciaDestino().getText() == "Canarias" || view.getTxtProvinciaDestino().getText() == "Baleares" || view.getTxtProvinciaOrigen().getText() == "Canarias" || view.getTxtProvinciaOrigen().getText() == "Canarias") {
				precio = peso * 2 + 8;
			} else {
				precio = precio * 2 + 5;
			}
		}
		view.getLblNewLabel_1().setText(Integer.toString(precio));
	}
}
