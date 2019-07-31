#include <stdio.h>
int main() {
	int a,n;
  scanf("%d",&n);
  a=n%10;
  while(n/10!=0)
  {n=n/10;
  }
  a+=n%10;
  printf("%d",a);
	return 0;
}