//wap to create  a array of 5 element then multiply the elements of array and then display it.

#include<stdio.h>
#include<conio.h>

int main()
{
	int num[5]={1,2,3,4,5};
	int cnt,mul=1;
	for(cnt=0;cnt<5;cnt++)
	{
		mul=num[cnt]*mul;
	}
	printf("\nMultiplication of all numbers in array : %d",mul);
	return 0;
}
