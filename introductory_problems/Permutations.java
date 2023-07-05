import java.util.*;

public class Permutations {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();

    if(n == 1){
      System.out.println(1);
      return;
    }

    if(n < 4){
      System.out.println("NO SOLUTION");
      return;
    }

    StringBuilder sb = new StringBuilder();
    
    for(long i = 2; i <= n ; i+=2){
      sb.append(i).append(" ");
    }
    for(long i = 1; i <= n; i+=2){
      sb.append(i).append(" ");
    }
    System.out.print(sb.toString());
  }
}


// 4
// 1 2 3 4 --> 3 1 4 2
//
// 5
// 1 2 3 4 5 --> 4 2 5 3 1
//
// 6
// 1 2 3 4 5 6 --> 5 3 1 6 4 2
