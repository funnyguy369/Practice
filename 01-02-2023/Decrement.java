class Decrement
{
	public static void main(String[]args)
	{
		int i=0;
		System.out.println("if i = " + i);
		System.out.println("than i-- : " + i--);// Post Decrement
		System.out.println("than i-- : " + i--);
		System.out.println("than --i : " + --i);// Pre Decrement

		//Examples
		 int value = 10;
		 value = value--;
		 value = value--;
		 value = value--;
		 value = value--;

		 System.out.println("value " + value); 

		 int x = 0;
		 int y=0;
		 y= --x + x + x-- + --x + x-- ;
		   // 3 + 3 + 3   + 5   + 5
		 
		 System.out.println(x); 
		 System.out.println(y); 

		// Example Three
		int a;
		int b = 2;
		//						iteratio		1	2	3	4	5	6
		for (a = 0; a > -5; a--) { // 		a 	0	-1	-2	-3	-4	-5
			b = a + --b;    // 				b 	1	-1	-4	-8	-13
		}

		System.out.println(a);
		System.out.println(b);


	}
}