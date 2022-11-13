import java.util.*;
public class Palindrome {

	public static void main(String[] args)
	{
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
	
		String rev="";
		
		
		str=toLower(str);
		
		// To reverse the String and store in str
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		boolean check=compare(str,rev);
	 
		if(check==false)
		{
			System.out.println("String is Plaindrome");
		}
		else
		{
			System.out.println("String is not a Palindrome");
		}
	}
	
	//Method to Compare two Strings
	 static boolean compare(String str1,String str2)
	 {
		 boolean check=false;
		 
		 for(int i=0;i<str1.length();i++)
			{
				if(str1.charAt(i)!=str2.charAt(i))
				{
					check=true;
					break;
				}
			}
		 
		 if(check==false)
			{
				return false;
			}
			else
			{
				return true;
			}
		 
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
