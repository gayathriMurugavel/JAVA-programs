import java.util.*;
public class minDifferencePair{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		if(t>0 && t<=30){
		for(int i=0;i<t;i++){
			int n=in.nextInt();
			if(n>=1 && n<=100){
			int arr[]=new int[n];
			for(int j=0;j<n;j++)
				arr[j]=in.nextInt();
			int min=100;
			int a[]=new int[n*(n-1)];
			int k=0;
			for(int m=0;m<n-1;m++){
				for(int l=m+1;l<n;l++){
					a[k]=Math.abs(arr[m]-arr[l]);
					k++;
				}
			}
			for(int f=0;f<k;f++){
				if(min>a[f])
					min=a[f];
			}
			System.out.println(min);
			}
		}
		}
	}
}
