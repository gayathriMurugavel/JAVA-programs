import java.util.*;
public class TimeConversion{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine().toUpperCase(),s1;
		int n;
		if(s.substring(8).equals("PM"))
		{
			s1=s.substring(0,8);
			n=Integer.parseInt(s1.substring(0,2))+12;
			System.out.println(n+s1.substring(2));
		}
		else if(s.substring(8).equals("AM"))
		{
			s1=s.substring(0,8);
			n=Integer.parseInt(s1.substring(0,2));
			if(n==12)
				System.out.print("00"+s1.substring(2));
			else
				System.out.print(s1.substring(0));
		}
	}
}