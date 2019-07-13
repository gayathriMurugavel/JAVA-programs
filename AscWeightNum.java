import java.util.*;
class Range implements Comparable<Range>{
    int key;
    int val;
    Range(int key,int val){
        this.key=key;
        this.val=val;
    }
    public int compareTo(Range r){
        return this.val-r.val;
    }
}
public class AscWeightNum
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt(),sum=0;
	    int arr[]=new int[n];
	    ArrayList<Range> ar=new ArrayList<Range>(); 
	    for(int i=0;i<n;i++){
	        arr[i]=in.nextInt();
	        if( ( (Math.sqrt(arr[i]) ) - ( Math.floor(Math.sqrt(arr[i])) ) ) ==0)
	            sum+=5;
	        if(arr[i]%2==0)
	            sum+=3;
	        if(arr[i]%4 == 0 && arr[i]%6 == 0)
	            sum+=4;
	        ar.add(new Range(arr[i],sum));
	        sum=0;
	    }
	    Collections.sort(ar);
	    for(int j=0;j<n;j++){
	        Range temp=ar.get(j);
	        System.out.println(temp.key+","+temp.val);
	    }
	}
}
