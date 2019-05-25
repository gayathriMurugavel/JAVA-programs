import java.util.*;
public class addSubMatrix{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		if(t>=1 && t<=15){
			for(int i=0;i<t;i++){
				int n=in.nextInt();
				int m=in.nextInt();
				int arr[][]=new int[n][m];
				if(n>=1 && n<=103 && m>=1 && m<=103){
					for(int j=0;j<n;j++)
						for(int k=0;k<m;k++)
							arr[j][k]=in.nextInt();
					int x1=in.nextInt(),y1=in.nextInt(),x2=in.nextInt(),y2=in.nextInt(),sum=0;
					for(int x=x1-1;x<x2;x++){
						for(int y=y1-1;y<y2;y++){
							sum+=arr[x][y];
						}
					}
					System.out.println(sum);
					
				}
			}
		}
	}
}