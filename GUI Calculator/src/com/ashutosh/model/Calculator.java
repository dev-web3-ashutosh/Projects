package com.ashutosh.model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Calculator {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextArea textArea = new JTextArea(2,11);
	
	JButton button0 = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	
	JButton buttonAdd = new JButton();
	JButton buttonSub = new JButton();
	JButton buttonMul = new JButton();
	JButton buttonDiv = new JButton();
	JButton buttonClear = new JButton();
	JButton buttonDot = new JButton();
	JButton buttonEqual = new JButton();
	
	double num1, num2, result;
	int addc=0, subc=0, mulc=0, divc=0;
	
	public Calculator() {
		frame.setSize(340, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Calculator");
		
		//frame.setResizable(false);
		frame.add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		Border border = BorderFactory.createLineBorder(Color.BLACK, 2, true);
		panel.setBorder(border);
		
		panel.add(textArea);
		textArea.setBackground(Color.BLACK);
		Border tBorder = BorderFactory.createLineBorder(Color.WHITE, 2);
		textArea.setBorder(tBorder);
		Font font = new Font("arial",Font.BOLD,30);
		textArea.setFont(font);
		textArea.setForeground(Color.WHITE);
		
		textArea.setPreferredSize(new Dimension(2,11));
		textArea.setLineWrap(true);
	}

}
