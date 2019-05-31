import java.util.*;
public class SwapOddEvenBits{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String s=Integer.toBinaryString(n);
		char ch[]=s.toCharArray();
		char ch1[]=new char[ch.length];
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='0')
				ch1[i]='1';
			else
				ch1[i]='0';
		}
		String s1=new String(ch1);
		System.out.println(Integer.parseInt(s1,2));	
	}
}