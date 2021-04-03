//another example of union

#include<stdio.h>
#include<conio.h>
#include<string.h>

union data
{
	int i;
	float j;
	char k[10];
};
int main()
{
	union data d1;
	d1.i=22;
	d1.j=2.2f;
	strcpy(d1.k,"cplus");
	printf("\n value of i=%d",d1.i); // it will print garbage value
	printf("\n value of j=%f",d1.j); //garbaje value 
	printf("\n value of k = %s",d1.k);
	return 0;
}

