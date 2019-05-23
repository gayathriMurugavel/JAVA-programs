import java.util.*;
public class maxMoney{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		if(t>0 && t<=30){
			int sum=0;
			for(int i=0;i<t;i++){
				int n=in.nextInt(),m=in.nextInt();//n=no.of houses,m=money in each houses
				for(int j=0;j<n;j=j+2){
					sum+=m;
				}
				System.out.println(sum);
				sum=0;
			}
		}
	}
}