package String;
public class Combination {
	public static void main(String[] args) {
		String str = "ABC";
		combine(str,0,"");
	}

	public static void combine(String str, int index, String current){
		if(!(current.isEmpty()))
		{
			System.out.println(current);
		}
		
		for(int i= index;i  < str.length();i++)
		{
			combine(str, i+1, current+str.charAt(i));
		}
	}

}
