#include <bits/stdc++.h>

using namespace std;

int main() {
  int n, m, k;
  cin >> n >> m >> k;

  int app[n];
  int siz[m];

  for(int i = 0; i < n; i++){
    cin >> app[i];
  }

  for(int i = 0; i < m; i++){
    cin >> siz[i];
  }

  sort(app, app+n);
  sort(siz, siz+m);

  int count = 0, i = 0, j = 0;

  while(i < n && j < m) {
    if(app[i] >= siz[j]-k && app[i] <= siz[j]+k) {
      count++, i++, j++;
    }
    else if(app[i] < siz[j] - k){
      i++;
    }
    else{
      j++;
    }
  }

  cout << count << endl;
  return 0;
}
