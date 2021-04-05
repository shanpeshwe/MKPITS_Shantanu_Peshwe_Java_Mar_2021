//Write a program in C to read any Month Number in integer and 
//display the number of days for this month

#include<stdio.h>
#include<conio.h>

int main()
{
	int m;
	printf("\nEnter any month from 0 to 12 : ");
	scanf("%d",&m);
	
	switch(m)
	{
		case 1:
			printf("\nJanuary : 31 Days");
			break;
		case 2:
			printf("\nFebruary : 28 Days");
			break;
		case 3:
			printf("\nMarch : 31 Days");
			break;
		case 4:
			printf("\nApril : 30 Days");
			break;
		case 5:
			printf("\nMay : 31 Days");
			break;
		case 6:
			printf("\nJune : 30 Days");
			break;
		case 7:
			printf("\nJuly : 31 Days");
			break;
		case 8:
			printf("\nAugust : 31 Days");
			break;
		case 9:
			printf("\nSeptember : 30 Days");
			break;
		case 10:
			printf("\nOctober : 31 Days");
			break;
		case 11:
			printf("\nNovember : 30 Days");
			break;
		case 12:
			printf("\nDecember : 31 Days");
			break;	
		default:
			printf("\ninvalid Entry");	
			break;
	}
	return 0;
}

