import java.util.*;
public class RemoveDupicatesFromString {

	
	// WAP to remove Duplicates from a String
	
	public static void main(String[] args) 
	{
		System.out.println("Enter String ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=toLower(s);
		
		char[]ch=s.toCharArray();
		char[]res=new char[ch.length];
		String str="";
		int k=0;
		
		for(int i=0;i<ch.length;i++)
		{
			int check=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==' ')
				{
					break;
				}
				if(ch[i]==res[j])
				{
					check=1;
				}
			
				
			}
			if(check==0)
			{
				str=str+ch[i];
				res[k]=ch[i];
				k++;
			}
			
		}
		
     System.out.println("Sting without duplicates: "+str);
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
