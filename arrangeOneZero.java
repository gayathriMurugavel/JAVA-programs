import java.util.*;
public class arrangeOneZero{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		int cnt=0;
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
			if(arr[i]==0)
				cnt++;
		}
		for(int j=0;j<n;j++){
			if(j<cnt)
				System.out.print(0+" ");
			else
				System.out.print(1+" ");
		}
		//System.out.println(1);
		
	}
}