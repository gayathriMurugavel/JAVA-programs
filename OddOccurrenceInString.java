import java.util.*;
public class OddOccurrenceInString{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		char ch[]=s.toCharArray();
		int cnt=0;
		for(int i=0;i<ch.length;i++){
			for(int j=0;j<ch.length;j++){
				if(ch[i]==ch[j])
					cnt++;
			}
			if(cnt==1 || cnt%2!=0)
				System.out.print(ch[i]);
			cnt=0;
		}
	}
}