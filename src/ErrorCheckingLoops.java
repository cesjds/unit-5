//Yoav Amit
//Period 1
//December 15, 2021

import javax.swing.JOptionPane;

public class ErrorCheckingLoops
{
	public static void main(String[]args)
	{
		// A)
		char ch;
		do {
			ch = JOptionPane.showInputDialog("Enter a lower case letter:").charAt(0);
		} while (ch > 122 || ch < 97);
		System.out.println(ch);
		
		// B)
		int num1;
		do {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a negative integer:"));
		} while (num1 >= 0);
		System.out.println(num1);
		
		// C)
		int num2;
		do {
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter an even number:"));
		} while ((num2 % 2 == 1) || (num2 % 2 == -1));
		System.out.println(num2);
		
	}
}