//Write a program in C to read 10 numbers from keyboard and find their sum and average.

#include<stdio.h>

int main()
{       
    int cnt,n,sum=0;
	float avg;
	printf("Input the 10 numbers : \n");
	for (cnt=1;cnt<=10;cnt++)
	{
        printf("Number-%d :",cnt);
		scanf("%d",&n);
		sum=sum+cnt;
	}
	avg=(float)sum/10.0f;
	printf("The sum of 10 no is : %d\nThe Average is : %.2f\n",sum,avg);
 	return 0;
}

