//Accept 5 subject marks and print total, percentage and grade using for loop

#include<stdio.h>
#include<conio.h>

int main()
{
	int sub,total,cnt;
	float per;
	for(cnt=1;cnt<=5;cnt++)
	{
		printf("\nEnter the marks in subject : ");
		scanf("%d",&sub);
		total=total+sub;
	}
	printf("\n Total marks of 5 subjects : %d / 500",total);
	per=(float)(total*100.0f)/500.0f;
	printf("\nPercentage : %f",per);
	for(per;per<=100 && per>=75;0)
	{
		printf("\n Grade : Distinction");
		break;
	}
	for(per;per<75 && per>=60;0)
	{
		printf("\n Grade : First Division");
		break;
	}
	for(per;per<60 && per>=40;0)
	{
		printf("\n Grade : Second Division");
		break;
	}
	for(per;per<40;0)
	{
		printf("\n Grade : You are Fail");
		break;
	}
	return 0;
}
