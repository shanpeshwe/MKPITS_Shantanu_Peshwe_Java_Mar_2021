//a  function displaytable(int num) to display the table of that number.

#include<stdio.h>
#include<conio.h>

void displaytable(int num)
{
	int cnt,res;
	for (cnt=1;cnt<=10;cnt++)
	{
		res=cnt*num;
		printf("\n%d\tx\t%d = %d",num,cnt,res);
	}
	
}

int main()
{
	int num;
	printf("Enter any number : ");
	scanf("%d",&num);
	displaytable(num);
	return 0;
}
