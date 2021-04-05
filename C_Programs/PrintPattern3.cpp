/*Write a program in C to make such a pattern like right angle triangle with a number which will repeat a number in a row. 
The pattern like :

 1
 22
 333
 4444
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
			printf("%d\t",a);
		}
		printf("\n");
	}
	return 0;
}
