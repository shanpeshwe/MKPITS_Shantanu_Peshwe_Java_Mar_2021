//Write a C program to check whether a character is an alphabet, 
//digit or special character

#include<stdio.h>
#include<conio.h>

int main()
{
	
	char ch;
	printf("\nEnter any Character : ");
	scanf("%c",&ch);
	
	if (ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		printf("\nEntered character [%c] is a alphabate",ch);
	else if (ch>='0' && ch<='9')
		printf("\nEntered character [%c] is a digit",ch);
	else
		printf("\nEntered character [%c] is a special character",ch);		
	return 0;
}
