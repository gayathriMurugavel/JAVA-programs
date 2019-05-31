import java.util.*;
public class PogoJumpToEnd{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		int j=0;
		while(j<n){
			if(arr[j]==0 && j==(n-1)){
				System.out.println("True");
				System.exit(0);
			}
			else if(arr[j]==0){
				System.out.println("False");
				System.exit(0);
			}
			j=j+arr[j];
		}
		System.out.println("True");
	}
}