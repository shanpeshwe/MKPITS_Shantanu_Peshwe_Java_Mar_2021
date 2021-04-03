//Create a function to total, percentage using pointers.

#include<stdio.h>
#include<conio.h>

void calculate (int *m1,int *m2,int *m3,int *t,float *p)
{
	*t=*m1+*m2+*m3;
	*p=(*t/300.0f)*100;
}

int main()
{
	int t;
	float p;
	int m1,m2,m3;
	printf("\nEnter the 1 marks : ");
	scanf("%d",&m1);
	printf("\nEnter the 2 marks : ");
	scanf("%d",&m2);
	printf("\nEnter the 3 marks : ");
	scanf("%d",&m3);
	
	calculate(&m1,&m2,&m3,&t,&p);
	
	printf("\nTotal marks = %d/300",t);
	printf("\nPercentage = %.2f ",p);	
	return 0;
}
