import java.util.*;

public class Repetitions{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();
    int maxlen = 1;
    int len = 1;
    
    for(int i = 1; i<s.length(); i++){
      if(s.charAt(i) == s.charAt(i-1)){
        len = len + 1;
      }else{
        maxlen = Math.max(maxlen, len);
        len = 1;
      }
    }
    System.out.println(Math.max(maxlen,len));
  }
}
