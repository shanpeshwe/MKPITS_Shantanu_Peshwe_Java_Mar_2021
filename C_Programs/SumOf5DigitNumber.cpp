// SumOf5DigitNumber.cpp
#include<stdio.h>
int main()
{
	int n,n1,n2,n3,n4, a, b, c, d, e,f;
	printf("\nEnter a 5 Digit Number : ");
	scanf_s("%d", &n);
	a = n % 10;
	n1 = n / 10;
	b = n1 % 10;
	n2 = n1 / 10;
	c = n2 % 10;
	n3 = n2 / 10;
	d = n3 % 10;
	n4 = n3 / 10;
	e = n4 % 10;
	f = a + b + c + d + e;
	printf("\nSum of All 5 Digits = %d", f);
	return 0;
}