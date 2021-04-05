//Write a program in C to read any Month Number in integer 
//and display Month name in the word.

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
			printf("\nJanuary");
			break;
		case 2:
			printf("\nFebruary");
			break;
		case 3:
			printf("\nMarch");
			break;
		case 4:
			printf("\nApril");
			break;
		case 5:
			printf("\nMay");
			break;
		case 6:
			printf("\nJune");
			break;
		case 7:
			printf("\nJuly");
			break;
		case 8:
			printf("\nAugust");
			break;
		case 9:
			printf("\nSeptember");
			break;
		case 10:
			printf("\nOctober");
			break;
		case 11:
			printf("\nNovember");
			break;
		case 12:
			printf("\nDecember");
			break;	
		default:
			printf("\ninvalid Entry");	
			break;
	}
	return 0;
}
