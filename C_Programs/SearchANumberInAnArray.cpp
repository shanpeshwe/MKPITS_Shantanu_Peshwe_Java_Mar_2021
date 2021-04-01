//wap to store 5 no. in an array .
//then accept a no. from the user and search this number in an array.(search an element in an array)

#include<stdio.h>
#include<conio.h>

int main()
{
	int num[5]={1,2,3,4,5};
	int usernum,cnt;
	printf("\nEnter the number to be searched from 1 to 5 : ");
	scanf("%d",&usernum);
	for(cnt=0;cnt<5;cnt++)
	{
		if(num[cnt]==usernum)
		{
			printf("\nnum[%d] = %d",cnt,num[cnt]);
			break;
		}
	}
	if(cnt==5)
	{
		printf("\nNumber is not found in array");	
	}	
	return 0;
}
