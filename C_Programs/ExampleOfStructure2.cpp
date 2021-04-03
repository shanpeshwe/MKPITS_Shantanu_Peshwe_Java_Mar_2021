//declaring structure inside main function

#include<stdio.h>
#include<conio.h>
#include<string.h>

int main()
{
	struct employee
{
	char name[10];
	char gender;
	int age;
};
	//declaring a variable of structure type
	struct employee emp1;
	// emp1.name="ravi"; error will come you cannot assign a string value with =
	//use strcpy function to copy a string
	strcpy(emp1.name,"ravi");
	emp1.gender='m';
	emp1.age=22;
	printf("\n name =%s",emp1.name);
	printf("\n gender=%c",emp1.gender);
	printf("\n age=%d",emp1.age);
		return 0;
	
}

