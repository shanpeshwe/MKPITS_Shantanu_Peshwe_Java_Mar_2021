// delcare a struture book having members bookno, bookname, author, price

#include<stdio.h>
#include<conio.h>
#include<string.h>

struct book
{
	int bookno;
	char bookname[20];
	char author[20];
	double price;
}b1;
int main()
{
	printf("enter bookno");
	scanf("%d",&b1.bookno);
	printf("\nenter bookname");
	scanf("%s",&b1.bookname);
	printf("\nenter author name");
	scanf("%s",&b1.author);
	printf("\nenter book price");
	scanf("%lf",&b1.price);
	
	//display
	
	printf ("\n book detais are :");
	printf("\n book no. : %d",b1.bookno);
	printf("\n book name : %s",b1.bookname)	;
	printf("\n author : %s",b1.author);
	printf("\n price : %lf",b1.price);	
	return 0;
}

