#include <bits/stdc++.h>

using namespace std;

int main() {
  int k;
  cin >> k;
  long long all_pos, invalid_pos, x, i; // x = n*n

  for(i = 1; i <= k; i++){
    x = i*i;
    all_pos = x*(x-1)/2;
    invalid_pos = 4*(i-1)*(i-2);

    cout << all_pos - invalid_pos << endl;
  }

  return 0;
}


// total combinations = n^2 C 2 == ((n*n)*(n*n - 1))/2
// toal number of attacking nights ===> total number of 2x3 and 3x2 blocks present in matrix (x2)
// total number of 2x3 blocks = (n-1)(n-2)
// ................3x2....... = (n-2)(n-1)
// total......................= 2(n-1)(n-2)
// each block has 2 fail positions
// there total invalid positions = 2 * 2(n-1)(n-2)
