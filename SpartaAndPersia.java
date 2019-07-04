import java.util.*;
public class SpartaAndPersia{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String n=in.nextLine();
		int days=Integer.parseInt(n);
		int spar=0,per=0,val=0,flg=0;
		String str[]=new String[days],s="";
		for(int i=0;i<days;i++){
			str[i]=in.nextLine();
			s=str[i];
			char ch[]=s.toCharArray();
			for(int j=0;j<ch.length;j++){
				if(ch[j]=='H'){
					val=5;
					flg=0;
				}
				else if(ch[j]=='E'){
					val=10;
					flg=0;
				}
				else if(ch[j]=='A'){
					val=3;
					flg=0;
				}
				else if(ch[j]=='C'){
					val=1;
					flg=0;
				}
				else if(ch[j]=='.' && flg==0)
					spar+=val;
				else if(ch[j]=='X' && flg==0)
					spar+=(val+val);
				else if(ch[j]=='h'){
					val=5;
					flg=1;
				}
				else if(ch[j]=='e'){
					val=10;
					flg=1;
				}
				else if(ch[j]=='a'){
					val=3;
					flg=1;
				}
				else if(ch[j]=='c'){
					val=1;
					flg=1;
				}
				else if(ch[j]=='.' && flg==1)
					per+=val;
				else if(ch[j]=='X' && flg==1)
					per+=(val+val);
			}
			System.out.println(spar+"  "+per);
		}
		System.out.println(spar+"  "+per);
		//if(spar==per)
			//System.out.println("War draw");
		if(spar>=per)
			System.out.println("Sparta Wins");
		else if(spar<per)
			System.out.println("Persia Wins");
	}
}