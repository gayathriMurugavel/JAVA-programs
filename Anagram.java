import java.util.Arrays;
public class Anagram{
  public static void main(String[] args){
    String s1="listen",s2="silent";
    char ch1[]=s1.toCharArray();
    char ch2[]=s2.toCharArray();
    int n1=ch1.length,n2=ch2.length;
    if(n1==n2){
      Arrays.sort(ch1);
      Arrays.sort(ch2);
      int cnt=0;
      for(int i=0;i<n1;i++){
        if(ch1[i]==ch2[i])
         cnt++;
         }
         if(cnt==n1)
         System.out.println("anagram");
         else
         System.out.println("not a anagram");
    }
  }
}