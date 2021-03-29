//wap to accept empno empname and basic_salary then calculate hra (15% of basic salary) , da (25% of basic) , ta (55% of basic) , total salary(basic_Salary + hra + da+ ta)

#include<stdio.h>
#include<conio.h>

int main()
{
	int cnt,empno,basicsal;
	char empname[20];
	float hra,da,ta,totalsal;
	
	printf("Enter the Employment No : ");
	scanf("%d",&empno);
	printf("\nEnter the Employee Name : ");
	scanf("%s",&empname);
	printf("\nEnter the basic salary : ");
	scanf("%d",&basicsal);
	
	hra=0.15f*basicsal;
	da=0.25f*basicsal;
	ta=0.55F*basicsal;
	totalsal=basicsal+hra+ta+da;
	
	printf("\n------------------------------------------------------------------------------------------------------------------------");
	printf("Emp.No.\t Emp.Name\t\t Basic Salary\t\t HRA\t\t DA\t\t TA\t\t Total Salary");
	printf("\n%d\t %s\t\t %d\t\t \t %.2f \t %.2f \t %.2f \t %.2f",empno,empname,basicsal,hra,da,ta,totalsal);
	printf("\n------------------------------------------------------------------------------------------------------------------------");
	return 0;
}
