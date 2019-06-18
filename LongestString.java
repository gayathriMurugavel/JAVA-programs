import java.util.*;
public class LongestString{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		char ch[]=s.toCharArray();
		Stack<Character> stk=new Stack<Character>();
		int cnt=0;
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='(')
				stk.push(ch[i]);
			else if(!stk.empty() && ch[i]==')'){
				stk.pop();
				cnt+=2;
			}
		}
		System.out.println(cnt);
	}
}