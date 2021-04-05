//Write a C program to calculate profit and loss on a transaction.

#include<stdio.h>
#include<conio.h>

int main()
{
	float pp,sp,p,l;
	float pper,lper;
	
	printf("\nEnter purchase price : ");
	scanf("%f",&pp);
	printf("\nEnter selling price : ");
	scanf("%f",&sp);
	
	if (pp<=sp)
	{
		p=sp-pp;
		pper=(float)(p/pp)*100;
		printf("\nProfit = %.2f Rs.",p);
		printf("\nPercent profit = %.2f percent",pper);
	}
	if(sp<pp)
	{
		l=pp-sp;
		lper=(float)(l/pp)*100.0f;
		printf("\Loss = %.2f Rs.",l);
		printf("\nPercent profit = %.2f percent",lper);	
	}
	return 0;
}
