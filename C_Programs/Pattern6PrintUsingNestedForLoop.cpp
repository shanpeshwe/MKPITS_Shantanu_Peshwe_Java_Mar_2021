/*wap to print the pattern as given below
	1	3	5	
	1	3	5
	1	3	5
*/

#include<stdio.h>
#include<conio.h>

int main()
{
	int a,b,c=2;
	for(a=1;a<=3;a++)
	{
		for(b=1;b<=5;b=b+2)
		{
			printf("%d\t",b);
		}
		printf("\n");
	}
	return 0;
}
