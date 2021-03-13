#include<stdio.h>
#include<conio.h>
void main()
{
 char name[20];
 clrscr();
 printf("enter your name : ");
 scanf("%s",&name);
 printf("\nname : %s",name);
 gets (name);
 printf("\nsurname : %s",name);
 getch();
}