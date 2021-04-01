//wap to accept rollno, studentname, marks of 5 subject(in an array)
//then display total,per,grade.

#include<stdio.h>
#include<conio.h>

int main()
{
	char name[20];
	int rollno,marks[5];
	int total=0,cnt;
	float per;
	printf("\nEnter Student Name : ");
	scanf("%s",name);
	printf("\nEnter the roll Number : ");
	scanf("%d",&rollno);
	for(cnt=0;cnt<5;cnt++)
	{
		printf("\nEnter the %d Marks : ",cnt);
		scanf("%d",&marks[cnt]);
		total=total+marks[cnt];
	}
	printf("\nTotal = %d / 500",total);
	per=(float)(total/500.0f)*100.0f;
	printf("\nPercentage = %f %",per);
	if(per>+75)
	{
		printf("\nGrade : Distinction");
	}
	else if(per<75 && per>=60)
	{
		printf("\nGrade : First Class");
	}
	else if (per<60 && per>=35)
	{
		printf("\nGrade : second Class");
	}
	else
	{
		printf("\nYou have failed");
	}
	return 0;
}
