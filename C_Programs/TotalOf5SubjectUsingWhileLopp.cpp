// TotalOf5SubjectUsingWhileLopp.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>

int main()
{
    int sub, total = 0, cnt = 1;
    float per;
    while (cnt <= 5)
    {
        printf("\nEnter the Subject Marks out of 100 : ");
        scanf_s("%d", &sub);
        total = total + sub;
        cnt++;
    }
    printf("\nTotal Marks = %d / 500", total);
    per = (total / 500.0f) * 100;
    printf("\nPercentage = %f", per);
    while (per >= 75)
    {
        printf("\nGrade : Distinction");
        per = 0;
    }
    while (per >= 60 && per < 75)
    {
        printf("\nGrade : First Class");
        per = 0;
    }
    while (per >= 40 && per < 60)
    {
        printf("\nGrade : Second Class");
        per = 0;
    }
    while (per < 40 && per>0)
    {
        printf("\nYoy have failed the exam");
        per = 0;
    }
    return 0;
}

// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file
