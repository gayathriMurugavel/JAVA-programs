import java.util.*;
public class StrArrange{
	public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			String s1,s2,s3="";
			s1=in.nextLine();
			s2=in.nextLine();
			char ch[]=s1.toCharArray();
			String str1[]=s2.split(" ");
			for(int i=0;i<ch.length;i++){
				for(int j=0;j<str1.length;j++){
					char c=str1[j].charAt(0);
					
					if(ch[i]==c)
						s3+=str1[j]+" ";
						//System.out.println(str1[j]+" ");
				}
			}
			System.out.println(s3);
	}
}