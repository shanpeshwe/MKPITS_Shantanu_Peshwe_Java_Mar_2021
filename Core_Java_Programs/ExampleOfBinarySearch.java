//wap to search an element in an array using binary search algorithm.

import java.util.Scanner;

public class ExampleOfBinarySearch {
    public static void main(String[] args) {
        int[] num ={1,2,3,4,5};
        int low=0,high=4,mid,notosearch;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number to be searched : ");
        notosearch=sc.nextInt();

        while(low<=high) {
            mid=(low+high)/2;
            if (num[mid]==notosearch) {
                System.out.println("Number "+notosearch+" is found at position "+mid);
                break;
            }
            else {
                if(num[mid]<notosearch) {
                    low=mid+1;
                }
                if(num[mid]>notosearch) {
                    high=mid-1;
                }
            }
        }
        if(low>high) {
            System.out.println("Number not found in array");
        }
    }
}
