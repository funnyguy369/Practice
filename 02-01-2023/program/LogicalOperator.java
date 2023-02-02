class LogicalOperator
{
	public static void main(String[]args)
	{
		/*
			Logical Symbols		Meaning
			
			& / &&			Logical AND (If both the condition is true the result will be true)
			| / ||			Logical OR (If any one condition is true the result will be true)
			!				Logical NOT (If the condition is true the result will be false. or Vice-Versa)
			
			&& is a short-circuit operator, but & not.
			It will not check the next logic is True or Not 
			if the before logic is False.
			
			|| is a short-circuit operator, but | not.
			It will check the next logic is True
			if the before logic is False.
		*/

		int a = 100;
		int b = 200;
		int c = 300;

		System.out.println((a < b) && (b > a) && (b < c) && (c == 300));
		                // (100 < 200) || (200 > 100) || (200 < 300) || (300 != 300))
						// (true)      || (true)      || (true)      ||  (true)
						// (true)

		System.out.println((a < b) || (b > a) || (b < c) || (c != 300));
						// (100 < 200) || (200 > 100) || (200 < 300) || (300 != 300))
						// (true)      || (true)      || (true)      ||  (false)
						// (true)

		System.out.println(!(a < a) && !(b == b));
						 //(!(100 < 100) && !(200 == 200));
						 //(!(false) && !(true));
						 //(true && false);
						 //(false);

        System.out.println(!(a < a) || !(b == b));
						 //(!(100 < 100) || !(200 == 200));
						 //(!(false) || !(true));
						 //(true || false);
						 //(true);
        
        System.out.println((b > a) && (b < c) || (c <= a));
                        // (true) && (true) || (false);
                        //     (true)       || (false);
                        //               (true);

	}
}

