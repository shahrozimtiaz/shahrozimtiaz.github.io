
package project4;

import javax.swing.*;



import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PolynomialGui extends JPanel
{
	JPanel titlePanel = new JPanel();
	JPanel questionPanel = new JPanel();
	
	JPanel coefficientPanel5 = new JPanel();
	JPanel coefficientPanel4 = new JPanel();
	JPanel coefficientPanel3 = new JPanel();
	JPanel coefficientPanel2 = new JPanel();
	JPanel coefficientPanel1 = new JPanel();
	JPanel coefficientPanel0 = new JPanel();
	
	JPanel evaluateButtonPanel = new JPanel();
	
	JPanel answerPanel1 = new JPanel();
	JPanel answerPanel2 = new JPanel();
	JPanel answerPanel3 = new JPanel();
	JPanel answerPanel4 = new JPanel();
	JPanel answerPanel5 = new JPanel();
	

	JLabel titleLabel = new JLabel();
	JLabel questionLabel = new JLabel();
	
	JLabel coefficientLabel5 = new JLabel();
	JLabel coefficientLabel4 = new JLabel();
	JLabel coefficientLabel3 = new JLabel();
	JLabel coefficientLabel2 = new JLabel();
	JLabel coefficientLabel1 = new JLabel();
	JLabel coefficientLabel0 = new JLabel();	
	
	JLabel evaluateLabel = new JLabel();
	
	JLabel answerLabel1 = new JLabel();
	JLabel answerLabel2 = new JLabel();
	JLabel answerLabel3 = new JLabel();
	JLabel answerLabel4 = new JLabel();
	JLabel answerLabel5 = new JLabel();

	
	JButton evaluateButton = new JButton();

	JTextField inputTextField5 = new JTextField(5);
	JTextField inputTextField4 = new JTextField(5);
	JTextField inputTextField3 = new JTextField(5);
	JTextField inputTextField2 = new JTextField(5);
	JTextField inputTextField1 = new JTextField(5);
	JTextField inputTextField0 = new JTextField(5);

	public PolynomialGui()
	{

		titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		questionPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		coefficientPanel5.setLayout(new FlowLayout(FlowLayout.LEFT));
		coefficientPanel4.setLayout(new FlowLayout(FlowLayout.LEFT));
		coefficientPanel3.setLayout(new FlowLayout(FlowLayout.LEFT));
		coefficientPanel2.setLayout(new FlowLayout(FlowLayout.LEFT));
		coefficientPanel1.setLayout(new FlowLayout(FlowLayout.LEFT));
		coefficientPanel0.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		evaluateButtonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		answerPanel1.setLayout(new FlowLayout(FlowLayout.CENTER));
		answerPanel2.setLayout(new FlowLayout(FlowLayout.CENTER));
		answerPanel3.setLayout(new FlowLayout(FlowLayout.CENTER));
		answerPanel4.setLayout(new FlowLayout(FlowLayout.CENTER));
		answerPanel5.setLayout(new FlowLayout(FlowLayout.CENTER));

		Font quizBigFont = new Font("Helvetica Bold", Font.BOLD, 30);
		Font quizMidFont = new Font("Helvetica Bold", Font.BOLD, 20);
		Font quizSmallFont = new Font("Helvetica Bold", Font.BOLD, 15);
		titleLabel.setFont(quizBigFont);
		questionLabel.setFont(quizMidFont);
		
		coefficientLabel5.setFont(quizMidFont);
		coefficientLabel4.setFont(quizMidFont);
		coefficientLabel3.setFont(quizMidFont);
		coefficientLabel2.setFont(quizMidFont);
		coefficientLabel1.setFont(quizMidFont);
		coefficientLabel0.setFont(quizMidFont);
		
		evaluateLabel.setFont(quizSmallFont);
		
		answerLabel1.setFont(quizMidFont);
		answerLabel2.setFont(quizMidFont);
		answerLabel3.setFont(quizMidFont);
		answerLabel4.setFont(quizMidFont);
		answerLabel5.setFont(quizMidFont);


		titleLabel.setText("Polynomial GUI");
		questionLabel.setText("Please enter a Polynomial");
		
		coefficientLabel5.setText("Please Enter The 5th Coefficient:");
		coefficientLabel4.setText("Please Enter The 4th Coefficient:");
		coefficientLabel3.setText("Please Enter The 3rd Coefficient:");
		coefficientLabel2.setText("Please Enter The 2nd Coefficient:");
		coefficientLabel1.setText("Please Enter The 1st Coefficient:");
		coefficientLabel0.setText("Please Enter The 0 Coefficient:");
		
		evaluateButton.setFont(quizBigFont);
		evaluateButton.setText("   Evaluate   ");
		
		//answerLabel.setText("");
		evaluateButton.addActionListener(new evaluateButton());
		
		
		titlePanel.add(titleLabel);
		questionPanel.add(questionLabel);
		
		coefficientPanel5.add(coefficientLabel5);
		coefficientPanel5.add(inputTextField5);

		coefficientPanel4.add(coefficientLabel4);
		coefficientPanel4.add(inputTextField4);

		coefficientPanel3.add(coefficientLabel3);
		coefficientPanel3.add(inputTextField3);
		
		coefficientPanel2.add(coefficientLabel2);
		coefficientPanel2.add(inputTextField2);
		
		coefficientPanel1.add(coefficientLabel1);
		coefficientPanel1.add(inputTextField1);
		
		coefficientPanel0.add(coefficientLabel0);
		coefficientPanel0.add(inputTextField0);
		
		evaluateButtonPanel.add(evaluateButton);
		
		answerPanel1.add(answerLabel1);
		answerPanel2.add(answerLabel2);
		answerPanel3.add(answerLabel3);
		answerPanel4.add(answerLabel4);
		answerPanel5.add(answerLabel5);

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(titlePanel);
		add(questionPanel);
		
		add(coefficientPanel5);
		add(coefficientPanel4);
		add(coefficientPanel3);
		add(coefficientPanel2);
		add(coefficientPanel1);
		add(coefficientPanel0);
		
		add(evaluateButtonPanel);
		add(answerPanel1);
		add(answerPanel2);
		add(answerPanel3);
		add(answerPanel4);
		add(answerPanel5);

	}// constructor
	 
	public void display()
	{	
		JFrame theFrame = new JFrame("GUI Example");
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theFrame.setContentPane(this);
		theFrame.setPreferredSize(new Dimension(800, 500));
		theFrame.pack();
		theFrame.setVisible(true);
	}
	class evaluateButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double[] poly;
			poly = read();
			bisection(poly);
		}
	}
	private double[] read()
	{
		double[] poly = new double[6];
		
		poly[0] = Double.parseDouble(inputTextField5.getText());;
		poly[1] = Double.parseDouble(inputTextField4.getText());;
		poly[2] = Double.parseDouble(inputTextField3.getText());;
		poly[3] = Double.parseDouble(inputTextField2.getText());;
		poly[4] = Double.parseDouble(inputTextField1.getText());;
		poly[5] = Double.parseDouble(inputTextField0.getText());;
		
		return poly;
	}
	private void bisection(double[] poly)
	{
		double ub = 0;
		double lb = 0;
		double c =0;
		int i =0;
		
		for(double a=-10; a<10; a = a + .1)
		{
			double b = a + .1;
			
			double ya = evaluate(poly,a);
			double yb = evaluate(poly,b);
			
			if(ya>0 && yb<0)
			{
				ub = a;
				lb = b;
				
				c = (ub + lb)/2;;
				while(evaluate(poly,c) > (0 + .0000001) || evaluate(poly,c) < (0 - .0000001))
				{
					if(evaluate(poly,c) > 0)
					{
						ub = c;
						c = (ub + lb)/2;
					}
					else if(evaluate(poly,c) < 0)
					{
						lb = c;
						c = (lb + ub)/2;
					}
					
				}
				i++;
				switch(i)
				{
					case 1: 
						String stringNumber = "" + c;
						answerLabel1.setText("Root is: " + stringNumber);
						break;
					case 2:
						stringNumber = "" + c;
						answerLabel2.setText("Root is: " + stringNumber);
						break;
					case 3:
						stringNumber = "" + c;
						answerLabel3.setText("Root is: " + stringNumber);
						break;
					case 4:
						stringNumber = "" + c;
						answerLabel4.setText("Root is: " + stringNumber);
						break;
					case 5:
						stringNumber = "" + c;
						answerLabel5.setText("Root is: " + stringNumber);
						break;
				}			}
			else if(ya<0 && yb>0)
			{
				ub = b;
				lb = a;
				
				c = (ub + lb)/2;;
				while(evaluate(poly,c) > (0 + .0000001) || evaluate(poly,c) < (0 - .0000001))
				{
					if(evaluate(poly,c) > 0)
					{
						ub = c;
						c = (c + lb)/2;
					}
					else if(evaluate(poly,c) < 0)
					{
						lb = c;
						c = (c + ub)/2;
					}	
				}
				i++;
				switch(i)
				{
					case 1: 
						String stringNumber = "" + c;
						answerLabel1.setText("Root is: " + stringNumber);
						break;
					case 2:
						stringNumber = "" + c;
						answerLabel2.setText("Root is: " + stringNumber);
						break;
					case 3:
						stringNumber = "" + c;
						answerLabel3.setText("Root is: " + stringNumber);
						break;
					case 4:
						stringNumber = "" + c;
						answerLabel4.setText("Root is: " + stringNumber);
						break;
					case 5:
						stringNumber = "" + c;
						answerLabel5.setText("Root is: " + stringNumber);
						break;
				}
			}
		}//Loop

	}
	private static double evaluate(double[] poly, double x)
	{
		double y = (poly[0] * Math.pow(x,5)) + (poly[1] * Math.pow(x,4)) + (poly[2] * Math.pow(x,3)) + (poly[3] * Math.pow(x,2)) + (poly[4] * Math.pow(x,1)) + (poly[5]);

		return y;
	}
	public static void main(String[] args) throws IOException
	  {
		PolynomialGui gameGUI = new PolynomialGui();
	    gameGUI.display();

	  }
}