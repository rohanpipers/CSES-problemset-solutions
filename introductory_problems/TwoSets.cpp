#include <bits/stdc++.h>

using namespace std;

int main() {
  int n;
  cin >> n;


  // sum pattern --> n(n+1)/2 --> even*odd/2
  // but half of sum_pattern - even or odd
  // if odd --> division not possible
  // lets since div by 4 is taking place for the determinant
  // take numbers according to 4
  // numbers:     4n      , 4n+1        , 4n+2        , 4n+3
  // sum pattern: 2n(4n+1), (2n+1)(4n+1), (2n+1)(4n+3), (2n+2)(4n+3) 
  // i.e.         even    , odd         , odd         , even
  //
  // lets take 4n pattern
  // 1 2 3 4 5 6 7 8
  // a b b a a b b a ------> sum of sets a and b is same because of pattern
  //
  // lets take 4n+3 pattern
  // 1 2 3   4 5 6 7 8 9 10 11
  // a a b | a b b a a b b  a  --------> initial pattern different

  if(n%4 == 1 || n%4 == 2) {
    cout << "NO\n";
    return 0;
  }

  cout << "YES\n";
  set<int> s1; set<int> s2;
  if(n%2 == 0){
    for(int i = 1; i<=n; i+=4){
      s1.insert(i);
      s1.insert(i+3);
      s2.insert(i+1);
      s2.insert(i+2);
    }
  }
  else{
    s1.insert(1);
    s1.insert(2);
    s2.insert(3);
    for(int i = 4; i<=n; i+=4){
      s1.insert(i);
      s1.insert(i+3);
      s2.insert(i+1);
      s2.insert(i+2);
    }
  }

  cout << s1.size() << endl;
  for(auto it = s1.begin(); it != s1.end(); it++)
    cout << *it << " ";
  cout << endl;
  cout << s2.size() << endl;
  for(auto it = s2.begin(); it != s2.end(); it++)
    cout << *it << " ";
  cout << endl;
  return 0;
}
