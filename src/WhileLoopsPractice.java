//Yoav Amit
//Period 1
//December 15, 2021

import javax.swing.JOptionPane;

public class WhileLoopsPractice
{
	public static void main(String[]args)
	{
		// 1)
		int num = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer:"));
		while (num >= 0)
		{
			System.out.println(Math.sqrt(num));
			num = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer:"));
		}
		
		// 2)
		char ch = JOptionPane.showInputDialog("Enter a character value:").charAt(0);
		while(ch != '#')
		{
			switch(ch)
			{
			case 'a': System.out.println("vowel"); break;
			case 'e': System.out.println("vowel"); break;
			case 'i': System.out.println("vowel"); break;
			case 'o': System.out.println("vowel"); break;
			case 'u': System.out.println("vowel"); break;
			default: System.out.println("Not a vowel");
			}
			ch = JOptionPane.showInputDialog("Enter a character value:").charAt(0);
		}
	
		// 3)
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer:"));
		while ((0 <= num2) && (num2 <= 255))
		{
			System.out.println((char)num2);
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer:"));
		}
			
	}
}