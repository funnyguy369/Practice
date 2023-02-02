class My_marks
{
	public static void main(String[]args)
	{   int C_mark=86;
	    int Ai_mark=89;
		int Java_mark=85;
		int Maths_mark=93;
		int Python_mark=91;
		
		System.out.println("i)  My C Mark      : " + C_mark);
		System.out.println("ii) My AI Mark     : " + Ai_mark);
		System.out.println("iii)My Java Mark   : " + Java_mark);
		System.out.println("iv) My Maths Mark  : " + Maths_mark);
		System.out.println("v)  My Python Mark : " + Python_mark);
		
		System.out.println(C_mark + Ai_mark); //175
		System.out.println(Java_mark +Python_mark + " My Marks "); //176
		
		System.out.println("Add AI and Python Mark : " + Ai_mark + Python_mark); // string and integer are not add
		System.out.println("C mark : " + C_mark + " Java Mark : " + Java_mark);
		System.out.println("My Total Mark :" +(C_mark + Ai_mark + Java_mark + Maths_mark + Python_mark ));
		
		
	}
}