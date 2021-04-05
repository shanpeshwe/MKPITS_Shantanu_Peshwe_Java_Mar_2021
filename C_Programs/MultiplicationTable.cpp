//Write a program in C to display the multiplication table of a given integer.

#include <stdio.h>
int main()
{
   int j,n;
   printf("Input any number : ");
   scanf("%d",&n);
   printf("\n");
   for(j=1;j<=10;j++)
   {
     printf("%d X %d = %d \n",n,j,n*j);
   }
   return 0;
} 
