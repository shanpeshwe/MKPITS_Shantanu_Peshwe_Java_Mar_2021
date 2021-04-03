// wap to create a pointer variable ptr and store the address of num variable

#include<stdio.h>
#include<conio.h>
#include<string.h>

int main()
{
	int num=66;
	int *ptr;
	ptr=&num;
//	printf("\n address stored in ptr = %d",ptr);
	printf("\n value stored at address of ptr=%d", *ptr);
}

