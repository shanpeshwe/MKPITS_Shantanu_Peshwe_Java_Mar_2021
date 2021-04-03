//create a union data having int , float and char array.

#include<stdio.h>
#include<conio.h>
#include<string.h>

//inside union if new value is assigned then the old value is replaced by garbage value.

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
	printf("\n value of i=%d",d1.i);
	d1.j=2.2f;
	printf("\n value of j=%f",d1.j);
	strcpy(d1.k,"cplus");
	printf("\n value of k = %s",d1.k);
	return 0;
}

