import java.util.*;
public class pythagorean{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[n];
		for(int p=0;p<n;p++){
			arr[p]=in.nextInt();
			arr1[p]=arr[p]*arr[p];
		}
		int cnt=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				for(int k=0;k<n;k++){
						if(i!=j && i!=k && j!=k && arr1[i]+arr1[j]==arr1[k])
							cnt++;
				}
			}
		}
		if(cnt>0)
			System.out.println("true");
		else
			System.out.println("false");
	}
}