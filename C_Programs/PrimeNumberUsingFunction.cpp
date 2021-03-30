//create a function checkprimeno(int num) to check and display wheter the number is prime or not.

#include<stdio.h>
#include<conio.h>

void checkprimeno (int num)
{
	int cnt=2,rem;
	while (cnt<num)
	{
		 rem=num%cnt;
		 if(rem==0)
		 {
		 	break;
		 }
		 cnt++;	 
	}
	if(cnt==num)
	{
		printf("\n%d is a Prime Number",num);
	}
	else
	{
		printf("\n%d is not a Prime Number",num);
	}
	
}

int main()
{
	int num;
	printf("Enter any number :");
	scanf("%d",&num);
	checkprimeno(num);
	return 0;
}
