import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Apartments {

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
    int m = fr.nextInt();
    int k = fr.nextInt();

    int app[] = new int[n];
    int siz[] = new int[m];

    for(int i = 0; i < n; i++){
      app[i] = fr.nextInt();
    }

    for(int i = 0; i < m; i++){
      siz[i] = fr.nextInt();
    }

    Arrays.sort(app);
    Arrays.sort(siz);

    int count = 0; int i = 0, j = 0;

    while(i < n && j < m) {
      if(app[i] >= siz[j]-k && app[i] <= siz[j]+k){
        count++; i++; j++;
      }
      else if(app[i] < siz[j] - k) {
        i++;
      }
      else {
        j++;
      }
    }

    System.out.println(count);
  }
}
