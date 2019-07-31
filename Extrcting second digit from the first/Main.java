#include <stdio.h>
int main() {
int a,n;
  scanf("%d",&a);
  while(a/100!=0)
  
  {a=a/10;
  }
  
  n=a%10;
  printf("%d",n);
	return 0;
}