import java.util.*;
public class missingNumber{
public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++){
			if(arr[i+1]-arr[i]!=1)
				System.out.println(arr[i]+1);
		}
	}
}
