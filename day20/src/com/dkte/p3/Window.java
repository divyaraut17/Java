package com.dkte.p3;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Window extends JFrame{
	JLabel labelName;
	JTextField textName;
	JButton saveButton;
	
    public Window() {
    	this.setTitle("Label and TextField");
    	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	this.setLayout(null);
    	
    	labelName = new JLabel("Name:");
    	textName =new JTextField();
    	
    	labelName.setBounds(50, 50, 80, 30);
    	textName.setBounds(120, 50, 100, 30);
    	
    	this.add(labelName);
    	this.add(textName);
    	
    	saveButton =new JButton("Save");
    	saveButton.setBounds(100, 120, 100, 30);
    	this.add(saveButton);
    	
    	
    	saveButton.addActionListener(e -> {
    		System.out.println("Name -" +textName.getText());
    		textName.setText("");
    	});
    
    }
}
