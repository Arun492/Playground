#include<bits/stdc++.h>
using namespace std;
#define ll long long int
#define MOD 1000000007
ll fact[100005];
int main()
{
  	fact[0] = 1;
    fact[1] = 1;
    for (int i = 1; i < 100005; i++)
    {
        fact[i] = (fact[i - 1] * i) % MOD;
    }
  ll n;
  cin>>n;
  ll a[n];
  for(int i=0;i<n;i++)cin>>a[i];
  int t;
  cin>>t;
  while(t--)
  {
    long l,r;
    cin>>l>>r;
    ll sum =1;
    for(int i=l;i<=r;i++)
      sum=(sum*fact[a[i-1]])%MOD;
    ll res=1;
    for(int i=0;i<r-l;i++)
      res=(res*sum)%MOD;
    cout<<res<<endl;
  }
}