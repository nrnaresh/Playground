#include<stdio.h>
void main()
{
  int n,t=0,s=0;
  scanf("%d",&n);
  
  while(n>0)
  {
    s+=n%10;
    n/=10;
  }

  while(s>0)
  {

    t+=s%10;
    s=s/10;
  }
  printf("%d",t);
}