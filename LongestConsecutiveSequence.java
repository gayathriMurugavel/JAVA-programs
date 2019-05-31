import java.util.*;
public class LongestConsecutiveSequence{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		int cnt=0;
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<n-1;i++){
			if(arr[i]+1==arr[i+1])
				cnt++;
			else
				break;
		}
		System.out.println(cnt+1);
	}
}