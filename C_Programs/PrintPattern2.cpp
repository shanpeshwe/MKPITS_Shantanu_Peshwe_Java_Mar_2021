/*Write a program in C to display the pattern like right angle triangle with a number.
The pattern like :

1
12
123
1234
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
			printf("%d\t",b);
		}
		printf("\n");
	}
	return 0;
}
