import java.util.*;
public class SortArrayUsingStack{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),temp,y;
		Stack<Integer> stk=new Stack<Integer>();
		Stack<Integer> tmpstk=new Stack<Integer>();
		for(int i=0;i<n;i++){
			stk.push(in.nextInt());
		}
		while(!stk.empty()){
			temp=stk.pop();
			if(!tmpstk.empty()){
			if(tmpstk.peek() < temp){
				tmpstk.push(temp);}
			else if(tmpstk.peek()>temp){
				stk.push(tmpstk.pop());
				stk.push(temp);
			}
		}
		else{
			tmpstk.push(temp);
		}
		}
		System.out.println(tmpstk);
	}
}