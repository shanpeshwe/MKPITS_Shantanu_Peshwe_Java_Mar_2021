#include<stdio.h>
#include<conio.h>
void main()
{
 char ch;
 clrscr();
 printf("enter the character : ");
 scanf("%c",&ch);
 printf("ch = %c",ch);
 printf("\nenter another character : ");
 ch=getch();
 printf("\nch = %c",ch);
 printf("\nenter another character : ");
 ch=getche();
 printf("\nch = %c",ch);
 getch();

}