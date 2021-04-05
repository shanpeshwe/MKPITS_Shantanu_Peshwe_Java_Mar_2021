/*Write a program in C to find the prime numbers within a range of numbers.
Input starting number of range: 1
Input ending number of range : 50
Expected Output :
The prime number between 1 and 50 are :
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
*/

#include<stdio.h>
#include<conio.h>

int main()
{
	int num,rem,sno,eno,cnt;

    printf("Input starting number of range: ");
    scanf("%d",&sno);

    printf("\nInput ending number of range : ");
    scanf("%d",&eno);
    printf("\nThe prime numbers between %d and %d are : \n",sno,eno);
  
    for(num = sno;num<=eno;num++)
    {
    	for (cnt=2;cnt<=num;cnt++)
		{
 			rem=num%cnt;
 			if(rem==0)
 			{
 				break;
			}
		}
		if(cnt==num)
	 	{
	 	printf("%d\t",num);
	 	}
    }  
return 0;
}
