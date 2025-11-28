package Basics;


public class Epam1 {

	public static void main(String[] args) {
		int n = 2;
		System.out.println(solve(n));

	}
	public static int solve(int n)
	{
		int sum = 0;
		for(int i= 1;i<=n;i++)
		{
			for(int j = 1;j<=n;j++)
			{
				sum += defeatingPower(i+j);
			}
		}
		return sum;
	}
	public static int defeatingPower(int num)
	{
		int eSum= 0,oSum=0;
		for(;num!=0;num/=10) {
			int rem = num % 10;
			if(rem % 2== 0)eSum+=rem;
			else oSum += rem;
		}
		return (eSum-oSum) < 0 ? (eSum-oSum)*-1:(eSum -oSum);
			
	}
	

}
