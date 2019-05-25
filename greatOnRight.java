import java.util.*;
public class greatOnRight{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		if(t>=1 && t<=50){
			for(int i=0;i<t;i++){
				int n=in.nextInt();
				int arr[]=new int[n];
				if(n>=1 && n<=100){
					for(int j=0;j<n;j++)
						arr[j]=in.nextInt();
					for(int p=0;p<n-1;p++){
						int max=0;
						for(int q=p+1;q<n;q++){
							if(max<arr[q])
								max=arr[q];
						}
						System.out.print(max+" ");
					}
					System.out.println(-1);
				}
			}
		}
	}
}