import java.util.*;
public class maxProductInArray{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		if(t>0 && t<=100){
		for(int i=0;i<t;i++){
			int n=in.nextInt();
			int arr[]=new int[n];
			if(n>=2 && n<=107){
				for(int j=0;j<n;j++){
					int temp=in.nextInt();
					if(temp>=0 && temp<=104){
						arr[j]=temp;
					}
				}
				Arrays.sort(arr);
				System.out.println(arr[n-1]*arr[n-2]);
			}
		}
		}
	}
}