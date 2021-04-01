//wap to create character array of 10 elements and store some value in it.
//and then display each character in a new line

#include<stdio.h>
#include<conio.h>

int main()
{
	char name[10];
	int cnt;
	printf("Enter the name : ");
	scanf("%s",&name);
	for(cnt=0;cnt<10;cnt++)
	{
		printf("\nname[%d] = %c",cnt,name[cnt]);
	}
	return 0;
}

