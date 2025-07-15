package com.dkte.p6;
//for List Box

import javax.swing.JFrame;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;


public class Window extends JFrame{
	JList<String> listBox;
	JScrollPane scrollPane;
	
    public Window() {
    	super("ListBox");
    	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	this.setLayout(null);
    	
    	//Model
    	DefaultListModel<String> defaultListModel=new DefaultListModel<>();
    	defaultListModel.addElement("Idli");
    	defaultListModel.addElement("vada");
        defaultListModel.addElement("Dosa");
        defaultListModel.addElement("Poha");
        defaultListModel.addElement("Upma");
        defaultListModel.addElement("Samosa");
        defaultListModel.addElement("Kachori");

    	
    	//view
    	listBox = new JList<>(defaultListModel);
    	//listBox.setBounds(50,50,80,30);
    	//this.add(listBox);
    	
    	scrollPane=new JScrollPane(listBox);
    	scrollPane.setBounds(50,50,80,30);
    	this.add(scrollPane);
    	
    	//Controller
    	listBox.addListSelectionListener(e -> {
    		if(e.getValueIsAdjusting())
    		System.out.println(listBox.getSelectedValuesList());
    	});
    }
}
