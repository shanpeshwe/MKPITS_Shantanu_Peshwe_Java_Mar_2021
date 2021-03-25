// Interchange Content of 2 variables.cpp
#include<stdio.h>
int main()
{
	int a = 10, b = 8, c;
	printf("\n a : %d and b = %d", a, b);
	c = a + b;
	a = c - a;
	b = c - a;
	printf("\n a : %d and b = %d", a, b);
	return 0;
}