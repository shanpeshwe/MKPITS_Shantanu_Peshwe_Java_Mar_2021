/*wap to print the pattern given below
	1
	1	3	
	1	3	5
*/

#include<stdio.h>
#include<conio.h>

int main()
{
	int a,b,c=1;
	for(a=1;a<=3;a++)
	{
		c=c+2;
		for(b=1;b<c;b=b+2)
		{
			printf("%d\t",b);
		}
		printf("\n");
	}
	return 0;
}
