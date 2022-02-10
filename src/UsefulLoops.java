import javax.swing.JOptionPane;

//Yoav Amit
//Period 1
//January 12, 2022

public class UsefulLoops
{
	public static void main(String[]args)
	{
		
		// A)
		
		int iNum = 0;
		int evenCounter = 0;
		int oddCounter = 0;
		
		for (int i = 0; i < 7; i++)
		{
			iNum = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer:"));
			if (iNum % 2 == 0)
				evenCounter += 1;
			else
				oddCounter += 1;
		}
		
		System.out.println("There are " + evenCounter + " even numbers.");
		System.out.println("There are " + oddCounter + " odd numbers.");
		
		
		// B)
		
		char ch = JOptionPane.showInputDialog("Enter a upper case character:").charAt(0);
		String name;
		int matchCounter = 0;
		int noMatchCounter = 0;
		do {
			name = JOptionPane.showInputDialog("Enter a name:");
			if (name.charAt(0) == ch)
				matchCounter += 1;
			else 
				noMatchCounter += 1;
			
		} while (name.charAt(0) != '#');
		 
		System.out.println("There are " + matchCounter + " matching names.");
		System.out.println("There are " + noMatchCounter + " non matching names.");
		
		
		// C)
		
		int sum = 0;
		double counter = 0;
		int iNum2 = Integer.parseInt(JOptionPane.showInputDialog("Enter a positive integer: (Enter 0 or a negative number to stop)"));
		
		while (iNum2 > 0)
		{	
			sum = sum + iNum2;
			counter += 1;
			iNum2 = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer: (Enter 0 or a negative number to stop)"));

		} 
		
		System.out.println("The average is " + sum/counter);
		
		
		// D)
		
		String ascii = JOptionPane.showInputDialog("Enter a string and I will find the ASCII sum of it: ");
		int stringLen = ascii.length();
		int checkCount = 0;
		int sum2 = 0;
		char asciiValue;
		
		
		for (int i2 = 0; i2 < stringLen; i2 ++)
		{
			asciiValue = ascii.charAt(checkCount);
			sum2 = sum2 + (int)asciiValue;
			checkCount += 1;	
		}
		
		System.out.println("The ASCII sum of this string is: " + sum2);
		
			
			
			
				

	}
}