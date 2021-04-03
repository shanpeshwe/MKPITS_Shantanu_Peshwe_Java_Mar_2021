//create a structure student having members rno,name ,marks1,marks2 ,marks3 ,total, percentage
//calculate total , percentage and grade.

#include<stdio.h>
#include<conio.h>

struct student
{
	int rno,m1,m2,m3;
	char name[20];
}s1;

int main()
{
	float per;
	int total;
	printf("\nEnter the roll number : ");
	scanf("%d",&s1.rno);
	printf("\nEnter the name : ");
	scanf("%s",&s1.name);
	printf("\nEnter marks 1 : ");
	scanf("%d",&s1.m1);
	printf("\nEnter marks 2 : ");
	scanf("%d",&s1.m2);
	printf("\nEnter marks 3 : ");
	scanf("%d",&s1.m3);
	
	total=s1.m1+s1.m2+s1.m3;
	per=(float)(total/300.0f)*100;
	
	//print output
	printf("\nStudent name : ",s1.name);
	printf("\nStudent roll no : ",s1.rno);
	printf("\nTotal marks = %d / 300",total);
	printf("\nPercentage = %f %",per);
	if(per>=75)
		printf("\nGrade : Distinction");
	else if (per<75 && per>=60)	
		printf("\nGrade : Division 1");
	else if (per<60 && per>=40)	
		printf("\nGrade : Division 2");	
	else if (per<40)	
		printf("\nYou have failed the exam");
	
	return 0;
}
