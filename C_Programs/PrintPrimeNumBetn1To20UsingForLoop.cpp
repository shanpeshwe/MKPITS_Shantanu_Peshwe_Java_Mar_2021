//wap to print prime no between 1 and 20.

#include<stdio.h>
#include<conio.h>

int main()
{
	int n=2, cnt,rem;
	for(cnt=1;cnt<=20;cnt++)
	{
		rem=cnt%n;
		if(rem==0)
		{
			printf("\n%d",cnt);
		}
	}
	return 0;
}
