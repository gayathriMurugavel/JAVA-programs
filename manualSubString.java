import java.util.*;
public class manualSubString{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		if(t>=1 && t<=100){
			for(int i=0;i<t;i++){
				String s1=in.next();
				String s2=in.next();
				int n=s2.length();
				int index=s1.indexOf(s2.charAt(0));
				if((s1.substring(index,index+n).equals(s2))){
					System.out.println(index);
				}
				else
					System.out.println(-1);
			}
		}
	}
}