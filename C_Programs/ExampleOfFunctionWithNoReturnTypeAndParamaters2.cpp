/*create function 
	a- calculatetotal(int sub1,int sub2,int sub3)
	b - calculatepercentage(int total)
	c- calculategrade(float per)   
	*/
	
#include<stdio.h>
#include<conio.h>

void calculatepercentage(int total);
void calculategrade(double per);

void calculatetotal(int s1,int s2,int s3)
{
	int total;
	total=s1+s2+s3;
	printf("\nTotal Marks = %d / 300",total);
	calculatepercentage(total);
}

void calculatepercentage(int total)
{
	double per;
	per=(double)(total/300.0f)*100;
	printf("\nPercentage = %lf %",per);
	calculategrade(per);
}

void calculategrade(double per)
{
	if (per>=75)
		printf("\n Grade : Distinction");
	else if(per<75 && per>=40)
		printf("\nGrade : First Division");
	else
		printf("\nFailed");		
}

int main()
{
	int s1,s2,s3;
		printf("enter marks of 3 subjects : ");
		scanf("%d%d%d",&s1,&s2,&s3);
		calculatetotal(s1,s2,s3);
	return 0;
}

