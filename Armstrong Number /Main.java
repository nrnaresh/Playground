#include <stdio.h>
#include<math.h>
int main() {
  int  a=0,n,t;
  scanf("%d",&n);
  t=n;
  for(;n>0;n=n/10)
  {a+=pow((n%10),3);
    
  }
  if(a==t)
  {printf("Armstrong Number\n");
  }
  else
  {printf("Not an Armstrong Number\n");
    
  }
	//Type your code
	return 0;
}