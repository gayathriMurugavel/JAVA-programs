import java.util.*;
public class stringKeyMapping{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		if(t>=1 && t<=100){
			for(int a=0;a<t;a++){
				String s=in.next();
				char ch[]=s.toCharArray();
				String result="";
				if(s.length()>0 && s.length()<=100){
					for(int i=0;i<ch.length;i++){
					if(ch[i]=='A' || ch[i]=='B' || ch[i]=='C' || ch[i]=='a'|| ch[i]=='b' ||ch[i]=='c')
						result+=2;
					else if(ch[i]=='D' || ch[i]=='E' || ch[i]=='F' || ch[i]=='d'|| ch[i]=='e' ||ch[i]=='f')
						result+=3;
					else if(ch[i]=='G' || ch[i]=='H' || ch[i]=='I' || ch[i]=='g'|| ch[i]=='h' ||ch[i]=='i')
						result+=4;
					else if(ch[i]=='J' || ch[i]=='K' || ch[i]=='L' || ch[i]=='j'|| ch[i]=='k' ||ch[i]=='l')
						result+=5;
					else if(ch[i]=='M' || ch[i]=='N' || ch[i]=='O' || ch[i]=='m'|| ch[i]=='n' ||ch[i]=='o')
						result+=6;
					else if(ch[i]=='P' || ch[i]=='Q' || ch[i]=='R' || ch[i]=='p'|| ch[i]=='q' ||ch[i]=='r'||ch[i]=='s')
						result+=7;
					else if(ch[i]=='T' || ch[i]=='U' || ch[i]=='V' || ch[i]=='t'|| ch[i]=='u' ||ch[i]=='v')
						result+=8;
					else if(ch[i]=='W' || ch[i]=='X' || ch[i]=='Y' || ch[i]=='Z'|| ch[i]=='w' ||ch[i]=='x'|| ch[i]=='y' ||ch[i]=='z')
						result+=9;
				}
				}
				System.out.println(result);
			}
		}
	}
}