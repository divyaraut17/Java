package com.dkte.p5;

import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class Window extends JFrame{
	JComboBox<String> comboBox;
	
    public Window() {
    	super("ComboBox");
    	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	this.setLayout(null);
    	
    	String[] arr = {"C","Cpp","JAVA","Python"};
    	
    	//Model
    	DefaultComboBoxModel<String> defaultComboBoxModel = new DefaultComboBoxModel<>(arr);
    	//view
    	comboBox = new JComboBox<>(defaultComboBoxModel);
    	comboBox.setBounds(50,50,80,30);
    	this.add(comboBox);
    	
    	//Controller
    	comboBox.addItemListener(e -> {
    		System.out.println("Fav Language - "+comboBox.getSelectedItem());
    	});
    }
}
