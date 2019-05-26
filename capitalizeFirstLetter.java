import java.io.*;
import java.util.*;
public class capitalizeFirstLetter{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine(),ch;
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++){
			ch=str[i].substring(0,1);
			System.out.print(ch.toUpperCase()+str[i].substring(1)+" ");
		}
	}
}