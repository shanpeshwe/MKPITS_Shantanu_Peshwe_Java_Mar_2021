/*wap to sort the elements in an array*/

public class ArraySorting {
    public static void main(String[] args)
    {
        int[] arr=new int[]{4,3,5,1,2};
        int i=0,j=0,temp;
        for(i=0;i<5;i++)
        {
            for(j=i+1;j<5;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(i=0;i<5;i++)
        {
            System.out.print("\t"+arr[i]);
        }
    }
}
