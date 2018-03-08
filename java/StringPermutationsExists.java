//need method that will give all permutations of a class
import java.util.*;
public class StringPermutationsExists
{
	public static ArrayList<String>  permutations = new ArrayList<>();


	public static Set<String> getPermutations(String strIn)
	{
		Set<String> temp = new HashSet<String>();

		int len = strIn.length();
		if(len == 1)
		{
			temp.add(strIn);
			return temp;
		}
		if(len == 2)
		{

			temp.add(strIn);
			temp.add(new StringBuilder(strIn).reverse().toString());
			return temp;
		}

		for(int i=0; i < strIn.length(); i++)
		{
			String t = new StringBuffer(strIn).delete(0, 1).toString();
			System.out.println(t);
			Set<String> st = getPermutations(t);
			System.out.println("Set for " + t + " " + st.toString());

			for(String s : st)
			{
				temp.add(new StringBuffer(s).insert(i, strIn.charAt(0)).toString());
			}
		}

		return temp;

	}

	public static void main(String args[])
	{
		System.out.println(getPermutations("12345").length();
	}
}