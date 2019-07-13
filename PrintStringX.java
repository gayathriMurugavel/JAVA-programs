import java.util.*;
public class OddDiagonalString
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    char ch[]=in.nextLine().toCharArray();
	    int k=0,l=ch.length-1;
	    for(int i=0;i<ch.length;i++){
	        for(int j=0;j<ch.length;j++){
	            if(i==j){
	                System.out.print(ch[k]);
	                k++;
	                if(i==ch.length/2)
	                    l--;
	            }
	            else if(i+j==ch.length-1){
                    System.out.print(ch[l]);
	                l--;
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	}
}
