#include <bits/stdc++.h>

using namespace std;

int main(){
  int n, x;
  cin >> n >> x;
  int arr[n];
  for(int i = 0; i < n; i++) {
    cin >> arr[i];
  }

  sort(arr, arr + n);

  int i = 0, j = n-1, count = 0;
  while(i <= j){
    if(i == j) {
      count++;
      break;
    }

    if(arr[j] == x) {
      count++, j--;
      continue;
    }

    if(arr[i] + arr[j] <= x){
      count ++;
      i++, j--;
    }
    else {
      count++;
      j--;
    }
  }

  cout << count << endl;
}


// 10 10
// 10 9 7 10 9 8 5 6 6 5
// 5 5 6 6 7 8 9 9 10 10
