#include<stdio.h>
void main()
{
  char a[3][20];
  for(int i=0;i<3;i++)
  {
  scanf("%s",&a[i]);
   }
  for(int i=0;i<3;i++)
  {
    if(i==0)
    {
      for(int j=0;j<strlen(a[i]);j++)
          {
            if(a[i][j]=='a'||a[i][j]=='e'||a[i][j]=='i'||a[i][j]=='o'||a[i][j]=='u')
            {
              a[i][j]='$';
            }
          }
    }
    if(i==1)
    {
      for(int j=0;j<strlen(a[i]);j++)
          {
            if(a[i][j]=='a'||a[i][j]=='e'||a[i][j]=='i'||a[i][j]=='o'||a[i][j]=='u')
            {
                         }
        else
        {a[i][j]='#';
        }
          }
    }
    if(i==2)
    {
      for(int j=0;j<strlen(a[i]);j++)
      {
      a[i][j]=toupper(a[i][j]);
    }}
  }
  printf("%s",a[0]);printf("%s",a[1]);printf("%s",a[2]);
}