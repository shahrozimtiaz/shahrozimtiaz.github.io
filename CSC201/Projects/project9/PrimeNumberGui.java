
package project9;

import javax.swing.*;



import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberGui extends JPanel
{
	JPanel titlePanel = new JPanel();
	JPanel uselessPanel = new JPanel();
	
	JPanel promptPanel = new JPanel();
	
	
	JPanel evaluateButtonPanel = new JPanel();
	
	JPanel answerPanel1 = new JPanel();
	
	

	JLabel titleLabel = new JLabel();
	JLabel uselessLabel = new JLabel();
	
	JLabel promptLabel = new JLabel();
	
	
	JLabel evaluateLabel = new JLabel();
	
	JLabel answerLabel1 = new JLabel();
	
	
	JButton evaluateButton = new JButton();

	JTextField inputTextField = new JTextField(10);
	

	public PrimeNumberGui()
	{

		titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		uselessPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//promptPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		evaluateButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		answerPanel1.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		Font quizBigFont = new Font("Helvetica Bold", Font.BOLD, 30);
		Font quizMidFont = new Font("Helvetica Bold", Font.BOLD, 20);
		Font quizSmallFont = new Font("Helvetica Bold", Font.BOLD, 15);
		titleLabel.setFont(quizBigFont);
		
		titleLabel.setForeground(Color.black);
		
		uselessLabel.setFont(quizMidFont);
		
		promptLabel.setFont(quizMidFont);
		promptLabel.setForeground(Color.black);

		
		evaluateLabel.setFont(quizSmallFont);
		
		answerLabel1.setFont(quizMidFont);
		answerLabel1.setForeground(Color.white);


		titleLabel.setText("Prime Number GUI");
		uselessLabel.setText("1-800-HOTLINEBLING");
		uselessLabel.setForeground(Color.WHITE);
		
		promptLabel.setText("Please enter a Number to determine if it's prime");
		
		
		evaluateButton.setFont(quizBigFont);
		evaluateButton.setText("   Evaluate   ");
		
		evaluateButton.setBackground(Color.CYAN);
		
		//answerLabel.setText("");
		evaluateButton.addActionListener(new evaluateButton());
		inputTextField.addActionListener(new evaluateButton());

		
		titlePanel.add(titleLabel);
		
		titlePanel.setBackground(Color.pink);

		
		uselessPanel.add(uselessLabel);
		uselessPanel.setBackground(Color.pink);

		
		promptPanel.add(promptLabel);
		promptPanel.add(inputTextField);
		
		promptPanel.setBackground(Color.pink);

		evaluateButtonPanel.add(evaluateButton);
		
		evaluateButtonPanel.setBackground(Color.pink);

		answerPanel1.add(answerLabel1);
		
		answerPanel1.setBackground(Color.pink);


		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(titlePanel);
		add(uselessPanel);
		
		add(promptPanel);
		
		
		add(evaluateButtonPanel);
		add(answerPanel1);
		

	}// constructor
	 
	public void display()
	{	
		JFrame theFrame = new JFrame("GUI Example");
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theFrame.setContentPane(this);
		theFrame.setPreferredSize(new Dimension(800, 500));
		theFrame.pack();
		theFrame.setVisible(true);
		//theFrame.setLocation(600, 200);
	}
	class evaluateButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			boolean primeNum1 = true;

			List<Integer> primeFactors;
			String answer;

			primeFactors = new ArrayList<Integer>();

			answer = "Prime";

			int	num = Integer.parseInt(inputTextField.getText());;		

			if(num<2)
			{
				System.out.println("lowest prime number is 2 \n BYE BYE BYE");
				System.exit(0);
			}
////////////////////////////////////////////////////////////////////////////////////////////
			for(int i=2;i*i<=num;i++)
			{ 

				if(num % i == 0) // big if
				{
					answer = "Not prime";

					for(int x=2;x*x<=i;x++)
					{

						if(i % x ==0)
						{
							primeNum1 = false;
						}

					}
					if(primeNum1)
					{
						primeFactors.add(i);
					}
					num = num/i;
					i=1;				
				}
			}
			primeFactors.add(num);
			
			answerLabel1.setText(answer);

			if(answer.equals("Not prime"))
			{

				answer = "Not Prime...Prime Factors Are: ";
				//answerLabel1.setText(answer);
					
					for(int i=0;i<=primeFactors.size()-1;i++)
					{
						int temp = primeFactors.get(i);
						answer += temp;
						if(i<primeFactors.size()-1)
						{
							answer += ", ";
						}
					}
					answerLabel1.setText(answer);
				}
			
		}//actionPerformed
	}//method

	public static void main(String[] args) throws IOException
	  {
		PrimeNumberGui gameGUI = new PrimeNumberGui();
	    gameGUI.display();

	  }
}

