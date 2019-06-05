import java.util.*;
public class MigratoryBirds{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),cnt=0;
		int arr[]=new int[n];
		int bird[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		for(int j=0;j<5;j++){
			for(int k=0;k<n;k++){
				if(j+1==arr[k])
					cnt++;
			}
			bird[j]=cnt;
			cnt=0;
		}
		int max=bird[0],m=0;
		for(int p=0;p<5;p++){
			if(max<bird[p]){
				max=bird[p];
				m=p+1;}
		}
		System.out.println(m);
	}
}
		