//Write a C program to find the sum of first 10 natural numbers.

#include <stdio.h>
int main()
{     
    int i;
	int sum=0;
	for (i=1;i<=10;i++)
	{      
		sum=sum+i;
	}
printf("\nThe sum of first 10 natural numbers = %d",sum);	
return 0;
}

