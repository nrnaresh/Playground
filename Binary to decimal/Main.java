#include<stdio.h>
#include<math.h>
int main()
{
  int t1,t,a;
  scanf("%d",&a);
  int i=0;
  while(a>0)
  {t=a%10;
   t*=pow(2,i);
   i++;
   t1+=t;
    a=a/10;
  }
  printf("%d",t1);
  return 0;
}