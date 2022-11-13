import java.util.Scanner;

//WAP to print Duplicates characters from a String
public class PrintDupiclatesFromString {

	public static void main(String[] args)
	{
		System.out.println("Enetr String");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		
		st=toLower(st);
		
		char[]ch=st.toCharArray();
		char[]res=ch;
		String str="";
		int k=0;
		
		for(int i=0;i<ch.length;i++)
		{
			int check=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==' ')
				{
					str=str+' ';
					break;
				}
				if(ch[i]==res[j])
				{
					check++;;
				}
				
			}
			if(check>=2)
			{
				str=str+ch[i];
				res[k]=ch[i];
				k++;
			}
			
		}
		if(str.length()==0)
		{
			System.out.println("No Duplicates in string");
		}
		else
		{
			System.out.println("Duplicates in String: "+str);
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
