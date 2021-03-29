/*wap to print the pattern as given below
	1	1	1
	2	2	2
	3	3	3
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
		printf("%d\t",a);
		}
	printf("\n");
	}
	return 0;
}
