import java.util.*;
public class geeksCoffee{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		if(t>=1 && t<=104){
			for(int i=0;i<t;i++){
				int n=in.nextInt();
				int m=in.nextInt();
				if(n>=1 && n<=109 && m>=1 && m<=103){
					int j=n;
					int k=m;
					while(k!=0){
						j=j/2;
						k=k/2;
					}
					System.out.println(j);
				}
			}
		}
	}
}