public class ForLoopPractice
{
	public static void main(String[]args)
	{
		// a)
		System.out.println("a)");
		for (int i = 0; i <= 5; i++)
			System.out.println(i+" ");
		System.out.println();
		
		// b)
		System.out.println("b)");
		for (int i = 5; i >= 0; i--)
			System.out.println(i+" ");
		System.out.println();
		
		// c) [N/A Print]
		System.out.println("c)");
		for (int i = 5; i < 0; i--)
			System.out.println(i+" ");
		System.out.println();
		
		// d)
		System.out.println("d)");
		for (int i = 0; i < 10; i += 2)
			System.out.println(i+" ");
		System.out.println();
		
		// e) [INFINITE LOOP]
		//System.out.println("d)");
		//for (int i = 10; i >= 10; i ++)
		//	System.out.println(i+" ");
		//System.out.println();
		
		// f)
		System.out.println("f)");
		for (int i = 15; i >= 0; i -= 3)
			System.out.println(i+" ");
		System.out.println();
		
		// g)
		System.out.println("g)");
		for (char c = 'a'; c <= 'z'; c += 1)
			System.out.print(c + " ");
		System.out.println();
		
		for(int i = 0; i <= 10; i++)
			System.out.println(i);
		
		
		
		
	}
}