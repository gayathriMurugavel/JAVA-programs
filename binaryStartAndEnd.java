import java.util.*;
public class binaryStartAndEnd{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		if(t>=1 && t<=40){
			for(int i=0;i<t;i++){
				int n=in.nextInt();
				String s=in.next();
				String ch[]=s.split("");
				int arr[]=new int[n];
				int cnt=0;
				for(int j=0;j<n;j++)
					arr[j]=Integer.parseInt(ch[j]);
				for(int p=0;p<n-1;p++){
					for(int q=p+1;q<n;q++){
						if(arr[p]==1 && arr[q]==1)
							cnt++;
					}
				}
				System.out.println(cnt);
			}
		}
	}
}