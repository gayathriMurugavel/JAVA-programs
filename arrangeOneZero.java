import java.util.*;
public class arrangeOneZero{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		Arrays.sort(arr);
		for(int j=0;j<n-1;j++)
			System.out.print(arr[j]+" ");
		System.out.print(arr[n-1]);
	}
}