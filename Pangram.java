import java.util.Scanner;
public class Pangram {

	public static void main(String[] args)
	{
		System.out.println("Enetr String ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		str=toLower(str);
		
		int[] arr=count(str);
		
		boolean check=false;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				System.out.println("String is not a Pangram");
				check=true;
				break;
			}
		}
		
		if(check==false)
		{
			System.out.println("String is a Pangram");
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
