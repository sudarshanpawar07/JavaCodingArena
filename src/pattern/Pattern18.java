package pattern;

class Pattern18
{
	public static void main(String [] args)
	{
		char ch = 'A';
		int n = 5;
		for(int i = 0;i < n;i++)
		{
			for(int j = 0;j < n; j++)
			{	
			 	System.out.print(ch + " ");
				ch++;						
			}

			System.out.println();
		}
	}
}

/*
 
A B C D E 
F G H I J 
K L M N O 
P Q R S T 
U V W X Y 

*/
