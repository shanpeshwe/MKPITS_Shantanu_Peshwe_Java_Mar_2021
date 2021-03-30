/*create a function calculate with 3 parameters 
calculate ( int n1, int n2 , char ch)
and display the result . (do with without return type and with return type.)
*/

#include<stdio.h>
#include<conio.h>

int calculate ( int n1, int n2 , char ch)
{
	float res;
	if (ch== '+')
	{
	
		res=(float)n1+n2;
		return res;
	}
	else if (ch=='-')
	{
	
		res=(float)n1-n2;
		return res;
	}
	else if (ch=='*')
	{
		res=(float)n1*n2;
		return res;
	}
	else if (ch=='/')
	{
		res=(float)(n1/n2);
		return res;
	}
	else 
	{
		printf("\nEntered Character is invalid");
	}
}

int main()
{
	int n1,n2;
	float res;
	char ch;
	printf("Enter 2 numbers : ");
	scanf("%d%d",&n1,&n2);
	printf("\nEnter the character + , - , * , / : ");
	fflush(stdin);
	scanf("%c",&ch);
	res=(float)calculate(n1,n2,ch);
	printf("\nThe '%c' of 2 numbers is : %f",ch,res);
	return 0;
}
