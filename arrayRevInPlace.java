import java.util.*;
public class arrayRevInPlace{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		int j=0;
		int k=n-1;
		while(j<=k){
			int temp=arr[j];
			arr[j]=arr[k];
			arr[k]=temp;
			k--;
			j++;
		}
		for(int p=0;p<n;p++)
			System.out.print(arr[p]+" ");
	}
}
