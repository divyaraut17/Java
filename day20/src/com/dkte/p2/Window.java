package com.dkte.p2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Window extends JFrame{
	JButton submitButton;
	JButton cancelButton;
	
    public Window() {
    	this.setTitle("Component");
    	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	this.setLayout(null);//do not apply an layout
    	
    	submitButton = new JButton("Submit"); //it create the new button component
    	submitButton.setBounds(50,50,80,30);//add bounds to button
    	this.add(submitButton);
    	 
    	//for cancel button
    	  cancelButton = new JButton("Cancel");
    	  cancelButton.setBounds(150,50,80,30);
    	  this.add(cancelButton);
    	//for click
    	submitButton.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			System.out.println("Submit Button Clicked");
    		}
    	});
    	//for click cancel
    	cancelButton.addActionListener(e -> {
    		System.out.println("Cancel Button Clicked");
    	});
    }
}
