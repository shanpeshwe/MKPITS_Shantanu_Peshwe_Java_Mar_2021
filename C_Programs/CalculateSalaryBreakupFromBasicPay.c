#include<stdio.h>
#include<conio.h>
void main()
{
 float hra,bsalary,da,ta,tsalary;
 clrscr();
 printf("enter your basic salary : ");
 scanf("%f",&bsalary);
 hra=(17*bsalary)/100;
 printf("\nHRA = %.2f",hra);
 da=(bsalary*28)/100;
 ta=(56*bsalary)/100;
 tsalary=bsalary+hra+da+ta;
 printf("\nDA = %.2f",da);
 printf("\nTA = %.2f",ta);
 printf("\ntotal salary = %.2f",tsalary);
 getch();
}