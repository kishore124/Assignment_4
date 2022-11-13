import java.util.Scanner;

public class Anagram {

	public static void main(String[] args)
	{
		System.out.println("Enetr String 1");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		
		System.out.println("Enetr String 2");
		String s2=sc.nextLine();
		
		
		String str1=toLower(s1);
		String str2=toLower(s2);
	   
		int []cmp1=count(str1);
		int []cmp2=count(str2);
		
		System.out.println(compare(cmp1,cmp2));
	}
	
	static String compare(int [] first,int [] second)
	{
		boolean check=false;
		for(int i=0;i<first.length;i++)
		{
			if(first[i]!=second[i])
			{
				check=true;
				break;
				
			}
		}
		if(check==false)
		{
			return "Is Anagram";
		}
		else
		{
			return "Not a Anagram";
		}
	}
	   
	static int[] count(String str)
	{
		int[] arr=new int[26];
		char []ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				continue;
			}
			else
			{
				int index=ch[i]-97;
				arr[index]++;
				
			}
		}
		return arr;
	}
	
	// Method To convert String to lower case
	static String toLower(String st)
	{
		char[] c=st.toCharArray();
		String str="";
		for(int i=0;i<c.length;i++)
		 {
		if(c[i]>='A' && c[i]<='Z')
		{
		 str=str+(char)(c[i]+32);
		}
		else if(c[i]==' ')
		{
		str=str+" ";
		}
		else
		{
		str=str+c[i];
				   
		}
	}
		return str;

}
}
