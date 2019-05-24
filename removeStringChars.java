import java.util.*;
public class removeStringChars{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		if(t>=1 && t<=15){
			for(int a=0;a<t;a++){
				String s1=in.next();
				String s2=in.next();
				char ch1[]=s1.toCharArray();
				char ch2[]=s2.toCharArray();
				int cnt=0;
				for(int i=0;i<ch1.length;i++){
					for(int j=0;j<ch2.length;j++){
						if(ch1[i]==ch2[j])
							cnt++;
					}	
					if(cnt==0)
						System.out.print(ch1[i]);
					else cnt=0;
				}
			}
		}
	}
}