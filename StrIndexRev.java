import java.util.*;
public class StrIndexRev{
	public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			String s1,s3="",rev="";
			s1=in.nextLine();
			int n=in.nextInt();
			String str1[]=s1.split(" ");
			for(int i=0;i<str1.length;i++){
				if(i==(n-1)){
					char ch[]=str1[i].toCharArray();
					for(int j=ch.length-1;j>=0;j--)
						rev+=ch[j];
					s3+=rev+" ";
				}
				else
					s3+=str1[i]+" ";
			}
			System.out.println(s3);
	}
}