import java.util.*;

public class DistinctNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    Set<Integer> s = new HashSet<Integer>();

    for(int i = 0; i<n; i++){
      int x = sc.nextInt();
      s.add(x);
    }

    System.out.println(s.size());
  }
}
