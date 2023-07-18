import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;

public class FerrisWheel {

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
    FastReader fr = new FastReader();
    int n = fr.nextInt();
    int x = fr.nextInt();

    int stu[] = new int[n];
    for(int i = 0; i < n ; i ++) {
      stu[i] = fr.nextInt();
    }
    
    Arrays.sort(stu);
    
    int i  = 0, j = n-1;
    int count = 0;
    while(i <= j) {
      if(i == j){
        count ++;
        break;
      }
      if(stu[j] == x){
        count++; j--; continue;
      }

      if(stu[i] + stu[j] <= x){
        count++; i++; j--;
      }
      else {
        count++; j--;
      }
    }

    System.out.println(count);
  }
}


// 2 3 7 8 9 ; 12
