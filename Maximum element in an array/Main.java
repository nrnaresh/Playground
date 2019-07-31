#include<iostream>
using namespace std;
int find(int *a,int s)
{
  int z=-999;
  for(int i=0;i<s;i++)
  {
    if(z<a[i])
      z=a[i];
  }
  return z;
}
int main()
{
  	int *p,n;
  
  cin>>n;
  p=new int(n);
  for(int i=0;i<n;i++)
  {
    cin>>p[i];
  }
  cout<<find(p,n);
}