//create a function to calculate area of triangle using pointer.

#include<stdio.h>
#include<conio.h>

void calculation(int *b,int*h,float *a)
{
	*a=0.5*(*b**h);
}

int main()
{
	int b,h;
	float a;
	printf("\nEnter the base of triangle : ");
	scanf("%d",&b);
	printf("\nEnter the height : ");
	scanf("%d",&h);
	calculation(&b,&h,&a);
	printf("\nArea of triangle = %f",a);
	return 0;
}
