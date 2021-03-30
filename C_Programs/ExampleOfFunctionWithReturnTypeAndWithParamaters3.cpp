//example of calling 3 differnt functions from the main function

#include<stdio.h>
#include<conio.h>

int total(int n1,int n2,int n3)
{
	int total;
	total=n1+n2+n3;
	return (total);
}

double percentage(int total)
{
	double percentage;
	percentage=(double)(total/300.0f)*100;
}

void grade(double per)
{
	if(per>=75)
		printf("\nGrade = Distinction");
	else if (per<75 && per >=40)
		printf("\nGrade = First class");
	else
		printf("\nGrade = Failed");		
}

int main()
{
	int s1,s2,s3,res;
	double per;
	printf("Enter marks of 3 Subject : ");
	scanf("%d%d%d",&s1,&s2,&s3);
	res=total(s1,s2,s3);
	printf("\nTotal Marks = %d",res);
	per=(double)percentage(res);
	printf("\nPercentage = %lf",per);
	grade(per);
	return 0;
}
