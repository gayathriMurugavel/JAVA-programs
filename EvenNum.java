import java.util.*;
public class EvenNum{//even number within a limit having same first and last digit
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int l=in.nextInt();//leftValue
		int r=in.nextInt();//rightValue
		for(int i=l+1;i<r;i++){
			if(i%2==0){
				int temp=i;
				if(temp/10==0)
					System.out.print(i+" ");
				else{
					String a=Integer.toString(temp);
					if(a.charAt(0)==a.charAt(a.length()-1))
						System.out.print(i+" ");
				}
			}
		}
	}
}