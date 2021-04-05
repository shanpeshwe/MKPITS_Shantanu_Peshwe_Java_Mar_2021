/*Write a program in C to display the first n terms of Fibonacci series. 
Input number of terms to display : 10
Expected Output :
Here is the Fibonacci series upto to 10 terms :
0 1 1 2 3 5 8 13 21 34 
*/

#include<stdio.h>
#include<conio.h>

int main()
{
	int num,cnt,sum=0,temp=1,a;
	printf("\nEnter the number of terms to display : ");
	scanf("%d",&num);
	
	for(cnt=0;cnt<num;cnt++)
	{
		printf("%d\t",sum);
		a=sum+temp;
		sum=temp;
		temp=a;
	}
	return 0;
}
