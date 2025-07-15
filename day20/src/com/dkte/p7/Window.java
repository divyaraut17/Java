package com.dkte.p7;
//for Table

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class Window extends JFrame{
	JTable productTable;
	JScrollPane scrollPane;
	
    public Window() {
    	super("Table");
    	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	this.setLayout(null);
    	
    	Object[] colnames = {"pid","pName","Price"};
    	
    	//Model
    	DefaultTableModel defaultTableModel = new DefaultTableModel(colnames ,0);
    	defaultTableModel.addRow(new Object[] {1,"pen",10});
    	defaultTableModel.addRow(new Object[] {2,"pencile",5});
    	defaultTableModel.addRow(new Object[] {3,"Book",50});
    	defaultTableModel.addRow(new Object[] {4,"Eraser",5});
    	defaultTableModel.addRow(new Object[] {5,"Ruler",5});
    	defaultTableModel.addRow(new Object[] {6,"Shapner",7});
    	defaultTableModel.addRow(new Object[] {7,"NoteBook",20});
    	defaultTableModel.addRow(new Object[] {8,"Pad",50});
    	
    	//view
    	productTable = new JTable(defaultTableModel);
    	//productTable.setBounds(50,50,200,200);
    	//this.add(productTable);
    	
    	scrollPane= new JScrollPane(productTable);
    	scrollPane.setBounds(50,50,200,120);
    	this.add(scrollPane);
    	
    	//controller
    	ListSelectionModel listSelectionModel = productTable.getSelectionModel();
    	listSelectionModel.addListSelectionListener(e -> {
    		if(e.getValueIsAdjusting()) {
    			int row = productTable.getSelectedRow();
    		    System.out.println("Row selected - "+row);
    		    System.out.println("pid - "+productTable.getValueAt(row, 0));
    		    System.out.println("pNmae - "+productTable.getValueAt(row, 1));
    		    System.out.println("Price - "+productTable.getValueAt(row, 2));
    		}
    			
    		    
    	});
    }
}
