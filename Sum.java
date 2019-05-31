import java.util.*;
public class Sum{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		int sum=in.nextInt(),s=0;
		for(int j=0;j<n;j++){
			for(int k=0;k<n;k++){
				s=arr[j]+arr[k];
				if(j!=k && s==sum){
					System.out.println(arr[j]+" "+arr[k]);
				}
			}
		}
	}
}