import java.util.*;
public class commonElements{
	public static void main(String[] args){
		ArrayList<Integer> arr1 = new ArrayList<Integer>(); 
		ArrayList<Integer> arr2 = new ArrayList<Integer>(); 
		ArrayList<Integer> arr3 = new ArrayList<Integer>(); 
		Scanner in=new Scanner(System.in);
		int n1=in.nextInt();
		for(int i=0;i<n1;i++)
			arr1.add(in.nextInt());
		int n2=in.nextInt();
		for(int i=0;i<n2;i++)
			arr2.add(in.nextInt());
		int n3=in.nextInt();
		for(int i=0;i<n3;i++)
			arr3.add(in.nextInt());
		arr2.retainAll(arr1);
		arr3.retainAll(arr2);
		System.out.print(arr3);
	}
}
