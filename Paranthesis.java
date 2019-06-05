import java.util.*;
public class Paranthesis{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		char ch[]=s.toCharArray();
		int cnt=0,cnt1=0;
		for(int i=0;i<ch.length;i++){
            if(ch[i]=='(')
                cnt++;
            else if(ch[i]==')')
                cnt--;
            else if(ch[i]=='*')
                cnt1++;
            } 
        if(cnt+cnt1==0 || cnt==0)
            System.out.print("true");
        else
            System.out.print("false");
	}
}
		