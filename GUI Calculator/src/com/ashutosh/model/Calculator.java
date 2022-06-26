package com.ashutosh.model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
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
		
		button1.setPreferredSize(new Dimension(90,40));
		button1.setIcon(new ImageIcon("C:\\Users\\ashut\\eclipse-workspace\\Projects\\GUI Calculator\\Caculator Buttons\\button1.png"));
		
		button2.setPreferredSize(new Dimension(90,40));
		button2.setIcon(new ImageIcon("C:\\Users\\ashut\\eclipse-workspace\\Projects\\GUI Calculator\\Caculator Buttons\\button2.png"));
		
		button3.setPreferredSize(new Dimension(90,40));
		button3.setIcon(new ImageIcon("C:\\Users\\ashut\\eclipse-workspace\\Projects\\GUI Calculator\\Caculator Buttons\\button3.png"));
		
		button4.setPreferredSize(new Dimension(90,40));
		button4.setIcon(new ImageIcon("C:\\Users\\ashut\\eclipse-workspace\\Projects\\GUI Calculator\\Caculator Buttons\\button4.png"));
		
		button5.setPreferredSize(new Dimension(90,40));
		button5.setIcon(new ImageIcon("C:\\Users\\ashut\\eclipse-workspace\\Projects\\GUI Calculator\\Caculator Buttons\\button5.png"));
		
		button6.setPreferredSize(new Dimension(90,40));
		button6.setIcon(new ImageIcon("C:\\Users\\ashut\\eclipse-workspace\\Projects\\GUI Calculator\\Caculator Buttons\\button6.png"));
		
		button7.setPreferredSize(new Dimension(90,40));
		button7.setIcon(new ImageIcon("C:\\Users\\ashut\\eclipse-workspace\\Projects\\GUI Calculator\\Caculator Buttons\\button7.png"));
		
		button8.setPreferredSize(new Dimension(90,40));
		button8.setIcon(new ImageIcon("C:\\Users\\ashut\\eclipse-workspace\\Projects\\GUI Calculator\\Caculator Buttons\\button8.png"));
		
		button9.setPreferredSize(new Dimension(90,40));
		button9.setIcon(new ImageIcon("C:\\Users\\ashut\\eclipse-workspace\\Projects\\GUI Calculator\\Caculator Buttons\\button9.png"));
		
		button0.setPreferredSize(new Dimension(90,40));
		button0.setIcon(new ImageIcon("C:\\Users\\ashut\\eclipse-workspace\\Projects\\GUI Calculator\\Caculator Buttons\\button0.png"));
		
		buttonAdd.setPreferredSize(new Dimension(90,40));
		buttonAdd.setIcon(new ImageIcon("C:\\Users\\ashut\\eclipse-workspace\\Projects\\GUI Calculator\\Caculator Buttons\\buttonadd.png"));
		
		buttonSub.setPreferredSize(new Dimension(90,40));
		buttonSub.setIcon(new ImageIcon("C:\\Users\\ashut\\eclipse-workspace\\Projects\\GUI Calculator\\Caculator Buttons\\buttonsub.png"));
		
		buttonMul.setPreferredSize(new Dimension(90,40));
		buttonMul.setIcon(new ImageIcon("C:\\Users\\ashut\\eclipse-workspace\\Projects\\GUI Calculator\\Caculator Buttons\\buttonmul.png"));
		
		buttonDiv.setPreferredSize(new Dimension(90,40));
		buttonDiv.setIcon(new ImageIcon("C:\\Users\\ashut\\eclipse-workspace\\Projects\\GUI Calculator\\Caculator Buttons\\buttondiv.png"));
		
		buttonClear.setPreferredSize(new Dimension(90,40));
		buttonClear.setIcon(new ImageIcon("C:\\Users\\ashut\\eclipse-workspace\\Projects\\GUI Calculator\\Caculator Buttons\\buttonclear.png"));
		
		buttonDot.setPreferredSize(new Dimension(90,40));
		buttonDot.setIcon(new ImageIcon("C:\\Users\\ashut\\eclipse-workspace\\Projects\\GUI Calculator\\Caculator Buttons\\buttondot.png"));
		
		buttonEqual.setPreferredSize(new Dimension(90,40));
		buttonEqual.setIcon(new ImageIcon("C:\\Users\\ashut\\eclipse-workspace\\Projects\\GUI Calculator\\Caculator Buttons\\buttonequal.png"));
		
		panel.add(button0);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(buttonAdd);
		panel.add(buttonSub);
		panel.add(buttonMul);
		panel.add(buttonDiv);
		panel.add(buttonClear);
		panel.add(buttonDot);
		panel.add(buttonEqual);
		
		
		
	}

}
