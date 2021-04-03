//Create a structure product having member product id, product name, price

#include<stdio.h>
#include<conio.h>

struct product
{
	int pid;
	char pname[20];
	int pprice;	
}p1;

int main()
{
	printf("\nEnter the product ID : ");
	scanf("%d",&p1.pid);
	printf("\nEnter product name : ");
	scanf("%s",&p1.pname);
	printf("\nEnter product price : ");
	scanf("%d",&p1.pprice);
	
	//print output
	printf("\nProduct name : %s",p1.pname);
	printf("\nProduct ID : %d",p1.pid);
	printf("\nProduct Rate : %d",p1.pprice);
	return 0;
}
