class Pattern5
{
	public static void main(String [] args)
	{
		int n = 21;
		for(int i = 0;i<n;i++)
		{
			for(int j = 0;j<n;j++)
			{	
				if( i==0||j==0 || j == n-1 || i == n-1 || j== n/2 || i == n/2 || i + j == n-1 || i == j)
				{
				   System.out.print("*" + " ");
				}
				else{
				    System.out.print(" " + " ");
				}
			}

			System.out.println();
		}
	}
}

/*
output :-

* * * * * * * * * * * * * * * * * * * * *
* *                 *                 * *
*   *               *               *   *
*     *             *             *     *
*       *           *           *       *
*         *         *         *         *
*           *       *       *           *
*             *     *     *             *
*               *   *   *               *
*                 * * *                 *
* * * * * * * * * * * * * * * * * * * * *
*                 * * *                 *
*               *   *   *               *
*             *     *     *             *
*           *       *       *           *
*         *         *         *         *
*       *           *           *       *
*     *             *             *     *
*   *               *               *   *
* *                 *                 * *
* * * * * * * * * * * * * * * * * * * * *
*/
