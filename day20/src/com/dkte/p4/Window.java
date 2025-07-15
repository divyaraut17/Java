package com.dkte.p4;
//For Radio Buttons

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JFrame;

public class Window extends JFrame{
	JLabel labelGender;
	JRadioButton radioButtonMale;
	JRadioButton radioButtonFemale;
	ButtonGroup radiogroup; //use for choose only one option out of 2
	
    public Window() {
    	super("RadioButton");
    	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	this.setLayout(null);
    	
    	labelGender = new JLabel("Gender:");
    	radioButtonMale = new JRadioButton("Male");
    	radioButtonFemale = new JRadioButton("Female");
    	
    	labelGender.setBounds(50,50,80,30);
    	radioButtonMale.setBounds(140,50,80,30);
    	radioButtonFemale.setBounds(230,50,80,30);
    	
    	//for choosing one option
    	radiogroup = new ButtonGroup();
    	radiogroup.add(radioButtonMale);
        radiogroup.add(radioButtonFemale);
        
        
    	this.add(labelGender);
    	this.add(radioButtonMale);
    	this.add(radioButtonFemale);
    	
    	radioButtonMale.addChangeListener(e -> {
    		if(radioButtonMale.isSelected())
    		System.out.println("Male is Clicked");
    	});
    	
    	radioButtonFemale.addChangeListener(e -> {
    		if(radioButtonFemale.isSelected())
    			System.out.println("Female is clicked");
    	});
    }
}
