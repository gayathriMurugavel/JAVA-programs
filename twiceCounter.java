import java.util.*;
public class twiceCounter{
public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		int cnt1=0;
		if(t>=1 && t<=105){
			for(int a=0;a<t;a++){
				int n=in.nextInt();
				if(n>0 && n<=105){
					String str[]=new String[n];
					for(int i=0;i<n;i++)
						str[i]=in.next();
						int cnt=0;
					for(int j=0;j<n;j++){
						for(int k=0;k<n;k++){
							if(str[j].equals(str[k]))
								cnt++;
						}
						if(cnt==2)
							cnt1++;
						cnt=0;	
					}
					System.out.println(cnt1/2);
				}
			}
		}
	}
}
