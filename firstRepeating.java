import java.util.*;
public class firstRepeating{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		for(int j=0;j<n-1;j++){
			for(int k=j+1;k<n;k++){
				if(arr[j]==arr[k]){
					System.out.print(arr[j]);
					return;
				}
			}
		}
	}
}
