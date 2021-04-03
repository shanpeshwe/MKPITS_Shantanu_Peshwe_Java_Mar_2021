/*create a structure employee having members empno,empname,basicsalary, hra,da,ta,bonus, total salary.
calculate hra 25% of basic
da 35% of basic
ta 85% of basic
bonus =52% of basic
totalsalary =hra+da+ta+bonus +basic.*/

#include<stdio.h>
#include<conio.h>

struct employee
{
	int eno,bsal;
	char name[20];
}e1;

int main()
{
	printf("\nEnter the employee number : ");
	scanf("%d",&e1.eno);
	printf("\nEnter the name : ");
	scanf("%s",&e1.name);
	printf("\nEnter Basic Salary : ");
	scanf("%d",&e1.bsal);
	
	float hra=0.25f*e1.bsal;
	float da=0.35f*e1.bsal;
	float ta=0.85f*e1.bsal;
	float bonus=0.52f*e1.bsal;
	float total=hra+da+ta+bonus+e1.bsal;
	
	//print output
	printf("\nEmployee name : %s",e1.name);
	printf("\nEmployee no : %d",e1.eno);
	printf("\nBasic Salary = %d",e1.bsal);
	printf("\nHRA = %.2f",hra);
	printf("\nTA = %.2f",ta);
	printf("\nDA = %.2f",da);
	printf("\nBonus = %.2f",bonus);
	printf("\nTotal Salary = %.2f",total);
	return 0;
}

