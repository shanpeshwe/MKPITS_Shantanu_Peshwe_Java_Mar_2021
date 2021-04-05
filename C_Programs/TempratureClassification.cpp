/*Write a C program to read temperature in centigrade and display a suitable 
message
 according to temperature state below 
Temp < 0 then Freezing weather
Temp 0-10 then Very Cold weather
Temp 10-20 then Cold weather
Temp 20-30 then Normal in Temp
Temp 30-40 then Its Hot
Temp >=40 then Its Very Hot */

#include<stdio.h>
#include<conio.h>

int main()
{
	int t;
	printf("\nEnter the temprature in celcius : ");
	scanf("%d",&t);
	
	if(t<0)
		printf("\nFreezing Weather");
	else if(t>=0 && t<10)
		printf("\nVery Cold Temprature");
	else if(t>=10 && t<20)
		printf("\ncold Weather");
	else if(t>=20 && t<30)
		printf("\nTemprature is Normal");
	else if(t>=30 && t<40)
		printf("\nIts Hot");
	else if(t>=40)
		printf("\nIts Very Hot");					
	return 0;
}
