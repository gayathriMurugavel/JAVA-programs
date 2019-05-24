import java.util.*;
public class subArrayZero{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		int sum=0,cnt=0;
		for(int j=0;j<n-1;j++){
			sum=arr[j];
			for(int k=j+1;k<n;k++){
				sum+=arr[k];
				if(sum==0)
					cnt++;
			}
			sum=0;
		}
		if(cnt>0)
			System.out.print("true");
		else
			System.out.print("false");
	}
}
