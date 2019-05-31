import java.util.*;
public class RepeatNum{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int x=in.nextInt();
		int cnt;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		for(int j=0;j<n-1;j++){
			cnt=1;
			for(int k=j+1;k<n;k++){
				if(arr[j]==arr[k])
					cnt++;
			}
			if(cnt==x){
				System.out.println(arr[j]);
				System.exit(0);
			}
			cnt=0;
		}
	}
}