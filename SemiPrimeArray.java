import java.util.*;
public class SemiPrimeArray{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int p[]=new int[n];
		int q[]=new int[n];	
		for(int i=0;i<n;i++)
			p[i]=in.nextInt();
		for(int z=0;z<n;z++)
			q[z]=in.nextInt();
		int arr[]={2,3,5,7,11,13};
		int arr1[]=new int[(arr.length*(arr.length+1))/2];
		int a=0;
		for(int j=0;j<arr.length-1;j++){
			for(int k=j;k<arr.length;k++){
				arr1[a]=arr[j]*arr[k];
				a++;
			}
		}
		Arrays.sort(arr1);
		int cnt=0;
		for(int c=0;c<n;c++){
			cnt=0;
			//System.out.print(p[c]+" "+q[c]+" ");
		for(int b=0;b<arr1.length;b++){
			
			if(arr1[b]>=p[c] && q[c]>=arr1[b])
				cnt++;
		}
		System.out.print(cnt+" ");
		}
	}
}