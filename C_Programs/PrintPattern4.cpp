/*Write a program in C to make such a pattern like right angle triangle with number increased by 1.
The pattern like :

   1
   2 3
   4 5 6
   7 8 9 10
*/

#include<stdio.h>
#include<conio.h>

int main()
{
	int a,b,c=1;
	
	for(a=1;a<=4;a++)
	{
		for(b=1;b<=a;b++)
		{
			printf("%d\t",c++);
		}
		printf("\n");
	}
	return 0;
}   
