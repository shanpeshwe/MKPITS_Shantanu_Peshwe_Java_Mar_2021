// Print50To40UsingWhileLoop.cpp : This file contains the 'main' function. Program execution begins and ends there.

#include <iostream>

int main()
{
    int num = 50;
    while (num >= 40)
    {
        printf("%d\t", num);
        num--;
    }
    return 0;
}