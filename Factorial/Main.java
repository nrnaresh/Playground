#include<stdio.h>
long int fact(int n)
{
  if(n==1)
    return 1;
  return n*fact(n-1);
}
int main()
{int a;
 scanf("%d",&a);
 if(a<=0)
 {
   printf("0");
   return 0;
 }
 printf("%ld",fact(a));
	//your code here
 return 0;
}