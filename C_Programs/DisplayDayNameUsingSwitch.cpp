// DisplayDayNameUsingSwitch.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <stdio.h>
#include <conio.h>

int main()
{
    int num;
    printf("\nEnter the Day number from 1 to 7 : ");
    scanf_s("%d", &num);
    switch (num)
    {
    case 1:
        printf("\nMonday");
        break;
    case 2:
        printf("\nTuesday");
        break;
    case 3:
        printf("\nWednesday");
        break;
    case 4:
        printf("\nThursday");
        break;
    case 5:
        printf("\nFriday");
        break;
    case 6:
        printf("\nSaturday");
        break;
    case 7:
        printf("\nSunday");
        break;

    default:
        printf("\nInvalid Day Entered");
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
