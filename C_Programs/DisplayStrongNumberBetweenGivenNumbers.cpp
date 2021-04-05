/*Write a C program to find Strong Numbers within a range of numbers.
Input starting range of number : 1
Input ending range of number: 200
Expected Output :
The Strong numbers are :
1 2 145 */

#include <stdio.h>
int main()  
{  
    int i, n, n1, s1,j,k,en,sn;  
    long fact;
  
    printf("Input starting range of number : ");  
    scanf("%d", &sn);
    printf("Input ending range of number: ");  
    scanf("%d", &en); 
    printf("\n\nThe Strong numbers are :\n"); 

 for(k=sn;k<=en;k++)
   {
     n1=k;
     s1=0;  
 
    for(j=k;j>0;j=j/10) 
    {  
  
        fact = 1;  
          for(i=1; i<=j % 10; i++)  
           {  
            fact = fact * i;  
           }  
            s1 = s1 + fact;  
    }  
  
    if(s1==n1)  
       
        printf("%d  ", n1); 
  }  
        printf("\n\n"); 
  return 0;      
}

