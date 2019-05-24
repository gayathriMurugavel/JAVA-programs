import java.util.*;
public class CountSetBits{
	public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int t=in.nextInt();
			if(t>=1 && t<=100){
				for(int a=0;a<t;a++){
					int n=in.nextInt();
					if(n>0 && n<=103){
						int cnt=1;
						for(int i=2;i<=n;i++){
							int temp=i;
							while(temp!=0){
								if(temp%2==1)
									cnt++;
								temp=temp/2;
							}
						}
						System.out.println(cnt);
					}
				}
			}
	}
}