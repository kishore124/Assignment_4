import java.util.Scanner;

// WAP to find the maximum occurring character in a String.
public class Max_Occuring_Char_InString
{
	public static void main(String[] args)
	{

		System.out.println("Enetr String ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		str=toLower(str);
		
		int[] arr=count(str);
		
        int max=arr[0];
               
        int count=0;
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];	
			}
		}
		int[] a=new int[40];
		int l=0;
		for(int i=0;i<arr.length;i++)
		{
			if(max==arr[i])
			{
				a[l]=i;
				l++;
			}
		}
	
		for(int i=0;i<l;i++)
		{
			System.out.println("Maximum occurring character in a String is  : "+ (char)(a[i]) +"  it is occuring "+ max +" times");
		}
	

	}
	
	static int[] count(String str)
	{
		int[] arr=new int[127];
		char []ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				continue;
			}
			else
			{
				int index=ch[i];
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
