//wap to create array 10 elements accept 10 no. from the user and store it in an array
//then accept a no. from the user to search in an array.(binary search)(enter number in ascending order)

#include<stdio.h>
#include<conio.h>

int main()
{
	int num[10];
	int cnt,nts;
	int mid,high=9,low=0;
	for(cnt=0;cnt<10;cnt++)
	{
		printf("\nEnter any number : ");
		scanf("%d",&num[cnt]);
	}
	printf("\nEnter the number to search : ");
	scanf("%d",&nts);
	
	while(low<=high)
	{
		mid=(low+high)/2;
		if(num[mid]==nts)
		{
			printf("\nNumber %d is at position : %d",nts,cnt);
			break;
		}
		else
		{
			if(num[mid]<nts)
			{
				low=mid+1;
			}
			if(num[mid]>nts)
			{
				high=mid-1;
			}
		}
	}
	if(low>high)
	{
		printf("\nNumber is not in Array");
	}
	return 0;
}
