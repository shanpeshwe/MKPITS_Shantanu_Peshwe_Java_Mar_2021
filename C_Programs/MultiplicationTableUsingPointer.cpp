//Create a function to print table of number using pointer.


#include<stdio.h>
#include<conio.h>

void calculate (int *num)
{
	int a,op;
	for(a=1;a<=10;a++)
	{
		op=a**num;
		printf("\n%d\tx\t%d\t= %d",*num,a,op);
	}
}

int main()
{
	int op;
	int num;
	printf("\nEnter any number : ");
	scanf("%d",&num);
		
	calculate(&num);
	
	return 0;
}
