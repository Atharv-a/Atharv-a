package basics;
import java.util.Arrays;
import java.util.Scanner;

public class binary_search{
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         int n=sc.nextInt();
         int t=sc.nextInt();
         int[] arr=new int[n];
         for(int i=0;i<n;i++)
         {
             arr[i]=sc.nextInt();
         }
         //for now lets use inbuilt method of sorting
           Arrays.sort(arr);
         
        for(int i=0;i<t;i++)
        {
            int min,max,mid;
            min=0;
            max=n;
            mid=n/2;
           int s=sc.nextInt();
         while(true)
         {   if(min>max)
              { 
                  System.out.println("not found");
                  break;
              }
            if(arr[mid]==s)
            {
                System.out.println(mid);
                break;
            }
            else if(arr[mid]<s)
            {
                min=mid+1;
                mid=(max+min)/2;
            }
            else
            {
                max=mid-1;
                mid=(min+max)/2;
            }
         }
        }
  sc.close();

    }
}