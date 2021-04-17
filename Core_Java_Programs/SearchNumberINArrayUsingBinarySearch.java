//Search number in entered array using binary search

import java.util.Scanner;

public class SearchNumberINArrayUsingBinarySearch {
    public static void main(String[] args){
        int[] num=new int[10];
        int cnt,nts;
        int low=0,high=9,mid;
        Scanner sc=new Scanner(System.in);

        for(cnt=0;cnt<10;cnt++)
        {
            System.out.println("Enter the number : ");
            num[cnt]= sc.nextInt();
        }

        System.out.println("Enter Number to Search from 1 to 10 : ");
        nts=sc.nextInt();

        while (low<high){
            mid=(low+high)/2;
            if(num[mid]==nts){
                System.out.println("Number "+nts+" is at position "+mid);
                break;
            }
            else if(num[mid]>nts){
                high=mid;
            }
            else if(num[mid]<nts){
                low=mid;
            }
            }
        }
    }
}
