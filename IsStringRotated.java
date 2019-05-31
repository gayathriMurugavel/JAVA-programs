import java.util.*;
public class IsStringRotated{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s1=in.next();
		String s2=in.next();
		int n,n1=s1.length(),n2=s2.length();
		char ch=s1.charAt(0);
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		if(n1==n2){
			int p,q,cnt=0,a,b,m;
		m=s2.lastIndexOf(ch);
		p=0;
		q=m;
		while(q<n2){
			if(ch1[p]==ch2[q])
				cnt++;
			p++;
			q++;
		}
		p=n1-m;
		q=0;
		while(p<n1){
			if(ch1[p]==ch2[q])
				cnt++;
			p++;
			q++;
		}
		if(cnt==n1)
			System.out.println("true");
		else
			System.out.println("false");
		}
	}
}