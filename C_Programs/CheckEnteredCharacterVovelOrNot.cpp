//Write a C program to check whether an alphabet is a vowel or consonant

#include<stdio.h>
#include<conio.h>

int main()
{
	char ch;
	printf("\nEnter any Character : ");
	scanf("%c",&ch);
	
	if (ch>='a' && ch<='z' || ch>='A'&&ch<='Z')
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		printf("\nEntered character [%c] is a vovel",ch);
		else 
		printf("\nEntered character [%c] is not a vovel",ch);
	else
		printf("\nPlease enter correct character");
	return 0;
}

