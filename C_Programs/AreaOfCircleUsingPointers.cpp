//create a function calculate to calculate area and circ using pointers

#include<stdio.h>
#include<conio.h>
#include<string.h>

void calculate (int r,float *a,float *c)
{
	*a=3.14f*r*r;
	*c=3.14*2*r;
}

int main()
{
	int r;
	float a,c;
	printf("Enter the radius : ");
	scanf("%d",&r);
	calculate(r,&a,&c);
	printf("\nArea = %f",a);
	printf("\nCircumference = %f",c);
	return 0;
}
