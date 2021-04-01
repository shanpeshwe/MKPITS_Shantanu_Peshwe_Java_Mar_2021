//create character array of 20 elements . accept the name of the user and store it in an array and display it.

#include<stdio.h>
#include<conio.h>

int main()
{
	char name[20];
	printf("Enter the Name : ");
	scanf("%s",&name);
	printf("\nEntered Name is : %s",name);
	return 0;
}
