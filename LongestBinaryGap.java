import java.util.*;
public class LongestBinaryGap{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int a=in.nextInt(),cnt=0,max=0;
		String binary=Integer.toBinaryString(a);
		System.out.println(binary);
		char ch[]=binary.toCharArray();
		int n=ch.length;
		for(int i=0;i<n-1 ;i++){
			 if(ch[i]=='1'){
            for(int j=i+1;j<n;j++){   
					if(ch[j]=='0' && j<n-1)
						cnt++;
					else if(ch[j]=='0' && j==n-1)
						cnt=0;
					else if(ch[i]=='1')
						break;
			}
			}
			if(max<cnt)
				max=cnt;
			cnt=0;
        }
		System.out.println(max);
	}
}