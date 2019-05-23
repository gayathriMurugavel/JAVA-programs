import java.util.*;
public class rotateArrayNtimes{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		if(t>0 && t<=200){
			for(int i=0;i<t;i++){
			int n=in.nextInt();//n=size of array
			int arr[]=new int[n];
			if(n>=1 && n<=107){
				int d=in.nextInt();//d=no. of rotation
				if(d<=n){
					for(int j=0;j<n;j++){
						int p=in.nextInt();
						if(p>=0 && p<=105)
							arr[j]=p;
						}
					}
					int k=d;
					while(k<n){
						System.out.print(arr[k]+" ");
						k++;
					}k=0;
					while(k<d-1){
						System.out.print(arr[k]+" ");
						k++;
					}
					System.out.print(arr[d-1]+" ");
				}
			}
		}
	}
}