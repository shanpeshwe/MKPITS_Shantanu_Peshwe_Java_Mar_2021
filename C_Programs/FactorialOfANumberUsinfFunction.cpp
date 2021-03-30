 //create a function calculatefactorial(int num) to  calculate and display factorial of a number
 
 #include<stdio.h>
 #include<conio.h>
 
 calculatefactorial(int num)
 {
 	int fact=1;
 	do
 	{
 		fact=fact*num;
 		num--;
	}while(num!=0);
 	return fact;
 }
 
 int main()
 {
 	int num,res;
 	printf("Enter any number : ");
 	scanf("%d",&num);
 	res=calculatefactorial(num);
 	printf("\nFactorial of %d is : %d",num,res);
	return 0;
 }
