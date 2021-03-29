//Accept 5 subject marks and print total using for loop

#include<stdio.h>
#include<conio.h>

int main()
{
	int sub,total,cnt;
	for(cnt=1;cnt<=5;cnt++)
	{
		printf("\nEnter the marks in subject : ");
		scanf("%d",&sub);
		total=total+sub;
	}
	printf("\n Total marks of 5 subjects : %d / 500",total);
	return 0;
}
