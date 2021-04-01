//wap to create a float array 0 10 elements to store salary of 10 employees

#include<stdio.h>
#include<conio.h>

int main()
{
	double salary[10];
	int cnt,a;
	for(cnt=0;cnt<10;cnt++)
	{
		printf("\nEnter the salary of %d : ",cnt);
		scanf("%lf",&salary[cnt]);
	}
	for(cnt=0;cnt<10;cnt++)
	{
		printf("\nSalary of [%d] = %.2lf",cnt,salary[cnt]);
	}
	return 0;
}
