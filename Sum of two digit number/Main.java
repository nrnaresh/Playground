#include<stdio.h>
int main()
{int a,num=0;
   scanf("%d",&a);
 while(a>0)
 {
   num+=a%10;
   a=a/10;
   
 }
 printf("%d",num);
  //Type your code here
  return 0;
}