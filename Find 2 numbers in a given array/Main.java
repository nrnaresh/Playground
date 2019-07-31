#include<iostream>
using namespace std;

int find(int *n,int a,int s)
{
  static int x=0;
  for(int i=0;i<s;i++)
  {
    if(n[i]==s)
    {  cout<<"Element "<<++x<<" index = "<<i<<'\n';
    return 0;}
  }
  cout<<"Element "<<++x<<" index = -1\n";
  return 0;
}
int main()
{
  	int n,*p,a,b;
  cin>>n;
  p=new int(n);
  for(int i=0;i<n;i++)
  {
    cin>>p[i];
  }
  cin>>a>>b;
  find(p,n,a);
  find(p,n,b);
  return 0;
  
}