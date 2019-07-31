#include <stdio.h>
int fact(int a)
{int x=1;
  for(int i=1; i<=a;i++)
  {
    x*=i;
  }
 return x;
}
int main() {
  int b=0,t,n,x;
  scanf("%d",&n);
  t=n;
  while(t>0)
  {x=t%10;
   b+=fact(x);  
   t=t/10;
    
  }
   
  
	if(b==n)
    {
      printf("Yes");
    }
  else
    printf("No");
	//Type your code
	return 0;
}