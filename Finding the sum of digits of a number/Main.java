#include <stdio.h>
int main() {
	int a;
  	int n=0;
  scanf("%d",&a);
  while(a>0)
  {
    n+=a%10;
    a=a/10;
  }
  printf("%d",n);
	return 0;
}