//wap to create a array 5 element to store salary of 5 employees then sum the salary and display it.

#include<stdio.h>
#include<conio.h>

int main()
{
	float salary[5]; //declaring an array of 5 elements
	//accepting no. from the user and storing it in an array
	int cnt;
	float sum=0.0f;
	float avg=0.0f;
	for(cnt=0;cnt  < 5 ; cnt++)
	{
		printf("\nenter salary of employee");
		scanf("%f",&salary[cnt]);
		sum=sum + salary[cnt];
	}
	printf("total salary = %f",sum);
	avg=sum / 5;
	printf("\n average salary =%f",avg);
	
	return 0;
}

