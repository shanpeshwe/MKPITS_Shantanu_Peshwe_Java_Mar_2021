#include<stdio.h>
#include<conio.h>

void main()
{
 int num,rem=0;
 clrscr();
 printf("Enter a number : ");
 scanf("%d",&num);
 rem = num % 2;
  if 	(rem==0)
		printf("\nNumber is Even");
  else
		printf("\nNumber is odd");
 getch();
}