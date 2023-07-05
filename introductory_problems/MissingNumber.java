import java.util.*;

public class MissingNumber{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int size = (int)(2e5) + 1;
    int arr[] = new int[size];
    int n = sc.nextInt();
    Arrays.fill(arr, 1, n+1, -1);

    for(int i = 0; i < n-1; i++){
      int ele = sc.nextInt();
      arr[ele] = ele;
    }

    for(int i = 1; i <= n; i++){
      if(arr[i] == -1){
        System.out.println(i);
        break;
      }
    }
  }
}
