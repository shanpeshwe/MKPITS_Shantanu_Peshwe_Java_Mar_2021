/*Write a program in C to calculate and print the Electricity bill of a given 
customer. The customer id., name and unit consumed by the user should be taken 
from the keyboard and display the total amount to pay to the customer. 
The charge are as follow : 
Unit 	Charge/unit
upto 199 	@1.20
200 and above but less than 400 	@1.50
400 and above but less than 600 	@1.80
600 and above 	@2.00

If bill exceeds Rs. 400 then a surcharge of 15% will be charged 
and the minimum bill should be of Rs. 100/-*/

#include<stdio.h>
#include<conio.h>

int main()
{
	int cid,uc;
	float total;
	char name[20];
	printf("\nEnter the customer name : ");
	scanf("%s",&name);
	printf("\nEnter the customer ID : ");
	scanf("%d",&cid);
	printf("\nEnter Units consumed : ");
	scanf("%d",&uc);
	
	if(uc<200)
	{
		total=(float)uc*1.20f;		
	}
	else if(uc>=200 && uc<400)
	{
		total=(float)uc*1.50f;
	}
	else if(uc>=400 && uc<600)
	{
		total=(float)uc*1.80f;
	}
	else if(uc>=600)
	{
		total=(float)uc*2.0f;
	}
	printf("\nTotal before surcharge and min bill = %f",total);
	
	if(total<100)
	{
		total=100;
	}
	else if(total>400)
	{
		total=total+(total*0.15);
	}
	
	printf("\nCustomer name : %s",name);
	printf("\nCustomer ID : %d",cid);
	printf("\nTotal Amount : %.2f Rs.",total);
	return 0;
}
