/*Write a C program to read roll no, name and marks of three subjects and 
calculate the total, percentage and division*/

#include<stdio.h>
#include<conio.h>

int main()
{
	int rno,m1,m2,m3,t;
	float per;
	char name[20];
	printf("\nEnter the name of student : ");
	scanf("%s",&name);
	printf("\nEnter roll number : ");
	scanf("%d",&rno);
	printf("\nEnter 1st subject marks : ");
	scanf("%d",&m1);
	printf("\nEnter 2nd subject marks : ");
	scanf("%d",&m2);
	printf("\nEnter 3rd subject marks : ");
	scanf("%d",&m3);
	
	t=m1+m2+m3;
	per=(float)(t/300.0f)*100;
	
	printf("\nTotal Marks = %d / 300",t);
	printf("\nPercentage = %.2f",per);
	
	if(per>=75)
		printf("\nGrade : Distinction");
	else if(per>=60 && per<75)
		printf("\nGrade : First class");
	else if(per>=40 && per<60)
		printf("\nGrade : Second class");
	else
		printf("\nYou have failed the exam");			
	return 0;
}
