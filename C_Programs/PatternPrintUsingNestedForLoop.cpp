/*wap to print the pattern as given below
	1	2	3
	1	2	3
	1	2	3
using nested for loop*/

#include<stdio.h>
#include<conio.h>

int main()
{
	int a,b;
	for(a=1;a<=3;a++)
	{
		for(b=1;b<=3;b++)
		{
			printf("%d\t",b);
		}
		printf("\n");
	}
	return 0;
}

