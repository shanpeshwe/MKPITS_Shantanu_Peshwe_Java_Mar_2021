//wap to search an element in an array using binary search algorithm.

#include<stdio.h>
#include<conio.h>

int main()
{
	int num[5]={1,2,3,4,5};
	int low=0,high=4,mid,notosearch;
	printf("\nEnter the number to be searched : ");
	scanf("%d",&notosearch);
	while(low<=high)
	{
		mid=(low+high)/2;
		if (num[mid]==notosearch)
		{
			printf("\nNumber %d is found at position %d",notosearch,mid);
			break;
		}
		else
		{
			if(num[mid]<notosearch)
			{
				low=mid+1;
			}
			if(num[mid]>notosearch)
			{
				high=mid-1;
			}
		}
	}
	if(low>high)
	{
		printf("\nNumber not found in array");
	}
	return 0;
}
