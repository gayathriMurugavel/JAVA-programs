import java.util.*;
public class CountXInRange{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		if(t>0 && t<=100){
		for(int i=0;i<t;i++){
			int x=in.nextInt();
			if(x>-1 && x<10){
				int lower=in.nextInt(),upper=in.nextInt(),cnt=0;
				for(int j=lower+1;j<upper;j++){
					int temp=j;
					while(temp!=0){
						if(temp%10 == x)
							cnt++;
						temp/=10;
					}
				}
				System.out.println(cnt);
			}
		}
		}
	}
}