import java.util.*;
public class nonRepeatNum{
public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		int cnt=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(arr[i]==arr[j])
					cnt++;
			}
			if(cnt==1)
				System.out.println(arr[i]);
			cnt=0;
		}
	}
}
