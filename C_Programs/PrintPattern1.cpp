/*Write a program in C to display the pattern like right angle triangle using an asterisk.
	The pattern like :

*
**
***
****

*/

#include<stdio.h>
#include<conio.h>

int main()
{
	int a,b;
	
	for(a=1;a<=4;a++)
	{
		for(b=1;b<=a;b++)
		{
			printf("*\t");
		}
		printf("\n");
	}
	return 0;
}
