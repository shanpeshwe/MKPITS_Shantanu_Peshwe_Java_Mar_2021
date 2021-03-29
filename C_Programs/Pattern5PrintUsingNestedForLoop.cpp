/*wap to print the pattern as given below
	1	2	3	
	1	2
	1                         */

#include<stdio.h>
#include<conio.h>

int main()
{
	int a,b;
	for(a=3;a>0;a--)
	{
		for(b=1;b<=a;b++)
		{
		printf("%d\t",b);
		}
		printf("\n");
	}
	
	return 0;
}
