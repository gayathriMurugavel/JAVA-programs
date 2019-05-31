import java.util.*;
public class Iron{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int x,y,z;
		x=in.nextInt();
		y=in.nextInt();
		z=in.nextInt();
		int r1=n%x,seg1=n/x;
		if(r1!=0){
			if(r1%y==0)
				seg1++;
			else if(r1%z==0)
				seg1++;
		}
		int r2=n%y,seg2=n/y;
		if(r2!=0){
			if(r2%x==0)
				seg2++;
			else if(r2%z==0)
				seg2++;
		} 
		int r3=n%z,seg3=n/z;
		if(r3!=0){
			if(r3%x==0)
				seg3++;
			else if(r3%y==0)
				seg3++;
		}
		int arr[]={seg1,seg2,seg3};
		Arrays.sort(arr);
		System.out.println(arr[2]);
	}
}