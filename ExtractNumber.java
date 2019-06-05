import java.util.*;
public class ExtractNumber{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine(),s1;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='-')
				System.out.print(ch[i]);
			if(Character.isDigit(ch[i])){
				System.out.print(ch[i]);
				if((i+1)<ch.length && !Character.isDigit(ch[i+1]) )
					System.out.print(" ");
			}
		}
	}
}
