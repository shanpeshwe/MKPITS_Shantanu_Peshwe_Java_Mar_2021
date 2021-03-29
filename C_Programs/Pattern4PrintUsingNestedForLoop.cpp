/*wap to print the pattern as given below
	*	
	*	*
	*	*	*    -----------*/
	
	#include<stdio.h>
	#include<conio.h>
	
	int main()
	{
		int a,b;
		for(a=1;a<=3;a++)
		{
			for(b=1;b<=a;b++)
			{
				printf("*\t");
			}
			printf("\n");
		}
		return 0;
	}

