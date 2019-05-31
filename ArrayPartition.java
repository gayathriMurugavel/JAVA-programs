import java.util.*;
public class ArrayPartition{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),cnt=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		int x=in.nextInt();
		for(int j=n-1;j>=0;j--){
			if(arr[j]<x)
			System.out.print(arr[j]+" ");
		}
		for(int p=n-1;p>=0;p--){
			if(arr[p]==x)
			System.out.print(arr[p]+" ");
		}
		for(int k=n-1;k>=0;k--){
			if(arr[k]>x)
			System.out.print(arr[k]+" ");
		}
	}
}