//Accept salary of 10 and print average salary using for loop

#include<stdio.h>
#include<conio.h>

int main()
{
	int cnt,salary,total=0;
	float avg;
	for(cnt=1;cnt<=10;cnt++)
	{
		printf("\nEnter the Salary of %d Person : ",cnt);
		scanf("%d",&salary);
		total=total+salary;
	}
	avg=(float)total/10;
	printf("\nAverage Salary : %f",avg);
	return 0;
}
