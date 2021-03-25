// CalculatePerAndGradeOf3SubjectsUsingIfElse.cpp : This file contains the 'main' function. Program execution begins and ends there.

#include<stdio.h>

int main()
{
	int n1, n2, n3,t;
	float per;
	printf("Enter marks of 3 subjects : ");
	scanf_s("%d %d %d",&n1,&n2,&n3);
	t = n1 + n2 + n3;
	per = (float)(t / 300.0f) * 100.0f;
	printf("\nTotal is : %d", t);
	printf("\nPercentage is : %f", per);
	if (per >= 75 && per < 100)
		printf("\n Grade is : Distinction");
	else if (per >= 60 && per < 75)
		printf("\nGrade is : First Division");
	else if (per >= 40 && per < 60)
		printf("\nGrade is : Second Division");
	else
		printf("\nYou have Failed the Exam");
	return 0;
}