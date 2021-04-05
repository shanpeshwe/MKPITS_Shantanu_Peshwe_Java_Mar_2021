/*Write a program in C to accept a grade and declare the equivalent description : 
Grade 	Description
E 	Excellent
V 	Very Good
G 	Good
A 	Average
F 	Fail*/

#include<stdio.h>
#include<conio.h>

int main()
{
	char ch;
	printf("\nEnter the Grade from E, V, G, A, F : ");
	scanf("%c",&ch);
	
	if(ch=='E')
		printf("\nGrade %c : Excellent",ch);
	if(ch=='V')
		printf("\nGrade %c : Very Good",ch);
	if(ch=='G')
		printf("\nGrade %c : Good",ch);
	if(ch=='A')
		printf("\nGrade %c : Average",ch);
	if(ch=='F')
		printf("\nGrade %c : Fail",ch);					
	return 0;
}
