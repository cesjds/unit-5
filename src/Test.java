import javax.swing.JOptionPane;

public class Test {
	public static void main(String[]args) {


		/*
		String name = "";
		String longestWord = "";
		for(int i = 0; i<5; i++)
		{
			name = JOptionPane.showInputDialog("Enter a word: ");

			if (name.length() > longestWord.length())
				longestWord = name;
			else
				longestWord = longestWord;
		}
		System.out.println(longestWord);


		int num = 0;
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Enter an even integer: "));
		}while (num % 2 != 0);


        for(i = 0; i<10; i++)
            System.out.println(i);



        int sum = 0;;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a positive integer: "));
        while(num >= 0) {
            sum += num;
            num = Integer.parseInt(JOptionPane.showInputDialog("Enter a positive integer: "));

        }
        System.out.println(sum);

		

		int num = 0;
		do{
			num = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer between 1 and 10: "));
		}while (num < 1 || num > 10);
		 
		
		int amountSingle = 0;
		int num = 0;
		num = Integer.parseInt(JOptionPane.showInputDialog("Enter a positive integer: "));
		while (num >= 0) 
		{
			if (num >= 0 && num < 10)
				amountSingle += 1;
			else 
				amountSingle = amountSingle;	
			num = Integer.parseInt(JOptionPane.showInputDialog("Enter a positive integer: "));
		}
		
		System.out.println(amountSingle+" Single digit numbers were entered.");
		
		*/
		
		String bWord = "";
		do {
			bWord = JOptionPane.showInputDialog("Enter a word that starts with 'b' or 'B': ");
			
		}while ((bWord.charAt(0) != 'b') && (bWord.charAt(0) != 'B'));
		System.out.println(bWord);
		
		
		
			
		
				
			
			
			
	}
}

	


