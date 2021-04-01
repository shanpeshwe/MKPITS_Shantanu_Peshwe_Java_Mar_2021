//wap to accept empname , designation and salary and then display it.

#include<stdio.h>
#include<conio.h>

int main()
{
	char name[20],designation[20];
	double salary;
	printf("\nEnter the Employee Name : ");
	scanf("%s",&name);
	printf("\nEnter the Employee Designation : ");
	scanf("%s",&designation);
	printf("\nEnter the Employee Salary : ");
	scanf("%lf",&salary);
	printf("\n employee name is %s",name);
	printf("\n designation is %s",designation);
	printf("\n salary is %lf",salary);

	return 0;
}
