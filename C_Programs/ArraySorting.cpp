/*wap to sort the elements in an array*/

#include<stdio.h>
#include<conio.h>

int main()
{
	int arr[5]={4,3,5,1,2};
	int i=0,j=0,temp;
	for(i=0;i<5;i++)
	{
		for(j=i+1;j<5;j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(i=0;i<5;i++)
	{
		printf("%d\t",arr[i]);
	}
	return 0;
}
