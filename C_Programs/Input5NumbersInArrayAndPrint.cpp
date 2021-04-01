//create an integer array of 5 elements accept the five no. from the user and store it in an array and then display it using for loop.

#include<stdio.h>
#include<conio.h>

int main()
{
	int num[5]; //declaring an array of 5 elements
	//accepting no. from the user and storing it in an array
	int cnt;
	for(cnt=0;cnt  < 5 ; cnt++)
	{
		printf("\nenter no.");
		scanf("%d",&num[cnt]);
	}
	//display the elements of an array
		for(cnt=0;cnt  < 5 ; cnt++)
	{
	printf("\nnum[%d]= %d",cnt,num[cnt]);
	}
	return 0;
}

