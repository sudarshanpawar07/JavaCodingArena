package pattern;

class Pattern17
{
	public static void main(String [] args)
	{
		char ch = 'a';
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

a b c d e 
f g h i j 
k l m n o 
p q r s t 
u v w x y 

*/