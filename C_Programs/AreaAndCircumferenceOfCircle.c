#include<stdio.h>
#include<conio.h>
void main()
{
 float num1,a,c;
 clrscr();
 printf("enter the radius : ");
 scanf("%f",&num1);
 a=3.14f*num1*num1;
 printf("Area of circle is = %f",a);
 c=2*3.14f*num1;
 printf("Circumference is = %f",c);
 getch();
}
