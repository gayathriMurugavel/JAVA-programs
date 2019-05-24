import java.util.*;
public class Pattern{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k;
		for(int i=n;i>0;i--){
			k=(i*(i+1))/2-(i-1);
			for(int j=1;j<i+1;j++){
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}