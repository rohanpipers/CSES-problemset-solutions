import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NumberSpiral {

  static class FastReader{
    BufferedReader br;
    StringTokenizer st;

    public FastReader(){
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next(){
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() {
      return Double.parseDouble(next());
    }

    String nextLine() {
      String str = "";
      try {
        str = br.readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }

      return str;
    }
  }

  public static void main(String[] args) {
    FastReader sc = new FastReader();
    int n = sc.nextInt();

    for(int i = 0; i<n; i++){
      long y = sc.nextLong();
      long x = sc.nextLong();

      if(y > x){
        if(y % 2 == 0){
          System.out.println(y*y - x + 1);
        }
        else{
          System.out.println((y-1)*(y-1) + x);
        }
      }
      else{
        if(x % 2 != 0){
          System.out.println(x*x - y + 1);
        }
        else{
          System.out.println((x-1)*(x-1) + y);
        }
      }
    }
  }
}
