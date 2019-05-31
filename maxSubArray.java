import java.util.*;
public class maxSubArray{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		int max=0,sum=0;
		for(int j=0;j<n-1;j++){
			for(int k=j;k<n;k++){
				if(j==0 && k==n-1){
					continue;
				}
				else
				sum+=arr[k];
				if(max<sum)
					max=sum;
			}
			sum=0;
		}
		System.out.println(max);
	}
}