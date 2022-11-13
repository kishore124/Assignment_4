import java.util.*;
import java.util.Scanner;

//WAP to count the number of consonants, vowels, special characters in a String.

public class Count_Vowels_Consonants_SpecialCharacters {

	public static void main(String[] args)
	{
		System.out.println("Enetr String");

		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		int vowels=0;
		int consonants=0;
		int specialChar=0;
		int letters=0;
		
		
		str=toLower(str);
		
		char []ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' ||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u' )
			{
				vowels++;
			}
			
			else if(ch[i]>='b' && ch[i]<='d' || ch[i]>='f' && ch[i]<='h' || ch[i]>='j' && ch[i]<='n' || 
					ch[i]>='p' && ch[i]<='t'|| ch[i]>='v' && ch[i]<= 'z' )
			{
				consonants++;
			}
			else if(ch[i]>=48 && ch[i]<=57)
			{
				letters++;
			}
			else 
			{
				specialChar++;
			}
				
		}
		
		System.out.println("Number of Vowels: "+vowels);
		System.out.println("Number of consonants: "+consonants);
		System.out.println("Number of specialCharters: "+specialChar);
	   
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
