package Basics;

public class CognizantExample {

	public static void main(String[] args) {
		String str = "asesuiuoiseuighhyttsraesrdty";
		int op = solve(str);
		System.out.println(op);

	}
	public static int solve(String str)
	{
		int sum = 0;
		for(char ch = 'a';ch<='z';ch++)
		{
			int cnt = 0;
			for(char ele : str.toCharArray())
			{
				if(ele == ch)cnt++;
				if(cnt == 0)continue;
				sum += (ch * cnt)%5;
			}
		}
		
		return sum;
	}

}
