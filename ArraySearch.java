import java.util.*;
public class ArraySearch{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,17},{18,19,20,21}};
		int n=in.nextInt();
		for(int i=0;i<arr.length;i++){
			for(int j=arr.lengt-1;j>=0;j--){
				if(n<arr[i][j])
					break;
				else
				{
					if(n==arr[i][j]){
					System.out.println(n+" is present in ["+i+","+j+"]");
						System.exit(0);
					}
				}
			}
		}
		System.out.println(n +" is not present");
		
	}
}
		
