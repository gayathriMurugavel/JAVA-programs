import java.util.*;
public class ValueInIndex{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		Arrays.sort(arr);
		int max=arr[n-1]+1,m=-1;
		for(int j=0;j<max;j++){
			for(int k=0;k<n;k++){
				if(j==arr[k]){
					m=arr[k];
					break;
				}
				else m=-1;
			}
			System.out.print(m+" ");
		}
	}
}