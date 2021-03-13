#include<stdio.h>
#include<conio.h>
void main()
{
 float n1,n2,n3;
 clrscr();
 printf("enter subject 1 marks : ");
 scanf("%f",&n1);
 printf("enter subject 2 marks : ");
 scanf("%f",&n2);
 printf("enter subject 3 marks : ");
 scanf("%f",&n3);
 printf("Total marks = %f / 300",n1+n2+n3  );
 printf("percentage = %f %",((n1+n2+n3)/300)*100);
 getch();
}