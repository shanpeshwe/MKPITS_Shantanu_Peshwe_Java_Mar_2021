// ConvertDistanceFromKmTo4Other
#include<stdio.h>

int main()
{
	float km, m, cm, in, ft;
	printf("\nEnter Distance in Km : ");
	scanf_s("%f", &km);
	m = km * 1000;
	cm = m * 100;
	in = cm / 2.54;
	ft = in / 12;
	printf("\nDistance in meter = %f", m);
	printf("\nDistance in centimeter = %f", cm);
	printf("\nDistance in inch = %f", in);
	printf("\nDistance in feet = %f",ft );
	return 0;
}