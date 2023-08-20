import java.util.ArrayList;

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer>list=new ArrayList();
        int subsum=0;
        int start=0;
        for(int i=0;i<n;i++)
        {
            subsum+=arr[i];
           
            if(subsum>s)
            {
                while(subsum>s)
                
                {
                    subsum-=arr[start];
                    start++;
                    
                    }
                    
                }
                if(subsum==s)
            {
                list.add(start+1);
                list.add(i+1);
                break;
            }
            }
            
        
        
        return list;
    }
}

public class SubArraySum {
    
    
    public static void main(String []args){
        int arr[]={1,3,4,5,5,6};
      int s=10;
      int n=arr.length;
      ArrayList<Integer> list=Solution.subarraySum(arr, n, s);
        System.out.println ("position of element "+(list));

    }
}
