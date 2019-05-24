import java.util.*;
public class genBinaryNos{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		if(t>=1 && t<=106){
			for(int a=0;a<t;a++){
				int n=in.nextInt();
				if(n>0 && n<=106){
					for(int i=1;i<=n;i++){
						int temp=i;
						int arr[]=new int[10];
						int k=0;
						while(temp!=0){
							arr[k]=temp%2;
							temp=temp/2;
							k++;
						}
						for(int j=k-1;j>=0;j--)
						System.out.print(arr[j]);
						System.out.print(" ");
					}
				}
			}
		}
	}
}