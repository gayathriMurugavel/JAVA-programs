import java.util.*;
public class oneOnePattern{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		if(t>=1 && t<=20){
			for(int i=0;i<t;i++){
				int n=in.nextInt();
				int arr[][]=new int[n][n+1];
				if(n>=1 && n<=20){
					for(int j=0;j<n;j++){
						for(int k=0;k<=(j+1);k++){
							if(j==0 || k==0)
								arr[j][k]=1;
							else
								arr[j][k]=arr[j-1][k-1]+arr[j-1][k];
							System.out.print(arr[j][k]);
						}
						System.out.println();
					}
				}
			}
		}
	}
}