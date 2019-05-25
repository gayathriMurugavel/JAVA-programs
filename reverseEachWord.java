import java.util.*;
public class reverseEachWord{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		if(t>=1 && t<=10){
			for(int i=0;i<t;i++){
				String s=in.nextLine();
				String str[]=s.split(" ");
				String original,result;
				for(int j=0;j<str.length;j++){
					original=str[j];
					result="";
					char ch[]=str[j].toCharArray();
					for(int k=str[].length-1;k>=0;k--)
						result+=ch[k];
					System.out.print(result+" ");
				}
			}
		}
	}
}