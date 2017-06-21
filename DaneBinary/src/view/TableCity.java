package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Place;

/**
 * 
 * @author David guio
 *
 */
public class TableCity extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JTable table;
	private DefaultTableModel defaultTableModel;
	private JScrollPane scrollPane;
	
	public TableCity(){
	this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		defaultTableModel = new DefaultTableModel();
//		defaultTableModel.addColumn("id");
		addColum();
		
		table = new JTable();
		table.setModel(defaultTableModel);
		table.getTableHeader().setReorderingAllowed(false);
		table.getTableHeader().setBackground(Color.BLUE);
		table.getTableHeader().setForeground(Color.white);
		table.setBackground(Color.white);
		table.setBorder(null);
		
		
		scrollPane = new JScrollPane(table);
		scrollPane.setForeground(Color.WHITE);
		scrollPane.setBorder(null);
		scrollPane.setAlignmentX(Component.CENTER_ALIGNMENT); // centrado de la tabla
		this.add(scrollPane, BorderLayout.PAGE_END);
		this.setBorder(null);
	}
	
	/**
	 * Agrega el nombre de las columnas de la tabla
	 */
	
	private void addColum() {
		String[] colum = new String[]{Constant.ID_DEPARTMENT,Constant.NAME_DEPARTMENT,Constant.ID_CITY,Constant.NAME_CITY};
		defaultTableModel.setColumnIdentifiers(colum);
	}
	/**
	 * agrego el archivo leido con sus parametros a la tabla
	 * @param site
	 */
	public void addplace(Place place) {
		String[] vectorSite = { ""+place.getDepartamentCode(), place.getNameDepartment(), ""+place.getCityCode(), place.getCityName()};
		defaultTableModel.addRow(vectorSite);
	}
	/**
	 * agrego una lista de archivos a la tabla
	 * @param place
	 */
	public void addListPlace(ArrayList<Place> place){
		for (int i = 0; i < place.size(); i++) {
			String []rowdata = { ""+place.get(i).getDepartamentCode(), place.get(i).getNameDepartment(), ""+place.get(i).getCityCode(), place.get(i).getCityName()};
			defaultTableModel.addRow(rowdata);
		}
	}
}