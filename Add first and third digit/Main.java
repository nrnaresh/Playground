#include<stdio.h>
int main()
{
  int t,a=0,n,cnt=1;
  scanf("%d",&n);
  a+=n%10;
  //printf("%d\n",a);
  n=n/100;
  a+=n%10;
  
  printf("%d",a);
  //Type your code here
  return 0;
}