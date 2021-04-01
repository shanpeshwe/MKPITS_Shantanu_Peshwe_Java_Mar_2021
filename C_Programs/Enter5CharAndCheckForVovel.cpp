/*wap to create  a character array of 5 elements
accept 5 characters from the user 
and then display each character in a new line.
then search in an array whether a vowel character is present in it or not*/

#include<stdio.h>
#include<conio.h>

int main()
{
	char character[5];
	int cnt;
	for(cnt=0;cnt<5;cnt++)
	{
		printf("\nEnter any character : ");
		scanf("%s",&character[cnt]);
	}
	for(cnt=0;cnt<5;cnt++)
	{
		printf("\nEntered character %d = %c",cnt,character[cnt]);
	}
	for(cnt=0;cnt<5;cnt++)
	{
		if(character[cnt]=='a')
		{
			printf("\nCharacter %c on %d is a vovel",character[cnt],cnt);
		}
		else if(character[cnt]=='e')
		{
			printf("\nCharacter %c on %d is a vovel",character[cnt],cnt);
		}
		else if(character[cnt]=='i')
		{
			printf("\nCharacter %c on %d is a vovel",character[cnt],cnt);
		}
		else if(character[cnt]=='o')
		{
			printf("\nCharacter %c on %d is a vovel",character[cnt],cnt);
		}
		else if(character[cnt]=='u')
		{
			printf("\nCharacter %c on %d is a vovel",character[cnt],cnt);
		}
	}
	
	return 0;
}
